package org.onjava.housekeeping;// housekeeping/VarArgs.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Using array syntax to create variable argument lists

/**
 * 6.8.2　可变参数列表
 * Java提供了类似于C语言可变参数列表（variable argument list，在C中简称为varargs）的功能，让你来创建和调用有可变参数的方法。
 * 这包括数量可变的参数以及未知类型的参数。
 * 由于所有类最终都继承自公共根类Object（随着本书的深入，关于这个主题你将了解更多），因此可以创建一个接受Object数组的方法，并像下面这样调用它：
 * 使用数组语法来创建可变参数列表
 */
class A {}

public class VarArgs {
  static void printArray(Object[] args) {
    for(Object obj : args)
      System.out.print(obj + " ");
    System.out.println();
  }
  public static void main(String[] args) {
    printArray(new Object[]{47, (float) 3.14, 11.11});
    printArray(new Object[]{"one", "two", "three" });
    printArray(new Object[]{new A(), new A(), new A()});
  }
}
/* Output:
47 3.14 11.11
one two three
A@19e0bfd A@139a55 A@1db9742
printArray()方法接受一个Object数组，然后使用for-in语法逐步遍历数组并打印每个元素。
Java标准库里的类会产生有意义的输出，但此处创建的对象打印了类名，后跟一个@符号和十六进制数字。
因此，如果没有为自己的类定义toString()方法（这将在本书后面讲解），可以看到默认行为就是打印类名和对象的地址。
*/
