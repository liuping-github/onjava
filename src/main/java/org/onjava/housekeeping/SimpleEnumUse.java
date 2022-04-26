package org.onjava.housekeeping;// housekeeping/SimpleEnumUse.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

/**
 * 要使用enum，只需要创建一个该类型的引用，并将其分配给某个实例：
 */
public class SimpleEnumUse {
  public static void main(String[] args) {
    Spiciness howHot = Spiciness.MEDIUM;
    System.out.println(howHot);
  }
}
/* Output:
MEDIUM
*/
