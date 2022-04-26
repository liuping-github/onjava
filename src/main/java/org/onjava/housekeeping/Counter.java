package org.onjava.housekeeping;

// housekeeping/Counter.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
/**
6.7　构造器初始化
可以用构造器来执行初始化，这为编程带来了更大的灵活性，让你可以在运行时调用方法来设置初始值。不过这并不会阻止自动初始化的执行，因为它是在构造器执行前就发生了的。因此，如果这样写：
public class Counter {
  private int count = 0;
  public Counter() {
    count = 0;
  }
  public void increment() {
    count++;
  }
  public int tally() {
    return count;
  }
}
 */
public class Counter {
  int i;
  Counter() { i = 7; }
  // ...
}
/*
i先被自动初始化为0，然后被构造器初始化为7。对于所有的基本类型和对象引用都是如此，包括那些在定义时就显式初始化了的。出于这个原因，编译器不会强制你在构造器的某个特定位置或使用之前对元素进行初始化——因为初始化已经得到了保证。
 */