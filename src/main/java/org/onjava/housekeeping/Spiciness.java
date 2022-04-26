package org.onjava.housekeeping;// housekeeping/Spiciness.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

/**
 * 6.9　枚举类型
 * Java 5中添加了enum关键字，它看似一个很小的特性，但当你把元素组合起来并使用一组枚举类型来表示时，它会让编程变得更加轻松。
 * 以前，你需要创建一组整型常量值，但它并没有自然地将取值范围限制在这个集合中，因此风险更大且更难使用。
 * 枚举类型是非常普遍的需求，C、C++和许多其他语言一直都有这个功能。在Java 5之前，程序员如果想要正确实现enum效果，
 * 就不得不了解很多细节并且使用时要非常小心。现在Java也有了enum，它的功能比你在C/C++中用到的要全面得多。下面是一个简单的例子：
 * 这里会创建一个名为Spiciness的枚举类型，它包含了5个命名值。因为枚举类型的实例是常量，所以按照惯例都是大写的（如果一个名字中有多个单词，它们之间用下划线分隔）。
 */
public enum Spiciness {
  NOT, MILD, MEDIUM, HOT, FLAMING
}
