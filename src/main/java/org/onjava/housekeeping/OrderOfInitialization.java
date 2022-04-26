package org.onjava.housekeeping;// housekeeping/OrderOfInitialization.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Demonstrates initialization order

// When the constructor is called to create a
// Window object, you'll see a message:

/**
 * 6.7.1　初始化顺序
 * 类中的变量定义顺序决定了初始化的顺序。即使分散到方法定义之间，变量定义仍然会在任何方法（包括构造器）调用之前就被初始化。例如：
 * 演示初始化顺序
 *
 * 当调用构造器来创建一个Window对象时
 * 会看到一个消息
 */
class Window {
  Window(int marker) {
    System.out.println("Window(" + marker + ")");
  }
}

class House {
  Window w1 = new Window(1); // Before constructor
  House() {
    // Show that we're in the constructor:
    System.out.println("House()");
    w3 = new Window(33); // Reinitialize w3
  }
  Window w2 = new Window(2); // After constructor
  void f() { System.out.println("f()"); }
  Window w3 = new Window(3); // At end
}

public class OrderOfInitialization {
  public static void main(String[] args) {
    House h = new House();
    h.f(); // Shows that construction is done
  }
}
/* Output:
Window(1)
Window(2)
Window(3)
House()
Window(33)
f()
在House中，Window对象的定义被故意分散到方法之间，以证明它们都会在构造器或其他任何事情发生之前就执行初始化。此外，w3在构造器中被重新初始化。

输出显示w3引用被初始化了两次：一次在构造器调用之前，另一次在构造器调用期间（第一个对象被丢弃，因此稍后可能会被垃圾收集）。这看起来可能效率不高，但它保证了正确的初始化。试想，如果定义了一个重载的构造器，它没有初始化w3，而w3定义时也没有指定默认的初始化值，程序运行时会产生什么后果呢？
*/
