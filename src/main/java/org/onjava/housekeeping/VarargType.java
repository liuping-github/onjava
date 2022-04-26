package org.onjava.housekeeping;// housekeeping/VarargType.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

/**
 * 这个例子还显示了如何使用一个指定的、非Object类型的可变参数列表。示例方法里所有的可变参数都必须是String类型。
 * 我们可以在可变参数列表中使用任何类型的参数，包括基本类型。
 * 下面的示例展示了可变参数列表变成数组的情形，如果列表中没有任何内容，则它会转变成一个大小为零的数组：
 */
public class VarargType {
  static void f(Character... args) {
    System.out.print(args.getClass());
    System.out.println(" length " + args.length);
  }
  static void g(int... args) {
    System.out.print(args.getClass());
    System.out.println(" length " + args.length);
  }
  public static void main(String[] args) {
    f('a');
    f();
    g(1);
    g();
    System.out.println("int[]: " +
      new int[0].getClass());
  }
}
/* Output:
class [Ljava.lang.Character; length 1
class [Ljava.lang.Character; length 0
class [I length 1
class [I length 0
int[]: class [I
getClass()方法是Object的一部分，将在第19章中进行全面探讨。
它会生成一个对象的类，当打印这个类时，你会看到一个表示该类类型的编码字符串。
前导的[表示这是后面紧随的类型的数组。I表示基本类型int。为了再次确认，我在最后一行创建了一个int数组并打印了它的类型。
这证实了使用可变参数列表不依赖于自动装箱，这个示例实际上用的就是基本类型。
*/
