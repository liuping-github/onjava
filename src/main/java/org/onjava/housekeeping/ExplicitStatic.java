package org.onjava.housekeeping;// housekeeping/ExplicitStatic.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Explicit static initialization with "static" clause
/**
尽管看起来有点像一个方法，但它只是在static关键字后加了一段代码。这段代码和其他静态初始化语句一样，只执行一次：第一次创建该类的对象时，或第一次访问该类的静态成员时（即使从未创建过该类的对象）。例如：
 静态子句里的显式静态初始化
 */
class Cup {
  Cup(int marker) {
    System.out.println("Cup(" + marker + ")");
  }
  void f(int marker) {
    System.out.println("f(" + marker + ")");
  }
}

class Cups {
  static Cup cup1;
  static Cup cup2;
  static {
    cup1 = new Cup(1);
    cup2 = new Cup(2);
  }
  Cups() {
    System.out.println("Cups()");
  }
}

public class ExplicitStatic {
  public static void main(String[] args) {
    System.out.println("Inside main()");
    Cups.cup1.f(99);                  // [1]
  }
  // static Cups cups1 = new Cups();  // [2]
  // static Cups cups2 = new Cups();  // [2]
}
/* Output:
Inside main()
Cup(1)
Cup(2)
f(99)
无论是通过方式[1]访问静态对象cup1，还是注释掉方式[1]并取消方式[2]的注释来运行，Cups的静态初始化动作都会发生。如果把方式[1]和方式[2]同时注释掉，Cups的静态初始化动作就不会发生。此外，方式[2]运行一次还是两次无关紧要，静态初始化动作只会发生一次。
*/
