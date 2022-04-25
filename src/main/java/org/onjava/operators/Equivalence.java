package org.onjava.operators;

/**
 * 关系操作符
 *
 * @discussion 关系操作符会根据操作数的值之间的关系生成一个布尔结果。如果关系为真，关系表达式会生成true；如果关系不为真，则生成false。
 * 关系操作符包括小于（<）、大于（>）、小于等于（<=）、大于等于（>=）、等于（==）以及不等于（!=）。
 * 等于和不等于适用于所有的基本数据类型，但其他比较操作不适用于boolean类型。这是因为boolean值只能为true或false, “大于”或“小于”对其没有实际意义。
 * 测试对象是否相等
 * 关系操作符==和!=适用于所有对象，但它们的执行结果可能会让人困惑：
 */
public class Equivalence {
    /**
     * show()方法将==的行为和每个对象都有的equals()方法进行了比较。
     * printf()通过使用指定的符号来对参数进行格式化处理，%d用于int类型参数的输出，%b用于boolean类型的输出，%n用于换行。
     * 对于“不等于”，请使用n1 != n2和!n1.equals(n2)这两种方式。
     * @param desc
     * @param n1
     * @param n2
     */
    static void show(String desc, Integer n1, Integer n2) {
        System.out.println(desc + ":");
        System.out.printf("%d==%d %b %b%n", n1, n2, n1 == n2, n1.equals(n2));
    }

    /**
     * 在test()中，整数值对象以4种不同的方式创建。
     * [1] 自动转换为Integer。这其实是通过对Integer.valueOf()的自动调用来完成的。
     * [2] 使用标准的对象创建语法new。这是以前创建“包装/装箱”Integer对象的首选方法。
     * [3] 从Java 9开始，valueOf()优于[2]。如果尝试在Java 9中使用方式[2]，你将收到警告，并被建议使用[3]代替。很难确定[3]是否的确优于[1]，不过[1]看起来更简洁。
     * [4] 基本类型int也可以当作整数值对象使用。
     * @param value
     */
    //对Java 8而言，@SuppressWarnings("deprecation")并不是必需的，但如果使用Java 9或更新版本编译代码就需要它了
    @SuppressWarnings("deprecation")
    public static void test(int value) {
        Integer i1 = value;                             // [1]
        Integer i2 = value;
        show("Automatic", i1, i2);
        // 在Java 9及更新版本中已被弃用的旧方式：
        Integer r1 = new Integer(value);                // [2]
        Integer r2 = new Integer(value);
        show("new Integer()", r1, r2);
        // Java 9及更新版本中提倡的方式：
        Integer v1 = Integer.valueOf(value);            // [3]
        Integer v2 = Integer.valueOf(value);
        show("Integer.valueOf()", v1, v2);
        // 基本类型不能使用equals()方法:
        int x = value;                                  // [4]
        int y = value;
        // x.equals(y); // 无法编译
        System.out.println("Primitive int:");
        System.out.printf("%d==%d %b%n", x, y, x == y);
    }

    public static void main(String[] args) {
        test(127);
        test(128);
    }
//对于参数值127来说，比较操作产生了预期的结果，不过方式[2]中==操作的结果却是false。
// 这是因为，虽然参与比较的两个引用包含的内容相同，但它们指向了内存中的不同对象。
// 操作符==和!=比较的是对象的引用，而通过不同方式创建的Integer对象，会让操作符产生不同的结果——比如说，方式[1]和方式[3]会生成指向内存中相同位置的Integer对象。
// 对于值范围在-128~127的Integer类型来说，它生成的对象就是这样的3，这影响到了操作符==和!=的比较结果。
// 但在该范围之外的值则不会这样，正如test(128)所演示的那样。
// 在使用Integer的时候，你应该只使用equals()。
// 如果不小心使用了==和!=，并且没有测试-128~127范围外的值，那么虽然你的代码能运行，但在运行中可能悄悄地就会出现错误。
// 如果使用了基本类型int，你就不能使用equals()而必须使用==和!=。
// 如果你开始使用基本类型int，然后更改为包装类型Integer，这可能会导致问题，反之亦然。
// 在Java 9及更新版本中已经弃用new Integer()，因为它的效率远远低于Integer.valueOf()。
// 因此，你应该避免使用new Integer()、new Double()之类的方法，在Java 8中也一样。
// 我之前没有遇到过为了效率而弃用某些东西的例子（也有可能发生过，但这是我第一次有所了解）。
}
