package org.onjava.control;// control/LabeledFor.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// For loops with "labeled break"/"labeled continue."

/**
 * 臭名昭著的goto
 * 编程语言从一开始就有goto关键字。甚至可以说，goto是汇编语言里程序控制的起源：“若条件A成立，则跳到这里；否则跳到那里”。
 * 如果阅读编译器最终生成的汇编代码，你就会发现程序控制流中包含了许多跳转。
 * （Java编译器会生成自己的“汇编代码”，但这个代码运行在Java虚拟机上，而不是直接运行在CPU硬件上。）
 * <p>
 * goto是在源码级别上进行的跳转，这给它带来了坏名声。
 * 如果一个程序总是从一个地方跳到另一个地方，难道不应该有其他更好的方式来重组代码，让它的控制流不这么不可控吗？
 * 随着Edsger Dykstra的著名论文“Go To Statement Considered Harmful”的发表，goto开始失宠了。
 * 自那以后，抨击goto变成了时尚，提倡废弃这个关键字的人则急着找证据。
 * <p>
 * 正如很多相似情况下的典型做法，遵守中庸之道是最富有成效的。真正的问题并不在于goto本身，而在于滥用goto。
 * 在极少数场景下，goto实际上是组织控制流最好的方式。
 * <p>
 * 尽管goto是Java中的一个保留字，但Java中并没有使用它——Java没有goto。
 * 不过Java也有一些类似于跳转的操作，这些操作与break和continue关键字有关。它们不是跳转，而只是中断循环的一种方式。
 * 之所以和goto一起讨论，是因为它们使用了相同的机制：标签。
 * <p>
 * 标签是以冒号结尾的标识符：
 * <p>
 * label1:
 * 在Java中，放置标签的唯一地方是正好在迭代语句之前。
 * “正好”的意思就是，不要在标签和迭代之间插入任何语句。
 * 在迭代之前使用标签的唯一原因是，你要在这个迭代里再嵌套一个迭代或一个switch（很快就会学到它）。
 * 这是因为break和continue通常只会中断当前循环，但和标签一起用时，它们可以中断这个嵌套的循环，直接跳转到标签所在的位置：
 * <p>
 * label1:
 * outer-iteration {
 * inner-iteration {
 * // ...
 * break;           // [1]
 * // ...
 * continue;        // [2]
 * // ...
 * continue label1; // [3]
 * // ...
 * break label1;    // [4]
 * }
 * }
 * [1] 这里的break中断内部迭代，回到外部迭代。
 * [2] 这里的continue中断当前执行，回到内部迭代的开始位置。
 * [3] 这里的continue label1会同时中断内部迭代以及外部迭代，直接跳到label1处，然后它实际上会重新进入外部迭代开始继续执行。
 * [4] 这里的break label1也会中断所有迭代，跳回到label1处，不过它并不会重新进入外部迭代。它实际是完全跳出了两个迭代。
 * <p>
 * 带标签的break和带标签的continue也可以用于for循环：
 * for循环里带标签的break和带标签的continue
 */
public class LabeledFor {
    public static void main(String[] args) {
        int i = 0;
        outer:
        // Can't have statements here
        for (; true; ) { // infinite loop
            inner:
            // Can't have statements here
            for (; i < 10; i++) {
                System.out.println("i = " + i);
                if (i == 2) {
                    System.out.println("continue");
                    continue;
                }
                if (i == 3) {
                    System.out.println("break");
                    i++; // Otherwise i never
                    // gets incremented.
                    break;
                }
                if (i == 7) {
                    System.out.println("continue outer");
                    i++; // Otherwise i never
                    // gets incremented.
                    continue outer;
                }
                if (i == 8) {
                    System.out.println("break outer");
                    break outer;
                }
                for (int k = 0; k < 5; k++) {
                    if (k == 3) {
                        System.out.println("continue inner");
                        continue inner;
                    }
                }
            }
        }
        // Can't break or continue to labels here
    }
}
/* Output:
i = 0
continue inner
i = 1
continue inner
i = 2
continue
i = 3
break
i = 4
continue inner
i = 5
continue inner
i = 6
continue inner
i = 7
continue outer
i = 8
break outer
注意break中断了for循环，而for循环在执行到末尾之前，它的递增表达式不会执行。
因为break导致递增表达式被跳过，所以我们在i == 3的分支下直接执行递增运算。
i == 7的分支也是这样，continue outer语句会跳到外部循环顶部，并且跳过内部循环的递增表达式执行，因此我们在这里也进行了直接递增。

如果没有break outer语句，我们就没有办法从内部循环直接跳出外部循环。
这是因为break本身只能中断最内层的循环（continue也是一样）。

如果要在中断循环的同时退出方法，直接用return就可以了。
*/
