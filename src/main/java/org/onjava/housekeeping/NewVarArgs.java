package org.onjava.housekeeping;// housekeeping/NewVarArgs.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Using ellipses to define a variable argument list

/**
 * 在Java 5之前，我们会经常看到用这样的代码来生成可变参数列表。
 * 从Java 5开始，你可以使用省略号来定义一个可变参数列表，就像在printArray()里看到的那样：
 * 使用省略号来定义一个可变参数列表
 */
public class NewVarArgs {
  static void printArray(Object... args) {
    for(Object obj : args)
      System.out.print(obj + " ");
    System.out.println();
  }
  public static void main(String[] args) {
    // Can take individual elements:
    printArray(47, (float) 3.14, 11.11);
    printArray(47, 3.14F, 11.11);
    printArray("one", "two", "three");
    printArray(new A(), new A(), new A());
    // Or an array:
    printArray((Object[])new Integer[]{ 1, 2, 3, 4 });
    printArray(); // Empty list is OK
  }
}
/* Output:
47 3.14 11.11
47 3.14 11.11
one two three
A@19e0bfd A@139a55 A@1db9742
1 2 3 4
有了可变参数，就不需要再显式使用数组语法了——当使用省略号时，编译器会自动为你填充。
你得到的仍然是一个数组，这就是printArray()能够使用for-in来遍历数组的原因。
不过它不仅仅是从元素列表到数组的自动转换。
注意程序中的倒数第二行，其中一个Integer数组（使用自动装箱创建）被转换为一个Object数组（以消除编译器警告），并传递给了printArray()。
显然，编译器认为这已经是一个数组，并不会对其进行任何转换。因此，如果你有一组元素，可以将它们作为列表传递。
如果你已经有一个数组，该方法可以将它们作为可变参数列表来接受。
*/
