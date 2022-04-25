package org.onjava.housekeeping;// housekeeping/Flower.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Calling constructors with "this"

/**
 * 在构造器中调用构造器
 * 当一个类里有多个构造器时，有时会希望从一个构造器里调用另一个构造器，以避免重复的代码。
 * 可以使用this关键字进行此类调用。
 *
 * 通常情况下，当提及this时，指的是“这个对象”或“当前对象”，并且this本身表示对当前对象的引用。
 * 在构造器中，如果在this后加了参数列表，那么就有了不同的含义，它会显式调用与该参数列表匹配的构造器。
 * 以下是一个调用其他构造器的直接方式：
 */
public class Flower {
  int petalCount = 0;
  String s = "initial value";
  Flower(int petals) {
    petalCount = petals;
    System.out.println(
      "Constructor w/ int arg only, petalCount= "
      + petalCount);
  }
  Flower(String ss) {
    System.out.println(
      "Constructor w/ String arg only, s = " + ss);
    s = ss;
  }
  Flower(String s, int petals) {
    this(petals);
    //- this(s); // Can't call two!
    this.s = s; // Another use of "this"
    System.out.println("String & int args");
  }
  Flower() {
    this("hi", 47);
    System.out.println("Zero-argument constructor");
  }
  void printPetalCount() {
    //- this(11); // Not inside non-constructor!
    System.out.println(
      "petalCount = " + petalCount + " s = "+ s);
  }
  public static void main(String[] args) {
    Flower x = new Flower();
    x.printPetalCount();
  }
}
/* Output:
Constructor w/ int arg only, petalCount= 47
String & int args
Zero-argument constructor
petalCount = 47 s = hi
在构造器中调用构造器
当一个类里有多个构造器时，有时会希望从一个构造器里调用另一个构造器，以避免重复的代码。
可以使用this关键字进行此类调用。

通常情况下，当提及this时，指的是“这个对象”或“当前对象”，并且this本身表示对当前对象的引用。
在构造器中，如果在this后加了参数列表，那么就有了不同的含义，它会显式调用与该参数列表匹配的构造器。
以下是一个调用其他构造器的直接方式：
*/
