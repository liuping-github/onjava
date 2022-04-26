package org.onjava.housekeeping;// housekeeping/Mugs.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Instance initialization

/**
 * 6.7.4　非静态实例初始化
 * Java提供了一种称为实例初始化（instance initialization）的类似语法，用于初始化每个对象的非静态变量。下面是一个例子：
 * 实例初始化
 */
class Mug {
  Mug(int marker) {
    System.out.println("Mug(" + marker + ")");
  }
}

public class Mugs {
  Mug mug1;
  Mug mug2;
  {                                         // [1]
    mug1 = new Mug(1);
    mug2 = new Mug(2);
    System.out.println("mug1 & mug2 initialized");
  }
  Mugs() {
    System.out.println("Mugs()");
  }
  Mugs(int i) {
    System.out.println("Mugs(int)");
  }
  public static void main(String[] args) {
    System.out.println("Inside main()");
    new Mugs();
    System.out.println("new Mugs() completed");
    new Mugs(1);
    System.out.println("new Mugs(1) completed");
  }
}
/* Output:
Inside main()
Mug(1)
Mug(2)
mug1 & mug2 initialized
Mugs()
new Mugs() completed
Mug(1)
Mug(2)
mug1 & mug2 initialized
Mugs(int)
new Mugs(1) completed
[1] 除了缺少static关键字外，实例初始化子句看起来与静态初始化子句完全相同。此语法对于支持匿名内部类的初始化是必需的（参见第11章），但也可以用来保证无论调用哪个显式的构造器，某些操作都会发生。

从输出可以看到，实例初始化子句在构造器之前执行。
*/
