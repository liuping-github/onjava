package org.onjava.control;// control/ForInInt.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

/**
 * 第7章会介绍静态引入（static import），不过现在你就可以直接使用这个库，而不需要了解具体的细节。
 * 你可以在import这一行看到static import语法：
 */

import static org.onjava.onjava.Range.range;

public class ForInInt {
    public static void main(String[] args) {
        for (int i : range(10)) // 0..9
            System.out.print(i + " ");
            System.out.println();
        for (int i : range(5, 10)) // 5..9
            System.out.print(i + " ");
            System.out.println();
        for (int i : range(5, 20, 3)) // 5..20 step 3
            System.out.print(i + " ");
            System.out.println();
        for (int i : range(20, 5, -3)) // Count down
            System.out.print(i + " ");
            System.out.println();
    }
}
/* Output:
0 1 2 3 4 5 6 7 8 9
5 6 7 8 9
5 8 11 14 17
20 17 14 11 8

range()方法已经被重载（overloaded），重载表示方法名相同但具有不同的参数列表（你很快就会学到重载）。
range()方法的第一种重载形式是从0开始产生值，直到范围的上限，但不包括这个上限。第二种形式是从第一个参数值开始产生值，直到比第二个参数值小为止。
第三种形式有一个步进值，它每次增加的步幅为该值。在第四种形式中可以倒计时。range()其实就是一个简化版的生成器，本书稍后会介绍它。

range()方法让我们可以在更多的地方使用for-in语法，因此可以说提高了可读性。

注意System.out.print()不会生成换行，你可以在一行里输出相关内容。

for-in语法不仅方便代码的编写，更重要的是让代码更容易阅读，它表明了你打算做什么（获取数组中的每一个元素），
而不是给出如何做的实现细节（“我创建了一个索引，用来选取数组里的每个元素”）。本书更提倡使用for-in语法。
*/
