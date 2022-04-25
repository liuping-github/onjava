package org.onjava.operators;

/**
 * 处理浮点数的时候，你会遇到不同的相等比较问题，这不是Java的问题，而是因为浮点数的本质：
 */
public class DoubleEquivalence {
    static void show(String desc, Double n1, Double n2) {
        System.out.println(desc + ":");
        System.out.printf(
                "%e==%e %b %b%n", n1, n2, n1 == n2, n1.equals(n2));
    }
    @SuppressWarnings("deprecation")
    public static void test(double x1, double x2) {
        // x1.equals(x2) // 无法编译
        System.out.printf("%e==%e %b%n", x1, x2, x1 == x2);
        Double d1 = x1;
        Double d2 = x2;
        show("Automatic", d1, d2);
        Double r1 = new Double(x1);
        Double r2 = new Double(x2);
        show("new Double()", r1, r2);
        Double v1 = Double.valueOf(x1);
        Double v2 = Double.valueOf(x2);
        show("Double.valueOf()", v1, v2);
    }
    public static void main(String[] args) {
        test(0, Double.MIN_VALUE);
        System.out.println("------------------------");
        test(Double.MAX_VALUE,
                Double.MAX_VALUE - Double.MIN_VALUE * 1_000_000);
    }
    //理论上浮点数的比较应该是很严格的——两个数值之间即使只有小数部分有极小的不同，它们仍然应该不相等。
    // test(0, Double.MIN_VALUE)的运行结果就是这样的，其中Double.MIN_VALUE是最小的可表示值。
    // （printf()中的%e表示以科学记数法显示结果）。
    //然而，第二个test()的运行结果却不是这样的，这里参数x2是x1的值减去100万倍的Double.MIN_VALUE。
    // 看起来x2应该与x1明显不同，但这两个数值的比较结果仍然相等。
    // 几乎在所有编程语言中都是这样的，这是因为当一个非常大的数值减去一个相对较小的数值时，非常大的数值并不会发生显著变化。
    // 这叫作舍入误差，这种误差之所以发生，是因为机器不能存储足够的信息来表示一个大数值的微小变化。
}