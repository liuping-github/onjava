package org.onjava.operators;
/**
 在char、byte和short中，你可以看到算术操作符对数据类型的提升效果。
 对这些类型进行任何算术运算，都会获得一个int结果，如果想把这个结果赋给原来的类型，则必须显式地进行类型转换（窄化转型可能会造成信息丢失）。
 对于int值则不需要进行类型转化，因为所有数据都已经是int类型的了。
 但不要误以为一切都是安全的，如果对两个足够大的int数值执行乘法运算，结果可能会溢出。
 下面这个示例展示了这一点：
 */
public class Overflow {
    public static void main(String[] args) {
        int big = Integer.MAX_VALUE;
        System.out.println("big = " + big);
        int bigger = big * 4;
        System.out.println("bigger = " + bigger);
    }
}
/*
这里编译器不会有错误提示或警告信息，运行时也不会出现异常。

对于char、byte或者short，复合赋值并不需要类型转换。
尽管它们都会做类型提升，并获得与直接算术运算相同的结果。
而省略类型转换肯定使代码更简洁了。

除boolean类型以外，任何基本类型都可以转换为其他基本类型。
再次提醒，当某种类型转换成一种较小的类型时，你必须了解窄化转型的效果，否则可能会在类型转换过程中不知不觉地丢失了信息。
 */