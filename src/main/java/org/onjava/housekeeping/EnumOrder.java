package org.onjava.housekeeping;// housekeeping/EnumOrder.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

/**
 * 创建enum时，编译器会自动添加一些有用的功能。
 * 例如，它添加了一个toString()方法，来方便地显示enum实例的名字，这就是上面的打印语句能够产生这个输出的原因。
 * 编译器还添加了一个ordinal()方法，来表示特定enum常量的声明顺序，以及一个静态的values()方法，它按照声明顺序生成一个enum常量值的数组：
 */
public class EnumOrder {
  public static void main(String[] args) {
    for(Spiciness s : Spiciness.values())
      System.out.println(
        s + ", ordinal " + s.ordinal());
  }
}
/* Output:
NOT, ordinal 0
MILD, ordinal 1
MEDIUM, ordinal 2
HOT, ordinal 3
FLAMING, ordinal 4
*/
