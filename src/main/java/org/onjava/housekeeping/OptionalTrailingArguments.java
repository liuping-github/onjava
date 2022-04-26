package org.onjava.housekeeping;// housekeeping/OptionalTrailingArguments.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

/**
 * 程序的最后一行显示，可以将0个参数传递给可变参数列表。当有可选的尾随参数时，这很有用：
 */
public class OptionalTrailingArguments {
  static void f(int required, String... trailing) {
    System.out.print("required: " + required + " ");
    for(String s : trailing)
      System.out.print(s + " ");
    System.out.println();
  }
  public static void main(String[] args) {
    f(1, "one");
    f(2, "two", "three");
    f(0);
  }
}
/* Output:
required: 1 one
required: 2 two three
required: 0
*/
