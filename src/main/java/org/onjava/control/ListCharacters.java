package org.onjava.control;// control/ListCharacters.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// List all the lowercase ASCII letters

/**
 * for循环常用于执行“计数”任务，比如计算一个数组的长度，或者计算一个字符串的长度。
 * 展示所有的小写ASCII字母
 */
public class ListCharacters {
  public static void main(String[] args) {
    for(char c = 0; c < 128; c++)
      if(Character.isLowerCase(c))
        System.out.println("value: " + (int)c +
          " character: " + c);
  }
}
/* Output: (First 10 Lines)
value: 97 character: a
value: 98 character: b
value: 99 character: c
value: 100 character: d
value: 101 character: e
value: 102 character: f
value: 103 character: g
value: 104 character: h
value: 105 character: i
value: 106 character: j
          ...
注意变量c是在使用时被定义的，它发生在for循环的控制表达式里，而不是在main()方法开始的地方。
c的作用域就是for循环控制的语句范围内。
像C这种传统的过程式语言要求所有变量都在程序开始的地方定义。
当编译器创建它们的时候，会为这些变量分配空间。
而在Java和C++中，你可以把变量声明分散在整个程序里，在真正需要的时候才定义。
这样的编程风格更自然，也更易于理解。

1在早期的语言中，设计者所做的大量决定是为了让编译器开发者的工作更轻松。
而在现代语言中，大多数设计决策是为了让编程语言的使用者工作更轻松，尽管有时会有妥协——这一般最终会成为语言设计者的遗憾。

上面的程序使用了java.lang.Character包装器类，它不仅可以把char基本类型的值包装进对象，还提供了其他一些有用的工具。
这里用到的静态方法isLowerCase()可以检测出相关字符是否为小写字母。
*/
