package org.onjava.housekeeping;// housekeeping/ArrayNew.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Creating arrays with new
/**
 * 动态数组创建
 * 如果在编写程序时不知道数组中需要多少个元素，那该怎么办？只需使用new来创建数组中的元素即可。
 * 即使是基本类型数组，也可以使用new来创建（new不能创建一个非数组的基本类型）：
 */

import java.util.Arrays;
import java.util.Random;

public class ArrayNew {
  public static void main(String[] args) {
    int[] a;
    Random rand = new Random(47);
    a = new int[rand.nextInt(20)];
    System.out.println("length of a = " + a.length);
    System.out.println(Arrays.toString(a));
  }
}
/* Output:
length of a = 18
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
数组的大小是通过Random.nextInt()方法随机生成的，该方法会产生一个介于0和方法参数之间的值。
由于这种随机性，显然数组的创建实际上是发生在运行时的。
此外，程序的输出显示了数组里的基本类型元素会自动初始化为空值（对于数值类型和char是0，对于boolean则是false）。

Arrays.toString()方法属于java.util标准库，它会生成一维数组的可打印版本。

数组也可以在同一语句里定义和初始化：

int[] a = new int[rand.nextInt(20)];
这是执行此操作的首选方式，应该尽量这样使用。
*/
