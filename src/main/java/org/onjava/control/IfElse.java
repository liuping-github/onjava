package org.onjava.control;// control/IfElse.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

/**
 * if-else
 * if-else语句是最基本的控制程序流程的方式。其中else是可选的，所以if-else语句有如下两种使用方式：
 * if(Boolean-expression)
 *     statement
 * 或者
 * if(Boolean-expression)
 *     statement
 * else
 *     statement
 * 布尔表达式必须生成一个布尔结果，上面的statement指的是用分号结尾的简单语句，或复合语句——用花括号包围起来的一组简单语句。
 * 只要提及statement这个词，指的就是简单语句或复合语句。
 *
 * 下面这个test()方法就是if-else的一个例子。它用来识别你猜测的数是大于、小于还是等于目标数：
 */
public class IfElse {
  static int result = 0;
  static void test(int testval, int target) {
    if(testval > target)
      result = +1;
    else if(testval < target)           // [1]
      result = -1;
    else
      result = 0; // Match
  }
  public static void main(String[] args) {
    test(10, 5);
    System.out.println(result);
    test(5, 10);
    System.out.println(result);
    test(5, 5);
    System.out.println(result);
  }
}
/* Output:
1
-1
0
[1] else if并非新的关键字，只不过是一个else后面紧跟一个新的if语句。

尽管Java与它之前的C和C++一样，都是“格式自由”的语言，但通常还是将语句的主体部分进行缩进，这样能方便读者识别控制流语句的开始与结束。
*/
