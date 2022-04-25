package org.onjava.housekeeping;// housekeeping/OverloadingOrder.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Overloading based on parameter order

/**
 * 区分重载的方法
 * 如果不同的方法具有相同的名字，Java怎样才能知道你指的是哪个方法？有一个简单的规则：每个重载方法必须有独一无二的参数类型列表。
 *
 * 稍加思考就知道这是合理的。对于同名的两个方法，除了它们参数的类型，我们还能如何把它们区分开来？
 *
 * 就算仅仅是参数顺序不同也足以区分两个方法，不过我们通常不会采用这种方式，因为它会产生难以维护的代码：
 *  根据参数顺序来重载方法
 */
public class OverloadingOrder {
  static void f(String s, int i) {
    System.out.println("String: " + s + ", int: " + i);
  }
  static void f(int i, String s) {
    System.out.println("int: " + i + ", String: " + s);
  }
  public static void main(String[] args) {
    f("String first", 11);
    f(99, "Int first");
  }
}
/* Output:
String: String first, int: 11
int: 99, String: Int first
上面两个f()方法虽然具有相同的参数，但顺序不同，这就足以将它们区分开来。
*/
