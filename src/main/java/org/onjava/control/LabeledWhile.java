package org.onjava.control;// control/LabeledWhile.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// "While" with "labeled break" and "labeled continue."

/**
 * 下面这个例子展示了while循环里的带标签的break和带标签的continue：
 * while循环里带标签的break和带标签的continue
 */
public class LabeledWhile {
    public static void main(String[] args) {
        int i = 0;
        outer:
        while (true) {
            System.out.println("Outer while loop");
            while (true) {
                i++;
                System.out.println("i = " + i);
                if (i == 1) {
                    System.out.println("continue");
                    continue;
                }
                if (i == 3) {
                    System.out.println("continue outer");
                    continue outer;
                }
                if (i == 5) {
                    System.out.println("break");
                    break;
                }
                if (i == 7) {
                    System.out.println("break outer");
                    break outer;
                }
            }
        }
    }
}
/* Output:
Outer while loop
i = 1
continue
i = 2
i = 3
continue outer
Outer while loop
i = 4
i = 5
break
Outer while loop
i = 6
i = 7
break outer

同样的规则也适用于while。

普通的continue会跳到最内层循环的起始处，并继续执行。
带标签的continue会跳到对应标签的位置，并重新进入这个标签后面的循环。
普通的break会“跳出循环的底部”，也就是跳出当前循环。
带标签的break会跳出标签所指的循环。
一定要记住，在Java里使用标签的唯一理由就是你用到了嵌套循环，而且你需要使用break或continue来跳出多层的嵌套。

带标签的break和continue是较少使用的试验性功能，在此前的编程语言中几乎没有先例。

Dijkstra在他的论文“Go To Statement Considered Harmful”中，特别反对使用的是标签，而非goto。
他观察到，在一个程序里随着标签的增多，错误的数量也跟着上升2，并且标签和goto也使得程序难以分析。
注意Java的标签不会有这些问题，因为它被限定了应用场景，不能通过点对点跳转的方式改变程序的控制流程。
通过限制一个语言特性的使用，我们反而使其更加有用。

2请注意，这似乎是一个很难证明的断言，并且很可能是属于“相关-因果关系”认知谬误的一个例子
*/
