package org.onjava.control;// control/TestWithReturn.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
/**
return
Java中有多个关键字表示无条件分支，即这个分支无须任何测试即可执行。
这些关键字包括return、break、continue，还有一种跳转到标签语句（labeled statement）的方式，它与其他语言中的goto类似。

return关键字有两种用途：它可以指定一个方法的返回值（如果不存在就返回void），还会导致当前的方法退出，并且返回这个值。
我们可以通过改写IfElse.java里的test()方法来利用这些优点：
 */
public class TestWithReturn {
  static int test(int testval, int target) {
    if(testval > target)
      return +1;
    if(testval < target)
      return -1;
    //这里不需要加上else，因为这个方法在执行了return后就不会继续了。
    return 0; // Match
  }
  public static void main(String[] args) {
    System.out.println(test(10, 5));
    System.out.println(test(5, 10));
    System.out.println(test(5, 5));
  }
}
/* Output:
1
-1
0
这里不需要加上else，因为这个方法在执行了return后就不会继续了。

如果在一个返回了void的方法中没有return语句，那么该方法的结尾处会有一个隐含的return，所以方法里并不一定会有一个return语句。
但是如果你的方法声明了它将返回一个非void的值，那就必须确保每一条代码路径都会返回一个值。
*/
