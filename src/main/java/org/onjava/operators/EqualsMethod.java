package org.onjava.operators;

/**
 * 你可能会误以为这种情况下使用==会产生正确的结果，但并不是这样的——它只是单纯比较了引用。
 * 当操作非基本类型时，直接使用equals()似乎是理所当然的选择，不过没有那么简单。考虑类ValA：
 * 在main()中，va1和va2包含相同的i值，但使用equals()比较的结果是false，这令人困惑。
 * 这是因为equals()方法的默认行为是比较引用。如果只想比较内容，你必须像ValB所示的那样重写equals()方法。
 * ValB.equals()方法只包含了解决示例问题所必需的最简代码，但这不是一个恰当的equals()。
 * 注意equals()方法的标准参数是一个Object类型（而不是ValB类型），我们必须通过代码(ValB)o将o强制类型转换为ValB。
 * 然后我们就可以用==直接比较两个i的值了，因为它们是基本类型。
 * 另外，在类型转换前一般要先检查类型，我们暂时先跳过这一点，后面的章节会对此进行讲解。
 */
class ValA {
    int i;
}

class ValB {
    int i;
    // 对这个示例是适用的，但这里并不是一个完整的equals()方法
    public boolean equals(Object o) {
        ValB rval = (ValB)o;  // 将对象o转型为ValB
        return i == rval.i;
    }
}

public class EqualsMethod {
    public static void main(String[] args) {
        ValA va1 = new ValA();
        ValA va2 = new ValA();
        va1.i = va2.i = 100;
        System.out.println(va1.equals(va2));
        ValB vb1 = new ValB();
        ValB vb2 = new ValB();
        vb1.i = vb2.i = 100;
        System.out.println(vb1.equals(vb2));
    }
}