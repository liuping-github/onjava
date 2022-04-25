package org.onjava.housekeeping;// housekeeping/SimpleConstructor2.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Constructors can have parameters

/**
 * 和任何方法一样，构造器也可以传入参数来指定如何创建对象。前面的示例可以很容易地修改成让构造器接受一个参数：
 * 构造器可以有参数
 */
class Rock2 {
  Rock2(int i) {
    System.out.print("Rock " + i + " ");
  }
}

public class SimpleConstructor2 {
  public static void main(String[] args) {
    for(int i = 0; i < 8; i++)
      new Rock2(i);
  }
}
/* Output:
Rock 0 Rock 1 Rock 2 Rock 3 Rock 4 Rock 5 Rock 6 Rock 7
如果类Tree有一个构造器，它接受一个表示树高度的整数参数，你可以像这样创建一个Tree对象：

Tree t = new Tree(12);  // 12英尺的树（1英尺约合2.54厘米）
如果Tree(int)是唯一的构造器，编译器就不会让你以任何其他方式创建Tree对象。

构造器消除了初始化相关的很多问题，并使代码更易于阅读。
例如，在前面的代码片段中，并没有对initialize()方法的显式调用，这种显式调用会在概念上分离初始化与创建。
在Java中，创建和初始化是统一的概念，两者缺一不可。

构造器是一类特殊的方法，它没有返回类型。
这与返回类型为空（void）明显不同。
对于空返回类型来说，方法不会返回任何内容，但这个方法的开发者还可以选择把返回类型定义为其他的（比如Integer或String）。
而构造器没有返回类型，并且你也别无选择。注意new表达式确实返回了新建对象的引用。
*/
