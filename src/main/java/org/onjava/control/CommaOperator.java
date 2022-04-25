package org.onjava.control;// control/CommaOperator.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
/**
逗号操作符
逗号操作符不是逗号分隔符，逗号分隔符用来分隔声明和函数的不同参数，而Java里唯一用到逗号操作符的地方就是for循环的控制表达式。
在控制表达式的初始化和步进部分，都可以使用一系列由逗号分隔的语句，而这些语句会按先后顺序执行。
通过使用逗号操作符，你可以在for语句里定义多个变量，但它们必须是相同的类型。
 */
public class CommaOperator {
  public static void main(String[] args) {
    for(int i = 1, j = i + 10; i < 5; i++, j = i * 2) {
      System.out.println("i = " + i + " j = " + j);
    }
  }
}
/* Output:
i = 1 j = 11
i = 2 j = 4
i = 3 j = 6
i = 4 j = 8
以上for语句里的int参数定义包括i和j，在初始化部分可以定义同一个类型的任意数量的变量。
在控制表达式里定义多个变量的能力只限于for循环，在其他任何选择或迭代语句中都不能使用这种方式。
在初始化和步进部分，语句都是按先后顺序执行的。

*/
