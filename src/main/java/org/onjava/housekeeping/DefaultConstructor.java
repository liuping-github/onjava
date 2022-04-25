package org.onjava.housekeeping;// housekeeping/DefaultConstructor.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

/**
 * 无参构造器
 * 如前所述，无参构造器（又叫“默认构造器”或“零参数构造器”）是没有参数的构造器，用于创建“默认对象”。
 * 如果你创建了一个没有构造器的类，编译器会自动为这个类添加一个无参构造器。例如：
 */
class Bird {}

public class DefaultConstructor {
  public static void main(String[] args) {
    Bird b = new Bird(); // Default!
  }
}
/*
语句

new Bird()
 */