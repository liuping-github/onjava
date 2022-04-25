package org.onjava.housekeeping;// housekeeping/Overloading.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Both constructor and ordinary method overloading
/**
方法重载
在任何编程语言中，命名都是非常重要的特性。
当创建对象时，你就为对应的存储区域取了一个名字。
方法是对动作的命名。你通过名字来引用所有的对象、字段和方法。
精心挑选的名字会创建一个更容易被人们理解和修改的系统。这很像写散文，最终目的都是与读者沟通。

将人类语言中的细微差别映射到编程语言时常常会出现问题。
通常来说，同一个词可以表达几种不同的含义，这就是重载（overloaded）。
重载很有用，尤其是在涉及细微差别时。
比如，我们说“洗衬衫”“洗车”和“给狗洗澡”。
如果一定要说“用洗衬衫的方法洗衬衫”“用洗车的方法洗车”和“用给狗洗澡的方法给狗洗澡”，这样是很愚蠢的，听众不需要对所执行的动作做出任何明确的区分。
大多数人类语言具有冗余性，即使遗漏了几个单词，你仍然可以确定其含义。
你不需要让每个东西都有唯一标识符，因为可以从上下文语境中推断出它的含义。

大多数编程语言（尤其是C语言）要求每个方法都要有一个唯一标识符（在这些语言中通常叫作函数）。
所以你不能有一个叫作print()的函数来打印整数，还有另一个叫作print()的函数来打印浮点数——每个函数都需要一个唯一的名字。

在Java（和C++）中，必须要有方法名重载的另一个因素是构造器。
因为构造器的名字是由类名预先确定的，所以只能有一个构造器名字。
但是这样的话，如何用不同的方式创建对象呢？例如，你设计了一个类，它可以通过默认方式来初始化，也可以通过从文件里读取信息来初始化。
这时你需要两个构造器，一个是无参构造器，另一个是有一个字符串参数的构造器，这个字符串参数表示一个文件名，用来初始化对象。
两者都是构造器，它们必须要有相同的名字——类的名字。
因此，如果允许具有不同参数类型的方法有相同的名字，那就必须要有方法重载。
方法重载对于构造器是必需的，但也可以用于其他任何方法，用法同样简单。

下面这个例子同时展示了重载构造器和重载方法：
 同时有构造器重载和普通方法重载
 */
class Tree {
  int height;
  Tree() {
    System.out.println("Planting a seedling");
    height = 0;
  }
  Tree(int initialHeight) {
    height = initialHeight;
    System.out.println("Creating new Tree that is " +
      height + " feet tall");
  }
  void info() {
    System.out.println(
      "Tree is " + height + " feet tall");
  }
  void info(String s) {
    System.out.println(
      s + ": Tree is " + height + " feet tall");
  }
}

public class Overloading {
  public static void main(String[] args) {
    for(int i = 0; i < 5; i++) {
      Tree t = new Tree(i);
      t.info();
      t.info("overloaded method");
    }
    // Calls overloaded constructor:
    new Tree();
  }
}
/* Output:
Creating new Tree that is 0 feet tall
Tree is 0 feet tall
overloaded method: Tree is 0 feet tall
Creating new Tree that is 1 feet tall
Tree is 1 feet tall
overloaded method: Tree is 1 feet tall
Creating new Tree that is 2 feet tall
Tree is 2 feet tall
overloaded method: Tree is 2 feet tall
Creating new Tree that is 3 feet tall
Tree is 3 feet tall
overloaded method: Tree is 3 feet tall
Creating new Tree that is 4 feet tall
Tree is 4 feet tall
overloaded method: Tree is 4 feet tall
Planting a seedling
创建Tree对象的时候，既可以不含参数来表示一个没有高度的幼苗，也可以把树的高度作为参数来表示一棵成长中的树木。
要实现这一点，需要一个无参构造器，还有一个采用现有高度作为参数的构造器。

你可能还想用多种方式调用info()方法。
比如，想显示额外信息的话，可以用info(String)方法。
不想显示任何额外信息的话，就用info()方法。
如果对明显相同的概念使用不同的名字，那一定会让人感觉很奇怪。
而通过方法重载，我们就可以为两者使用相同的名字了。
*/
