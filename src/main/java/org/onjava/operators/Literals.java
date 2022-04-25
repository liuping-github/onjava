package org.onjava.operators;

/**
 * 字面量
 * 一般来说，如果程序里使用了一个字面量（literal value），则编译器能准确地知道它是什么类型的。
 * 不过当类型模棱两可的时候，你就必须使用与该字面量相关的一些字符，以此添加额外信息来引导编译器。
 * 下面这段代码展示了这些字符。
 */
public class Literals {
    public static void main(String[] args) {
        int i1 = 0x2f; // 十六进制（小写）
        System.out.println("i1: " + Integer.toBinaryString(i1));
        int i2 = 0X2F; // 十六进制（大写）
        System.out.println("i2: " + Integer.toBinaryString(i2));
        int i3 = 0177; // 八进制（前置0）
        System.out.println("i3: " + Integer.toBinaryString(i3));
        char c = 0xffff; // char类型的最大十六进制值
        System.out.println("c: " + Integer.toBinaryString(c));
        byte b = 0x7f; // byte类型的最大十六进制值
        System.out.println("b: " + Integer.toBinaryString(b));
        short s = 0x7fff; // short类型的最大十六进制值
        System.out.println("s: " + Integer.toBinaryString(s));
        long n1 = 200L; // long类型后缀
        long n2 = 200l; // long类型后缀（很容易让人困惑）
        long n3 = 200;
        // Java 7的二进制字面量：
        byte blb = (byte) 0b00110101;
        System.out.println("blb: " + Integer.toBinaryString(blb));
        short bls = (short) 0B0010111110101111;
        System.out.println("bls: " + Integer.toBinaryString(bls));
        int bli = 0b00101111101011111010111110101111;
        System.out.println("bli: " + Integer.toBinaryString(bli));
        long bll = 0b00101111101011111010111110101111;
        System.out.println("bll: " + Long.toBinaryString(bll));
        float f1 = 1;
        float f2 = 1F; // float类型后缀
        float f3 = 1f; // float类型后缀
        double d1 = 1d; // double类型后缀
        double d2 = 1D; // double类型后缀
        // （十六进制和八进制也都能作为long类型使用）
    }
    /*
    字面量的后缀字符标识了它的类型。
    大写（或小写）的字符L表示long类型（不过使用小写的l容易让人迷惑，因为它看起来就像数字1）。
    大写（或小写）的字符F表示float类型。大写（或小写）的字符D表示double类型。
    十六进制数适用于所有整数类型，通过0x或0X后面跟随数字0~9或大小写的字符a~f来表示。
    如果你试图将一个变量初始化为超出其自身表示范围的值（无论这个值的数值表示形式如何），编译器会报告一条错误信息。
    注意，在前面的代码里已经给出了char、byte和short所能表示的最大十六进制值。
    如果超出范围，编译器会自动将其转换成int型，并告诉你这次赋值需要进行“窄化转型”（转型将在本章稍后部分讲解）。这时候就能知道你已经越界了。
    八进制数由前缀0和后面的数字0~7来表示。
    Java 7引入了二进制字面量，通过前缀0b或0B来表示，它适用于所有整数类型。
    在使用整数类型的值时，二进制形式的表示会非常方便。通过使用Integer和Long类的静态方法toBinaryString()可以很容易实现。
    注意，如果将比较小的类型传递给Integer.toBinaryString()方法，则该类型会自动被转换为int类型。
     */
}
