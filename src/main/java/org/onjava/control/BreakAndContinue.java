package org.onjava.control;// control/BreakAndContinue.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Break and continue keywords
/**
break和continue
在任何迭代语句的主体部分，都可以使用break和continue来控制循环流程。
break会直接退出循环，不再执行循环里的剩余语句。continue则会停止执行当前的迭代，然后退回循环开始位置执行下一次迭代。

下面是一个在for和while循环中使用break和continue的例子：
 */
import static org.onjava.onjava.Range.range;

public class BreakAndContinue {
  public static void main(String[] args) {
    for(int i = 0; i < 100; i++) {        // [1]
      if(i == 74) break; // Out of for loop
      if(i % 9 != 0) continue; // Next iteration
      System.out.print(i + " ");
    }
    System.out.println();
    // Using for-in:
    for(int i : range(100)) {             // [2]
      if(i == 74) break; // Out of for loop
      if(i % 9 != 0) continue; // Next iteration
      System.out.print(i + " ");
    }
    System.out.println();
    int i = 0;
    // An "infinite loop":
    while(true) {                         // [3]
      i++;
      int j = i * 27;
      if(j == 1269) break; // Out of loop
      if(i % 10 != 0) continue; // Top of loop
      System.out.print(i + " ");
    }
  }
}
/* Output:
0 9 18 27 36 45 54 63 72
0 9 18 27 36 45 54 63 72
10 20 30 40
[1] i的值永远不会达到100，这是因为一旦i等于74，break语句就会中断循环。
通常只有在不知道中断条件何时发生时，才会这样使用break。
只要i不能被9整除，continue语句就会返回到循环的开头再继续执行（因此这会让i值增加）。
如果能够整除，值就被打印出来。
[2] for-in语句产生了相同的结果。
[3] 这个“无限”的while循环会一直执行，因为它的条件表达式结果总是true，不过break语句会中止循环。
注意代码里的continue语句只是把执行流程移到了循环的开头，而没有执行continue之后的任何内容，因此i值只有被10整除时才会打印。
输出结果中之所以显示0，是因为0%9等于0。

无限循环的另一种形式是for(;;)。编译器同等对待while(true)和for(;;)，所以具体选用哪个取决于你的编程习惯。
*/
