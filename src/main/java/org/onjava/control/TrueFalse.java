package org.onjava.control;// control/TrueFalse.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

/**
 * 控制流
 * 程序控制自己的世界，并做出选择。在Java中，我们通过执行控制语句来做出选择。
 *
 * Java继承了C语言的所有执行控制语句，如果你以前用过C或C++，这里的内容应该非常熟悉。
 * 大多数过程式编程语言有某些形式的控制语句，它们之间经常存在交集。
 * Java控制流相关的关键字包括if-else、while、do-while、for、return、break以及选择语句switch。
 * 不过Java并不支持备受诟病的goto语句（尽管它仍然是解决某些特定问题的最简便办法）。
 * 在Java中，你仍然可以使用类似goto那样的跳转，但是比其他语言里的goto多了很多限制。
 * true和false
 * 所有的条件语句都利用条件表达式的真假来决定执行路径。
 * 例如，a==b就是一个条件表达式。它用条件操作符==来判断a是否等于b。
 * 该表达式返回true或false。
 * 如果你要打印条件表达式的执行结果，展示的将是代表布尔值的字符串“true”或“false”：
 */
public class TrueFalse {
  public static void main(String[] args) {
    System.out.println(1 == 1);
    System.out.println(1 == 2);
  }
}
/* Output:
true
false
上一章中介绍的所有关系操作符都可以用来构造条件语句。
注意Java不允许将数字当作布尔值使用，虽然这在C和C++里是允许的（在这两种语言里，“真”是非零值，“假”是零值）。
如果想在布尔测试中使用一个非布尔值，比如语句if(a)，那你必须先用条件表达式将其转换成布尔值，就像if(a!=0)这样。
*/
