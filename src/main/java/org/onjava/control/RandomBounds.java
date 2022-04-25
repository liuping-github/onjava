package org.onjava.control;// control/RandomBounds.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Does Math.random() produce 0.0 and 1.0?
// {java RandomBounds lower}

/**
 * 这里有一个可能会提供答案的测试程序。
 * 所有命令行参数都是作为字符串对象传递的，因此我们可以将参数作为switch的选择器来决定做什么。
 * 这里有个问题：用户可能不提供任何参数，因此如果索引args数组，则可能会导致程序失败。
 * 为了解决这个问题，先检查数组的长度。
 * 如果为零，就使用一个空字符串，否则选择args数组里的第一个元素：
 * Math.random()能生成0.0和1.0吗
 */

import org.onjava.onjava.TimedAbort;

public class RandomBounds {
  public static void main(String[] args) {
    new TimedAbort(3);
    switch(args.length == 0 ? "" : args[0]) {
      case "lower":
        while(Math.random() != 0.0) ; // Keep trying
        System.out.println("Produced 0.0!");
        break;
      case "upper":
        while(Math.random() != 1.0) ; // Keep trying
        System.out.println("Produced 1.0!");
        break;
      default:
        System.out.println("Usage:");
        System.out.println("\tRandomBounds lower");
        System.out.println("\tRandomBounds upper");
        System.exit(1);
    }
  }
}
/*
如果要运行程序，输入以下任意一条命令：

java RandomBounds lower
或者

java RandomBounds upper
使用onjava包中的TimedAbort类，程序会在3秒后中止，因此看起来Math.random()不会生成0.0或1.0。
但这正是这种实验可能具有欺骗性的地方。
如果你考虑0~1范围内双精度浮点数的数量，通过实验生成一个值的可能性会超出一台计算机的使用寿命，甚至是实验者的寿命。
其实0.0是包含在Math.random()的输出中的，而1.0没有。用数学术语表示就是[0,1)。你一定要仔细分析自己的实验并了解它们的局限性。
本章探索了大多数编程语言具有的基本功能。
现在你已经做好了准备，可以开始迈进面向对象和函数式编程的世界了。
第6章将讨论与对象初始化和清理相关的重要问题，第7章则讲解实现隐藏的基本概念。
 */