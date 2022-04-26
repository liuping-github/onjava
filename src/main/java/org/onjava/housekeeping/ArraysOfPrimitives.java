package org.onjava.housekeeping;// housekeeping/ArraysOfPrimitives.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

/**
 * 6.8　数组初始化
 * 数组是一个对象序列或基本类型序列，其中含有的元素类型相同，用一个标识符名字打包在了一起。
 * 数组通过方括号索引操作符（indexing operator）[ ]来定义和使用。要定义一个数组引用，在类型名字后面加上空方括号即可：
 *
 * int[] a1;
 * 也可以将方括号置于标识符后面，效果是一样的：
 *
 * int a1[];
 * 这种格式符合C和C++程序员的习惯。然而，前一种格式可能更合理，因为它表示这个类型是“一个int数组”。本书采用了这种格式。
 *
 * 编译器不允许指定数组的大小。
 * 这让我们又回到了“引用”的问题上。你现在所拥有的只是对数组的引用（你已经为该引用分配了足够的存储空间），并没有为数组对象本身分配任何空间。
 * 要为数组对象分配存储空间，就必须编写一个初始化表达式。
 * 对于数组，初始化可以出现在代码中的任何位置，但也可以使用一种特殊的初始化表达式，它只能在创建数组的地方出现。
 * 这个特殊的初始化是一组用花括号括起来的值。在这种情况下，编译器负责存储的分配（相当于使用new）：
 *
 * int[] a1 = { 1, 2, 3, 4, 5 };
 * 那为什么要在没有数组的时候定义一个数组引用呢？
 *
 * int[] a2;
 * 在Java中可以将一个数组赋值给另一个数组，因此可以这样写：
 *
 * a2 = a1;
 * 其实真正所做的只是复制了一个引用，如下所示：
 */
public class ArraysOfPrimitives {
  public static void main(String[] args) {
    int[] a1 = { 1, 2, 3, 4, 5 };
    int[] a2;
    a2 = a1;
    for(int i = 0; i < a2.length; i++)
      a2[i] += 1;
    for(int i = 0; i < a1.length; i++)
      System.out.println("a1[" + i + "] = " + a1[i]);
  }
}
/* Output:
a1[0] = 2
a1[1] = 3
a1[2] = 4
a1[3] = 5
a1[4] = 6
a1被赋了一个初始值，但a2没有；a2稍后被数组a1赋值。这里a2和a1其实是同一个数组的不同别名，因此通过a2所做的更改可以在a1中看到。

所有数组都有一个固有成员（无论它们是对象数组还是基本类型数组），可以通过它来查询数组中有多少元素，但不能对其进行修改。
这个成员就是length。与C和C++一样，Java中的数组从元素0开始计数，因此可以索引的最大下标数是length - 1。
如果越界，C和C++会默默地接受，并允许你访问所有内存，这是许多臭名昭著的错误的根源。而Java则会通过抛出运行时错误（即异常）来保护你免受此类问题的影响。
*/
