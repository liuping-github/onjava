package org.onjava.housekeeping;// housekeeping/OverloadingVarargs.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

/**
 * 在每种情况下，编译器都使用自动装箱来匹配重载的方法，然后调用最具体的匹配方法。
 *
 * 但是当不带参数调用f()时，编译器就不知道该调用哪一个了。虽然抛出这个错误是可以理解的，但它可能会让程序员感到意外。
 */
public class OverloadingVarargs {
  static void f(Character... args) {
    System.out.print("first");
    for(Character c : args)
      System.out.print(" " + c);
    System.out.println();
  }
  static void f(Integer... args) {
    System.out.print("second");
    for(Integer i : args)
      System.out.print(" " + i);
    System.out.println();
  }
  static void f(Long... args) {
    System.out.println("third");
  }
  public static void main(String[] args) {
    f('a', 'b', 'c');
    f(1);
    f(2, 1);
    f(0);
    f(0L);
    //- f(); // Won't compile -- ambiguous
  }
}
/* Output:
first a b c
second 1
second 2 1
second 0
third
*/
