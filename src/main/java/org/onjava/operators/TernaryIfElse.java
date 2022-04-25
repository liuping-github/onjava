package org.onjava.operators;

/**
 * 三元操作符
 * 三元操作符也叫条件操作符，它比较特别，因为有三个操作数。
 * 不过它的确是操作符，因为它最终会生成一个结果值，这与下一章中将介绍的普通if-else语句不同。
 * 三元表达式形式如下：boolean-exp ? value0 : value1
 * 如果boolean-exp运行的结果为true，value0就会被执行，其结果会被当作这个三元操作符的结果值。
 * 如果boolean-exp的结果为false，value1就会被执行，其结果同样会被当作最终结果。
 *
 * 你也可以使用下一章介绍的普通的if-else语句，但三元操作符更加简洁。
 * 该操作符源于C语言，尽管C语言引以为傲的就是它的简洁，且三元操作符引入的部分原因可能就是提高编程效率，但经常使用的话还是要多加小心，因为它很容易产生可读性差的代码。
 *
 * 三元操作符与if-else不同，它会产生一个值。下面是一个对两者进行比较的示例：
 */
public class TernaryIfElse {
    static int ternary(int i) {
        return i < 10 ? i * 100 : i * 10;
    }
    static int standardIfElse(int i) {
        if(i < 10)
            return i * 100;
        else
            return i * 10;
    }
    public static void main(String[] args) {
        System.out.println(ternary(9));
        System.out.println(ternary(10));
        System.out.println(standardIfElse(9));
        System.out.println(standardIfElse(10));
    }
}
/*
与不用三元操作符的standardlfElse()方法里的代码相比，ternary()显得更加紧凑，但standardlfElse()更易于理解，而且也没多打很多字。
所以在选择使用三元操作符时需要仔细思量——它主要用于从两个值中选择一个给变量赋值的场景。
 */