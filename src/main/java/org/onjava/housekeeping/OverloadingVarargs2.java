package org.onjava.housekeeping;// housekeeping/OverloadingVarargs2.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// {WillNotCompile}

/**
 * 在每种情况下，编译器都使用自动装箱来匹配重载的方法，然后调用最具体的匹配方法。
 *
 * 但是当不带参数调用f()时，编译器就不知道该调用哪一个了。虽然抛出这个错误是可以理解的，但它可能会让程序员感到意外。
 *
 * 你可能试图通过给下面某个方法添加非可变参数来解决这个问题：
 */
public class OverloadingVarargs2 {
  static void f(float i, Character... args) {
    System.out.println("first");
  }
//  static void f(Character... args) {
//    System.out.print("second");
//  }
  public static void main(String[] args) {
    f(1f, 'a');
    f('a', 'b');
  }
}
