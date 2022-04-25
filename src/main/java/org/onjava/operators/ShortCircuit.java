package org.onjava.operators;

/**
 * 短路
 * 逻辑操作符支持一种称为“短路”的现象。
 * 一旦表达式当前部分的计算结果能够明确无误地确定整个表达式的值，表达式余下部分就不会被执行了。
 * 因此，逻辑表达式后面的部分有可能不被执行。下面是演示短路现象的示例：
 */
public class ShortCircuit {
    static boolean test1(int val) {
        System.out.println("test1(" + val + ")");
        System.out.println("result: " + (val < 1));
        return val < 1;
    }
    static boolean test2(int val) {
        System.out.println("test2(" + val + ")");
        System.out.println("result: " + (val < 2));
        return val < 2;
    }
    static boolean test3(int val) {
        System.out.println("test3(" + val + ")");
        System.out.println("result: " + (val < 3));
        return val < 3;
    }
    public static void main(String[] args) {
        boolean b = test1(0) && test2(2) && test3(2);
        System.out.println("expression is " + b);
    }
    /*
    每个测试方法都会对传入参数进行比较，并返回true或false。这些方法还会把信息打印出来，以表示自己正在被调用。这些测试方法被用在了下面的表达式中：
    testl(0) && test2(2) && test3(2)
    你可能会很自然地认为这三个测试都会执行，但输出显示并不是这样的。
    第一个测试生成的结果是true，所以表达式继续执行。但第二个测试生成了false。
    这就意味着整个表达式肯定为false，所以剩余的表达式就没必要继续执行了，
    它可能会很耗费资源。事实上，之所以存在短路，就是因为如果逻辑表达式有一部分不必计算，那我们就能获得潜在的性能提升。
     */
}
