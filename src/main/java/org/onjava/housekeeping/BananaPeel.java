package org.onjava.housekeeping;// housekeeping/BananaPeel.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
/**
this关键字
对于同一类型的两个对象a和b，如何才能让这两个对象分别调用方法peel()：
1. 如果a和b是同一个对象，则a.peel()和b.peel()调用的是同一个方法；
 */
class Banana { void peel(int i) { /* ... */ } }

public class BananaPeel {
  public static void main(String[] args) {
    Banana a = new Banana(),
           b = new Banana();
    a.peel(1);
    b.peel(2);
  }
}
/*
如果我们只有一个peel()方法，那这个方法如何知道自己是被对象a还是对象b调用的？

编译器是做了一些幕后工作的，所以你才可以如以上示例那样编写代码。
方法peel()其实有一个隐藏参数，位于所有显式参数之前，代表着被操作对象的引用。所以，上述两个方法的调用就变成了这样：
Banana.peel(a, 1);
Banana.peel(b, 2);
这是内部的表示形式，你不能这样编写代码，并试图通过编译，但它可以让你了解一些内部实际发生的事情。

 */