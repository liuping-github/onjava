package org.onjava.housekeeping;// housekeeping/InitialValues2.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Providing explicit initial values
/*
public class InitialValues2 {
  public static void main(String[] args) {
    System.out.println(new InitialValues2().f);
  }
  // Initial value for f is 0
  private final int f = 0;
}
指定初始化
如何给一个变量赋初始值呢？一种直接的方法就是在类中定义变量时分配值。以下代码更改了类InitialValues中的字段定义，直接提供了初始值
 */
public class InitialValues2 {
  boolean bool = true;
  char ch = 'x';
  byte b = 47;
  short s = 0xff;
  int i = 999;
  long lng = 1;
  float f = 3.14f;
  double d = 3.14159;
  public static void main(String[] args) {
    System.out.println(new InitialValues2().f);
  }
}
