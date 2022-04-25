package org.onjava.housekeeping;// housekeeping/Leaf.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Simple use of the "this" keyword

/**
 *  this关键字的简单使用
 */
public class Leaf {
  int i = 0;
  Leaf increment() {
    i++;
    return this;
  }
  void print() {
    System.out.println("i = " + i);
  }
  public static void main(String[] args) {
    Leaf x = new Leaf();
    x.increment().increment().increment().print();
  }
}
/* Output:
i = 3
increment()方法通过this关键字返回了当前对象的引用，所以可以很容易地对同一个对象执行多个操作。
*/
