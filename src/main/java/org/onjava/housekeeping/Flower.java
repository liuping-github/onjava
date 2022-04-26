package org.onjava.housekeeping;// housekeeping/Flower.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Calling constructors with "this"

/**
 * 在构造器中调用构造器
 * 当一个类里有多个构造器时，有时会希望从一个构造器里调用另一个构造器，以避免重复的代码。
 * 可以使用this关键字进行此类调用。
 *
 * 通常情况下，当提及this时，指的是“这个对象”或“当前对象”，并且this本身表示对当前对象的引用。
 * 在构造器中，如果在this后加了参数列表，那么就有了不同的含义，它会显式调用与该参数列表匹配的构造器。
 * 以下是一个调用其他构造器的直接方式：
 * 使用this调用构造器
 */
public class Flower {
  int petalCount = 0;
  String s = "initial value";
  Flower(int petals) {
    petalCount = petals;
    System.out.println(
      "Constructor w/ int arg only, petalCount= "
      + petalCount);
  }
  Flower(String ss) {
    System.out.println(
      "Constructor w/ String arg only, s = " + ss);
    s = ss;
  }
  Flower(String s, int petals) {
    //构造器调用必须出现在方法的最开始部分，否则编译器会报错。
    this(petals);
    //- this(s); // Can't call two!
    this.s = s; // Another use of "this"
    System.out.println("String & int args");
  }
  Flower() {
    this("hi", 47);
    System.out.println("Zero-argument constructor");
  }
  void printPetalCount() throws Throwable {
    //- this(11); // Not inside non-constructor!
    System.out.println(
      "petalCount = " + petalCount + " s = "+ s);
  }
  public static void main(String[] args) throws Throwable {
    Flower x = new Flower();
    x.printPetalCount();
  }
}
/* Output:
Constructor w/ int arg only, petalCount= 47
String & int args
Zero-argument constructor
petalCount = 47 s = hi

构造器Flower(String s, int petals)表明，虽然可以使用this调用另一个构造器，但不能同时调用两个。此外，构造器调用必须出现在方法的最开始部分，否则编译器会报错。

这个例子还展示了this的另一种用法。参数s和成员数据s名字相同，所以会产生歧义。这时可以使用this.s来表示成员数据。你会经常在Java代码里看到这种写法，本书的许多地方也是这样写的。

在printPetalCount()方法里无法调用构造器，编译器禁止在非构造器的普通方法里调用构造器。
6.4.2　 static的含义
了解了this关键字后，就可以更全面地理解将一个方法设为static意味着什么：这种方法没有this。
你不能从静态（static）方法内部调用非静态方法3（反过来倒是可以的）。
你可以在没有创建对象的时候，直接通过类本身调用一个静态方法。
事实上这正是静态方法的主要用途。静态方法有点像全局方法。
不过Java中不允许使用全局方法，一个类里的静态方法可以访问其他静态方法和静态字段。
6.5　清理：终结和垃圾收集
程序员都知道初始化的重要性，但常常会忘记清理也同样重要。毕竟，谁需要清理一个int呢？但用完一个对象后就弃之不顾，这样做可能并不安全。当然，Java有垃圾收集器来回收不再使用的对象内存，但也有特殊情况：假设你的对象在不使用new的情况下分配了一块“特殊”内存，而垃圾收集器只知道如何释放由new分配的内存，所以它不知道如何释放对象的这块“特殊”内存。为了处理这种情况，Java允许在类中定义一个名为finalize()的方法。

finalize()方法的工作原理“应该”是这样的：当垃圾收集器准备释放对象占用的资源时，它首先调用finalize()方法，然后在下一次垃圾收集动作发生时，才会真正回收这个对象占用的内存。因此如果使用了finalize()，就可以在垃圾收集时做一些重要的清理工作。

finalize()是一个潜在的编程陷阱，因为一些程序员，特别是C++程序员，刚开始可能会将它误认为C++中的析构函数，C++在销毁对象时必须调用这个函数。在这里将C++和Java区分开来很重要，因为在C++中，（如果程序没有缺陷的话）对象一定会被销毁，而在Java中，对象并不总是被回收。或者换句话说：

你的对象可能不会被回收；
垃圾收集不是析构。
在你回收某个对象之前，如果要执行某些操作，那你得自己去做。Java没有析构函数或类似的概念，因此你必须创建一个普通方法来执行清理工作。例如，假设某个对象在创建过程中会在屏幕上绘制自己，如果没有明确地从屏幕上将其擦除，它可能永远得不到清理。如果在finalize()中加入了擦除功能，那么当对象被垃圾收集并调用finalize()时（并不能保证一定会发生），图像将先从屏幕上被擦除。但如果这并没有发生，图像就会保留。

你也许会发现某个程序的对象存储空间一直没有被释放，这是因为这个程序在运行过程中，还没有耗尽存储空间。如果直到程序执行结束，垃圾收集器也没有释放任何对象存储空间，那么在程序退出时这些存储空间会全部还给操作系统。这个策略是恰当的，因为垃圾收集本身也有开销，如果没有做过垃圾收集，那就不用承担这部分开销了。
*/
