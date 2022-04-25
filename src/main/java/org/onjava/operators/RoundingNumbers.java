package org.onjava.operators;

/**
 * 如果想要对结果进行舍入，就需要使用java.lang.Math中的round()方法：
 */
public class RoundingNumbers {
    public static void main(String[] args) {
        //对float和double进行舍入
        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;
        System.out.println("Math.round(above): " + Math.round(above));
        System.out.println("Math.round(below): " + Math.round(below));
        System.out.println("Math.round(fabove): " + Math.round(fabove));
        System.out.println("Math.round(fbelow): " + Math.round(fbelow));
    }
}
/*
round()方法属于java.lang的一部分，因此在使用时不需要额外地导入包。
提升
如果对小于int类型的基本数据类型（即char、byte或者short）执行算术运算或按位运算，运算执行前这些值就会被自动提升为int，结果也是int类型。
如果要把结果赋值给较小的类型，就必须使用强制类型转换（由于把值赋给了较小的类型，可能会出现信息丢失）。
通常，表达式里出现的最大的数据类型决定了表达式最终结果的数据类型。
如果将一个float类型的值与一个double类型的值相乘，结果就是double类型。如果将一个int值和一个long值相加，则结果为long类型。
 */