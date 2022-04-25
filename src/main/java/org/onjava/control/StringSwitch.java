package org.onjava.control;// control/StringSwitch.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
/**
字符串作为选择器
Java 7的switch选择器不但可以使用整数值，还添加了使用字符串的能力。
以下示例显示了在一组候选的String类型中做出选择的旧方式，以及使用switch的新方式：
 */
public class StringSwitch {
  public static void main(String[] args) {
    String color = "red";
    // Old way: using if-then
    if("red".equals(color)) {
      System.out.println("RED");
    } else if("green".equals(color)) {
      System.out.println("GREEN");
    } else if("blue".equals(color)) {
      System.out.println("BLUE");
    } else if("yellow".equals(color)) {
      System.out.println("YELLOW");
    } else {
      System.out.println("Unknown");
    }
    // New way: Strings in switch
    switch(color) {
      case "red":
        System.out.println("RED");
        break;
      case "green":
        System.out.println("GREEN");
        break;
      case "blue":
        System.out.println("BLUE");
        break;
      case "yellow":
        System.out.println("YELLOW");
        break;
      default:
        System.out.println("Unknown");
        break;
    }
  }
}
/* Output:
RED
RED
一旦你理解了switch，这个语法就是一个逻辑扩展，可以让你的代码更简洁、更易于理解和维护。

作为第二个使用字符串的switch例子，让我们重新回顾一下Math.random()。
它是否产生一个0~1范围内的值？其中包不包括值“1”？用数学术语来说，它是(0,1)、[0,1] 、(0,1]还是[0,1)？（方括号的意思是“包括”，圆括号的意思是“不包括”。）
*/
