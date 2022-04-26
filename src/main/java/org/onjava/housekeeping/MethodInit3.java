package org.onjava.housekeeping;

// housekeeping/MethodInit3.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
/**
 * This program demonstrates how to initialize
 * a method.

public class MethodInit3 {
    static int i = 0;
    static {
        System.out.println("In static block");
        i = 1;
    }
    public static void main(String[] args) {
        System.out.println(i);
    }
}
* 但不能这样写 ：
 */
public class MethodInit3 {
//  int j = g(i); // Illegal forward reference
  int i = f();
  int f() { return 11; }
  int g(int n) { return n * 10; }
}
/*
编译器对前向引用（forward referencing）发出了告警，这里的问题和初始化顺序有关，而不是程序的编译方式。

这种初始化方法简单明了，但有个限制：类InitialValues的每个对象都会有相同的初始值。有时候这正是你想要的，但有时你可能需要更大的灵活性。
 */