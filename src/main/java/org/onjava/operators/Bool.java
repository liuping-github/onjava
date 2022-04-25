package org.onjava.operators;

import java.util.Random;

/**
 * 逻辑操作符
 * 逻辑操作符“与”（&&）、“或”（||）和“非”（!）可以根据参数的逻辑关系，生成一个true或false的布尔值结果。
 * 下面这个示例就使用了关系操作符和逻辑操作符。
 */
public class Bool {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i = rand.nextInt(100);
        int j = rand.nextInt(100);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("i > j is " + (i > j));
        System.out.println("i < j is " + (i < j));
        System.out.println("i >= j is " + (i >= j));
        System.out.println("i <= j is " + (i <= j));
        System.out.println("i == j is " + (i == j));
        System.out.println("i != j is " + (i != j));
        // 在Java中，把int类型当作boolean类型并不合法：
        //- System.out.println("i && j is " + (i && j));
        //- System.out.println("i || j is " + (i || j));
        //- System.out.println("!i is " + !i);
        System.out.println("(i < 10) && (j < 10) is "
                + ((i < 10) && (j < 10)) );
        System.out.println("(i < 10) || (j < 10) is "
                + ((i < 10) || (j < 10)) );
    }
    //“与”“或”“非”操作只可应用于布尔值。
    // 你不能像C及C++中那样，在逻辑表达式中将一个非布尔值当作布尔值使用。
    // 代码里用//-注释掉的语句就  是这种错误的尝试。
    // 后面的表达式先使用关系比较操作符来生成布尔值结果，然后再对生成的布尔值进行逻辑运算。
    //注意，如果在应该使用字符串的地方使用了布尔值，布尔值会自动转换成合适的文本格式。
    
}
