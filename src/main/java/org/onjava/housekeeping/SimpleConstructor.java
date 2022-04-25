package org.onjava.housekeeping;
// housekeeping/SimpleConstructor.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Demonstration of a simple constructor
/**
初始化和清理
“不安全”的编程是导致编程成本高昂的罪魁祸首之一。

初始化（initialization）和清理（cleanup）正是导致“不安全”编程的两个因素。
许多C程序的错误都源于程序员忘记初始化变量。
特别是使用依赖库时，用户可能不知道如何初始化库的组件，甚至不知道必须要初始化它们。
清理也需要特别关注，因为当你不再使用一个元素时，就不再关注，所以很容易就会忘记它。
如此一来，这个元素使用的资源会一直被占用，结果就是资源很容易被耗尽（尤其是内存）。

C++引入了构造器（constructor）的概念，它是在创建对象时被自动调用的特殊方法。
Java也采用了构造器，并且还提供了一个垃圾收集器（garbage collector）。
当不再使用内存资源的时候，垃圾收集器会自动将其释放。本章讨论初始化和清理的问题，以及Java对它们的支持。

6.1　用构造器保证初始化
想象一下，你为自己编写的每个类都创建了一个initialize()方法，方法名暗示了在使用类的对象之前，应该先调用它。
这意味着用户必须记得主动调用此方法。在Java中，类的设计者可以通过编写构造器来确保每个对象的初始化。
如果一个类有构造器，创建对象时Java就会自动调用它，此时用户还不能访问这个对象。这样就保证了初始化。

接下来的挑战就是如何命名这个方法。
这里有两个问题：第一，这个方法使用的任何名字都有可能与类里某个成员的名字相冲突；第二，编译器负责调用构造器，所以它必须始终知道应该调用哪个方法。
C++语言采用的方案看起来最简单也最合乎逻辑，所以Java也采用了这个方案：构造器的名字就是类的名字。
考虑到在初始化期间这个方法要被自动调用，这个方案看起来也就合情合理。

下面是一个带有构造器的简单类：
 一个简单构造器的演示

 */
class Rock {
  Rock() {// 这个就是构造器 // This is the constructor
    System.out.print("Rock ");
  }
}

public class SimpleConstructor {
  public static void main(String[] args) {
    for(int i = 0; i < 10; i++)
      new Rock();
  }
}
/* Output:
Rock Rock Rock Rock Rock Rock Rock Rock Rock Rock
当创建对象时：

new Rock();
给对象分配存储空间，然后调用这个类的构造器。构造器会保证这个对象在可用前就已经正确地初始化了。

请注意，方法首字母小写的编程风格并不适用于构造器，因为构造器的名字必须与类的名字完全匹配。

在C++中，不带参数的构造器叫作默认构造器（default constructor）。
这个术语在Java出现之前就已经使用了很多年，但不知道出于什么原因，Java设计者决定使用术语无参构造器（no-arg constructor）。
我觉得这很别扭，而且也没必要，所以我不愿意使用这个术语，而打算继续使用默认构造器。
不过Java 8引入了default来作为方法定义的关键字，这可能会造成混淆。
幸运的是，Java文档已经开始使用术语零参数构造器（zero-argument constructor）1。
*/
