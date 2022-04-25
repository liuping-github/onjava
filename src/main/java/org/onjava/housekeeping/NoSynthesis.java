package org.onjava.housekeeping;// housekeeping/NoSynthesis.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

/**
 * 创建了一个新对象，并调用其无参构造器，尽管你并没有明确定义它。
 * 没有无参构造器的话，就没有方法可以用来创建对象。
 * 不过如果你已经定义了一个构造器，无论是否有参数，编译器都不会再帮你自动创建一个无参构造器了：
 */
class Bird2 {
  Bird2(int i) {}
  Bird2(double d) {}
}

public class NoSynthesis {
  public static void main(String[] args) {
//    Bird2 b = new Bird2(); // 没有无参构造器  No default
    Bird2 b2 = new Bird2(1);
    Bird2 b3 = new Bird2(1.0);
  }
}
/*
如果使用语句

new Bird2()
编译器会提示找不到匹配的构造器。
这就好比，如果你没有提供任何构造器，编译器就会认为“你肯定需要一个构造器，所以让我给你添加一个吧”；
但是如果你已经提供了一个构造器，编译器就会认为“你已经有了一个构造器，所以你知道自己在做什么；如果你没有提供无参构造器，那是因为你不想要它”。
 */