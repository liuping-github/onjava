package org.onjava.housekeeping;// housekeeping/ArrayClassObj.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Creating an array of nonprimitive objects
/**
如果创建了一个非基本类型数组，其实就是创建了一个引用数组。比如包装类型Integer，它是一个类而不是基本类型：
创建一个非基本类型的对象数组
 */
import java.util.Arrays;
import java.util.Random;

public class ArrayClassObj {
  public static void main(String[] args) {
    Random rand = new Random(47);
    Integer[] a = new Integer[rand.nextInt(20)];
    System.out.println("length of a = " + a.length);
    for(int i = 0; i < a.length; i++)
      a[i] = rand.nextInt(500); // Autoboxing
    System.out.println(Arrays.toString(a));
  }
}
/* Output:
length of a = 18
[55, 193, 361, 461, 429, 368, 200, 22, 207, 288, 128,
51, 89, 309, 278, 498, 361, 20]
这里，即便使用了new来创建数组之后：

Integer[] a = new Integer[rand.nextInt(20)];
它还只是一个引用数组，直到通过自动装箱为数组里的每个引用本身初始化了一个Integer对象之后，这个数组的初始化才真正结束：

a[i] = rand.nextInt(500);
如果忘记创建对象，那么在试图使用数组里的引用时，会因值为空而在运行时抛出异常。
*/
