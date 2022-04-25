package org.onjava.control;// control/ForInFloat.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
/**
for-in语法
Java 5引入了一种更加简洁的for语法，可以用于数组和容器（这部分内容会在第12章和第21章中进一步讲解）。
这种语法有时候叫作“增强的for”（enhanced for）。大部分文档中直接将其称为foreach语法，但Java 8里又增加了一个我们经常使用的forEach()方法。
这样的术语使用起来容易混淆，因此我找了点儿依据，就直接称这种语法为for-in（比如在Python中，实际上的语法就是for x in sequence，所以这样的称呼是有合理的先例的）。
请记住，你可能会在不同的地方看到它的不同叫法。

for-in语句会自动为你生成每一项元素，这样你就不需要创建int变量来对这个元素构成的序列进行计数。假设有一个float数组，你想要选取该数组中的每一个元素：
 */
import java.util.Random;

public class ForInFloat {
  public static void main(String[] args) {
    Random rand = new Random(47);
    float[] f = new float[10];
    for(int i = 0; i < 10; i++)
      f[i] = rand.nextFloat();
    //下面这行代码中使用的就是for-in语法：
    for(float x : f)
      System.out.println(x);
  }
}
/* Output:
0.72711575
0.39982635
0.5309454
0.0534122
0.16020656
0.57799757
0.18847865
0.4170137
0.51660204
0.73734957
这个数组是用旧式的for循环来填充的，因为在填充时必须按索引访问。下面这行代码中使用的就是for-in语法：
for(float x : f) {
这条语句定义了一个float类型的变量x，然后会将数组f里的每一个元素按顺序赋给x。
*/
