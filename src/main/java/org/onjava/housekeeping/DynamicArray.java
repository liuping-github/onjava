package org.onjava.housekeeping;// housekeeping/DynamicArray.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Array initialization

/**
 * 虽然第一种形式（定义了a）很有用，但局限性更大，它只能用在定义数组的时候。
 * 可以在任何地方使用第二种形式（定义了b），甚至在方法调用中也可以。
 * 例如，可以创建一个String对象数组，传递给另一个类的main()方法，使它可以不用命令行参数来调用：
 * 数组初始化
 */
public class DynamicArray {
  public static void main(String[] args) {
    Other.main(new String[]{ "fiddle", "de", "dum" });
  }
}

class Other {
  public static void main(String[] args) {
    for(String s : args)
      System.out.print(s + " ");
  }
}
/* Output:
fiddle de dum
Other.main()的数组参数是在方法调用时创建的，因此甚至可以在调用时提供可替换的参数。
*/
