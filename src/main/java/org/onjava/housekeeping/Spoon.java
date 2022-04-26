package org.onjava.housekeeping;

// housekeeping/Spoon.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
/*
6.7.3　显式的静态初始化
Java允许在一个类里将多个静态初始化语句放在一个特殊的“静态子句”里（有时称为静态块）。它看起来像这样：
static {
  ...
}
这样的语句可以被执行多次，但是只有第一次被执行。
这种方法可以被用来在类加载时初始化一些静态变量，或者是为了防止线程安全问题。
如果一个类有多个静态初始化语句，那么它们将被按照它们出现的顺序执行。
下面的例子演示了如何使用静态初始化语句。

public class Spoon {
  static int counter = 0;
  static {
    System.out.println("Initializing counter");
    counter = 47;
  }
  public static void main(String[] args) {
    System.out.println("counter = " + counter);
  }
}
 */
public class Spoon {
  static int i;
  static {
    i = 47;
  }
  static int counter = 0;
  static {
    System.out.println("Initializing counter");
    counter = 47;
  }
  public static void main(String[] args) {
    System.out.println("counter = " + counter);
  }
}
