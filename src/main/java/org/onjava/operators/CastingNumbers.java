package org.onjava.operators;

/**
 * 截尾和舍入
 * 在执行窄化转型时，你必须注意截尾与舍入问题。
 * 比如，如果将一个浮点值转换为整型，Java会如何处理？将29.7转换为int，结果是30还是29？下面的示例中给出了答案：
 */
public class CastingNumbers {
    //// 将float或double转型为整型值时会发生什么
    public static void main(String[] args) {
        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;
        System.out.println("(int)above: " + (int)above);
        System.out.println("(int)below: " + (int)below);
        System.out.println("(int)fabove: " + (int)fabove);
        System.out.println("(int)fbelow: " + (int)fbelow);
    }
    //答案是将float或double转型为整型值时，总是对该数值执行截尾。
    //这意味着，如果你将29.7转换为int，结果是30，而不是29。
    //如果你将29.7转换为int，结果是30，而不是29。

}
