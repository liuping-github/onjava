package org.onjava.operators;

/**
 * @deprecated 方法调用中的别名
 * 将一个对象作为参数传递给方法时，也会产生别名：
 */
class Letter {
    char c;
}

public class PassObject {
    /**
     * 在许多编程语言中，方法f()会在它的作用域内生成参数Letter y的一个副本。但这里因为传递的实际上是一个引用，所以代码
     *  y.c = 'z';
     * 就会改变参数x的值。
     * @param y
     */
    static void f(Letter y) {
        y.c = 'z';
    }
    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("1: x.c: " + x.c);
        //别名问题及其解决办法是个很复杂的话题，《On Java 中文版 进阶卷》1第2章涵盖了这一话题。你现在已经知道了这一点，在以后的使用中请注意这个陷阱。
        f(x);
        // 在方法调用中，别名可以被赋予新的值
        System.out.println("2: x.c: " + x.c);
    }
}