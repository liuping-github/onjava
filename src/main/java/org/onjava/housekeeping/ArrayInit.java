package org.onjava.housekeeping;// housekeeping/ArrayInit.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Array initialization
/**
 * 也可以用花括号包围列表来初始化对象数组。有两种形式：
 * 数组初始化：
 */

import java.util.Arrays;

public class ArrayInit {
  public static void main(String[] args) {
    Integer[] a = { 1, 2, 3, };
    Integer[] b = new Integer[]{ 1, 2, 3, };
    System.out.println(Arrays.toString(a));
    System.out.println(Arrays.toString(b));
  }
}
/* Output:
[1, 2, 3]
[1, 2, 3]
两个数组都使用了自动装箱将 int自动转换为Integer。在这两种形式下，初始值列表的最后一个逗号都是可选的（此功能可以让维护长列表更容易）。
*/
