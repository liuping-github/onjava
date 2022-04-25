package org.onjava.control;// control/WhileTest.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Demonstrates the while loop

/**
 * 迭代语句
 * while、do-while和for用来控制循环，它们也叫作迭代语句（iteration statement）。
 * 迭代语句会重复执行，直到起控制作用的布尔表达式结果变为false。while循环的格式如下：
 *
 * while(Boolean-expression)
 *     statement
 * 在循环刚开始时会计算一次布尔表达式的值，而在下一次迭代之前会再计算一次。
 *
 * 下面的例子会一直生成随机数，直到满足特定条件为止：
 */
public class WhileTest {
  static boolean condition() {
    boolean result = Math.random() < 0.99;
    System.out.print(result + ", ");
    return result;
  }
  public static void main(String[] args) {
    while(condition())
      System.out.println("Inside 'while'");
    System.out.println("Exited 'while'");
  }
}
/* Output: (First and Last 5 Lines)
true, Inside 'while'
true, Inside 'while'
true, Inside 'while'
true, Inside 'while'
true, Inside 'while'
...________...________...________...________...
true, Inside 'while'
true, Inside 'while'
true, Inside 'while'
true, Inside 'while'
false, Exited 'while'
condition()方法使用了Math库里的静态方法random()。该方法会生成一个范围为0~1（包括0，但不包括1）的double值。
返回的结果是一个布尔值，通过比较操作符<产生。while条件表达式的意思是“重复执行循环里的主体语句，直到condition()方法返回false”。
5.3.1　do-while
do-while语句的格式如下：

do
  statement
while(Boolean-expression);
while和do-while的唯一的区别是do-while中的语句至少会执行一次，即便表达式的第一次计算结果就是false。
而在while中，如果条件表达式第一次得出的值就是false，则它的语句根本不会执行。在日常使用中，while要比do-while更常用一些。

5.3.2　for
for循环可能是最常用的迭代形式，这种循环在第一次迭代前会先进行初始化，然后再进行条件测试。在每次迭代结束后，还会有某些形式的“步进”。
for循环的格式如下：
for(initialization; Boolean-expression; step)
  statement
上面的初始化表达式（initialization）、布尔表达式（Boolean-expression）和步进（step）都可以为空。每次迭代前会测试布尔表达式。
只要结果是false，就不再循环，而是执行跟在for循环后面的语句。每次循环结束，都会执行一次步进。
*/
