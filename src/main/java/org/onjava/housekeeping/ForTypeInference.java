package org.onjava.housekeeping;// housekeeping/ForTypeInference.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// {NewFeature} Since JDK 11

/**
 * 类型推断十分适合for循环
 * 将类型推断作为基本概念而创建的语言——如Kotlin和Scala——允许在任何可能有意义的地方进行类型推断，而Java则受到向后兼容性问题的限制。
 * 使用这个新功能的最佳方法，可能是在任何你认为可以的地方尝试它，并让编译器或你的IDE来提示是否可以这样用。
 */
public class ForTypeInference {
  public static void main(String[] args) {
    for(Spiciness s : Spiciness.values())
      System.out.println(s);
  }
}
/* Output:
NOT
MILD
MEDIUM
HOT
FLAMING
6.11　总结
构造器，这个如此精巧的初始化机制，应该让你强烈体会到了编程语言里初始化的重要性。
C++的发明者Bjarne Stroustrup在设计该语言时，关于C的生产力，他观察到的第一个现象是，变量初始化不当导致了很大一部分的编程问题。
这种类型的错误很难发现，类似的问题也出现在不正确的清理中。
Java的构造器可以保证正确的初始化和清理（编译器不允许在没有正确调用构造器的情况下创建对象），因此给了我们完全的控制权，而且用起来也很安全。

在C++中，“析构”非常重要，因为使用new创建的对象必须显式销毁。
在Java中，垃圾收集器会自动为所有对象释放内存，因此Java中等效的清理方法在大多数时候不是必需的（但如果需要，你就必须自己动手）。
在不需要类似析构函数行为的情况下，Java的垃圾收集器极大地简化了编程工作，并在管理内存方面增加了急需的安全性。
一些垃圾收集器甚至可以清理其他资源，如图形和文件句柄。不过，垃圾收集器确实增加了运行时成本，由于Java解释器曾经比较缓慢，因此人们很难正确看待这种开销。
尽管Java的性能随着时间推移而显著提高，但速度问题仍然是它涉足某些特定编程领域的障碍。

由于要保证所有对象都被创建，构造器实际上比这里讨论的更复杂。特别是当使用组合或继承来创建新类时，这种保证依然成立，
因此需要一些额外的语法来提供支持。你将在后面的章节中了解组合、继承以及它们如何影响构造器。
*/
