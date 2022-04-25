package org.onjava.housekeeping;// housekeeping/PassingThis.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

/**
 * this关键字还可以将当前对象传递给另一个方法：
 */
class Person {
  public void eat(Apple apple) {
    Apple peeled = apple.getPeeled();
    System.out.println("Yummy");
  }
}

class Peeler {
  static Apple peel(Apple apple) {
    // ... remove peel
    return apple; // Peeled
  }
}

class Apple {
  Apple getPeeled() { return Peeler.peel(this); }
}

public class PassingThis {
  public static void main(String[] args) {
    new Person().eat(new Apple());
  }
}
/* Output:
Yummy
Apple需要调用Peeler.peel()方法，这是一个外部的工具方法，
用来执行出于某种原因必须在Apple外部进行的操作（或许是因为这个外部方法可以用于许多不同的类，这样你就不用编写重复的代码了）。
要将自身传递给外部方法，Apple就必须使用this关键字。
*/

