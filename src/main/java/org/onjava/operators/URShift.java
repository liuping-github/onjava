package org.onjava.operators;

/**
 * 移位操作符
 * 移位操作符也操纵二进制位，它们只能用来处理基本类型里的整数类型。
 * 左移位操作符（<<）会将操作符左侧的操作数向左移动，移动的位数在操作符右侧指定（低位补0）。
 * “有符号”的右移位操作符（>>）则按照操作符右侧指定的位数将操作符左侧的操作数向右移动。
 * “有符号”的右移位操作符使用了“符号扩展”：如果符号为正，则在高位插入0，否则在高位插入1。
 * Java还新增加了一种“无符号”的右移位操作符（>>>），它使用“零扩展”：无论符号为正还是为负，都在高位插入0。
 * 这一操作符是C或C++中所没有的。
 *
 * 如果对char、byte或者short类型的数值进行移位运算，在移位操作前它们会被转换为int类型，并且结果也是int类型。
 * 右端的可移位数中只会用到低5位。这样可防止我们移位超过int型值所具有的位数。如果处理的是long类型，最后得到的结果也是long类型。
 * 此时只会用到右端指定移位数值的低6位，这样移位操作就不会超出long类型的最大位数。
 *
 * 移位操作符可以与等号组合使用（<<=、>>=或>>>=）。
 * 操作符左边的值会移动右边指定的位数，然后再将得到的结果赋给左边的变量。
 * 但“无符号”右移位操作符结合赋值操作符可能会遇到一个问题：如果对byte或short值进行移位运算，得到的可能不是正确的结果。
 * 它们会先被提升为int类型，进行右移操作，然后在被赋回给原来的变量时被截断，这时得到结果是-1。
 * 下面是一个示例：
 */
public class URShift {
    public static void main(String[] args) {
        int i = -1;
        System.out.println(Integer.toBinaryString(i));
        i >>>= 10;
        System.out.println(Integer.toBinaryString(i));
        long l = -1;
        System.out.println(Long.toBinaryString(l));
        l >>>= 10;
        System.out.println(Long.toBinaryString(l));
        short s = -1;
        System.out.println(Integer.toBinaryString(s));
        s >>>= 10;
        System.out.println(Integer.toBinaryString(s));
        byte b = -1;
        System.out.println(Integer.toBinaryString(b));
        b >>>= 10;
        System.out.println(Integer.toBinaryString(b));
        b = -1;
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(b>>>10));
    }
}
/*
在最后一个移位运算中，结果没有赋回给b，而是直接打印了出来，所以是正确的。
 */
