package org.onjava.control;// control/ForInString.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

/**
 * 任何返回了数组的方法都可以使用for-in。
 * 例如，String类有一个toCharArray()方法，它返回了一个char数组，因此你可以很容易地迭代字符串里的所有字符：
 */
public class ForInString {
  public static void main(String[] args) {
    for(char c : "An African Swallow".toCharArray())
      System.out.print(c + " ");
  }
}
/* Output:
A n   A f r i c a n   S w a l l o w

在第12章中你会看到，for-in还可以用于任何Iterable对象。

许多for语句会在一个整数值序列中步进，就像下面这样：
for(int i = 0; i < 100; i++)
对于这些语句，for-in语法不起作用，因为你需要先创建一个int数组。
为了简化这些任务，我在onJava.Range包里创建了一个range()方法，它会自动生成合适的数组。
*/
