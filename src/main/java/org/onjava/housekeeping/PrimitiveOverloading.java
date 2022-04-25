package org.onjava.housekeeping;// housekeeping/PrimitiveOverloading.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Promotion of primitives and overloading

/**
 * 使用基本类型的重载
 * 基本类型可以从较小类型自动提升到较大类型，这个过程与重载相结合后可能会让人迷惑。
 * 下面这个示例就展示了将基本类型传递给重载方法时会发生什么：
 * 基本类型提升与重载
 */
public class PrimitiveOverloading {
    public static void main(String[] args) {
        PrimitiveOverloading p = new PrimitiveOverloading();
        p.testConstVal();
        p.testChar();
        p.testByte();
        p.testShort();
        p.testInt();
        p.testLong();
        p.testFloat();
        p.testDouble();
    }

    void f1(char x) {
        System.out.print("f1(char) ");
    }

    void f1(byte x) {
        System.out.print("f1(byte) ");
    }

    void f1(short x) {
        System.out.print("f1(short) ");
    }

    void f1(int x) {
        System.out.print("f1(int) ");
    }

    void f1(long x) {
        System.out.print("f1(long) ");
    }

    void f1(float x) {
        System.out.print("f1(float) ");
    }

    void f1(double x) {
        System.out.print("f1(double) ");
    }

    void f2(byte x) {
        System.out.print("f2(byte) ");
    }

    void f2(short x) {
        System.out.print("f2(short) ");
    }

    void f2(int x) {
        System.out.print("f2(int) ");
    }

    void f2(long x) {
        System.out.print("f2(long) ");
    }

    void f2(float x) {
        System.out.print("f2(float) ");
    }

    void f2(double x) {
        System.out.print("f2(double) ");
    }

    void f3(short x) {
        System.out.print("f3(short) ");
    }

    void f3(int x) {
        System.out.print("f3(int) ");
    }

    void f3(long x) {
        System.out.print("f3(long) ");
    }

    void f3(float x) {
        System.out.print("f3(float) ");
    }

    void f3(double x) {
        System.out.print("f3(double) ");
    }

    void f4(int x) {
        System.out.print("f4(int) ");
    }

    void f4(long x) {
        System.out.print("f4(long) ");
    }

    void f4(float x) {
        System.out.print("f4(float) ");
    }

    void f4(double x) {
        System.out.print("f4(double) ");
    }

    void f5(long x) {
        System.out.print("f5(long) ");
    }

    void f5(float x) {
        System.out.print("f5(float) ");
    }

    void f5(double x) {
        System.out.print("f5(double) ");
    }

    void f6(float x) {
        System.out.print("f6(float) ");
    }

    void f6(double x) {
        System.out.print("f6(double) ");
    }

    void f7(double x) {
        System.out.print("f7(double) ");
    }

    void testConstVal() {
        System.out.print("5: ");
        f1(5);
        f2(5);
        f3(5);
        f4(5);
        f5(5);
        f6(5);
        f7(5);
        System.out.println();
    }

    void testChar() {
        char x = 'x';
        System.out.print("char: ");
        f1(x);
        f2(x);
        f3(x);
        f4(x);
        f5(x);
        f6(x);
        f7(x);
        System.out.println();
    }

    void testByte() {
        byte x = 0;
        System.out.print("byte: ");
        f1(x);
        f2(x);
        f3(x);
        f4(x);
        f5(x);
        f6(x);
        f7(x);
        System.out.println();
    }

    void testShort() {
        short x = 0;
        System.out.print("short: ");
        f1(x);
        f2(x);
        f3(x);
        f4(x);
        f5(x);
        f6(x);
        f7(x);
        System.out.println();
    }

    void testInt() {
        int x = 0;
        System.out.print("int: ");
        f1(x);
        f2(x);
        f3(x);
        f4(x);
        f5(x);
        f6(x);
        f7(x);
        System.out.println();
    }

    void testLong() {
        long x = 0;
        System.out.print("long: ");
        f1(x);
        f2(x);
        f3(x);
        f4(x);
        f5(x);
        f6(x);
        f7(x);
        System.out.println();
    }

    void testFloat() {
        float x = 0;
        System.out.print("float: ");
        f1(x);
        f2(x);
        f3(x);
        f4(x);
        f5(x);
        f6(x);
        f7(x);
        System.out.println();
    }

    void testDouble() {
        double x = 0;
        System.out.print("double: ");
        f1(x);
        f2(x);
        f3(x);
        f4(x);
        f5(x);
        f6(x);
        f7(x);
        System.out.println();
    }
}
/* Output:
5: f1(int) f2(int) f3(int) f4(int) f5(long) f6(float) f7(double)
char: f1(char) f2(int) f3(int) f4(int) f5(long) f6(float) f7(double)
byte: f1(byte) f2(byte) f3(short) f4(int) f5(long) f6(float) f7(double)
short: f1(short) f2(short) f3(short) f4(int) f5(long) f6(float) f7(double)
int: f1(int) f2(int) f3(int) f4(int) f5(long) f6(float) f7(double)
long: f1(long) f2(long) f3(long) f4(long) f5(long) f6(float) f7(double)
float: f1(float) f2(float) f3(float) f4(float) f5(float) f6(float) f7(double)
double: f1(double) f2(double) f3(double) f4(double) f5(double) f6(double) f7(double)
如果传入数据的类型比方法参数的类型更宽，就必须使用窄化转型，否则编译器会报错。
通过返回值区分重载方法
你可能会想：“为什么只通过参数列表来区分重载方法？为什么不根据方法的返回值来区分？”比如下面定义的两个方法虽然具有相同的名字和参数，但很容易就能通过返回值区分开来：

void f() {}
int f() { return 1; }
只有编译器能从上下文中明确地判断出语句的含义，这种方式才是可行的。
比如在int x = f()中，x的类型能够告诉编译器，我们想要调用哪个版本的f()，但还可以调用f()并忽略它的返回值。
这被称为调用方法的副作用，此时我们不关心返回值，而只是想要方法调用的其他效果。因此，如果这样调用方法：

f();
此时Java如何确定应该调用哪个f()？阅读代码的人又该如何理解它呢？由于存在这些问题，我们不能使用返回值类型来区分重载方法。
*/
