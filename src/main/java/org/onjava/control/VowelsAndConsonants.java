package org.onjava.control;// control/VowelsAndConsonants.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Demonstrates the switch statement
/**
 switch
switch有时也叫作选择语句。根据整数表达式的值，switch语句从多个代码片段中选择一个去执行。通常它的格式如下：

switch(integral-selector) {
  case integral-value1 : statement; break;
  case integral-value2 : statement; break;
  case integral-value3 : statement; break;
  case integral-value4 : statement; break;
  case integral-value5 : statement; break;
  // ...
  default: statement;
}
其中，整数选择器（integral-selector）是一个能生成整数值的表达式，switch将这个表达式的结果与每个整数值（integral-value）相比较。
 如果发现相等，就执行对应的语句（单条语句或多条语句，不要求使用花括号包围）。若没有发现相等，就执行默认（default）语句。

注意上面的定义里每个case都用一个break结尾，它会让执行流程跳到switch主体的末尾。示例展示的是创建switch语句的常规方式，但break是可选的。
 如果省略，后面的case语句也会被执行，直到遇到一个break。尽管你通常不会想要这种行为，但对有经验的程序员来说这可能会有用处。
 注意最后的default语句里没有break，这是因为default语句执行完的地方，本来就是break跳转的目的地。
 如果觉得对编程风格而言这很重要，你可以在default语句的末尾放置一个break，这不会有任何影响。

switch语句是一种实现多路选择（即从多个不同执行路径中挑选）的干净简洁的方式。但在Java 7之前，
 它的选择器执行结果必须是整数值，比如int或char。对非整数类型（在Java 7及之后的版本中，字符串也可以用作选择器），你只能使用一系列的if语句。
 在下一章的末尾，你会了解到enum能帮忙缓解这种限制，因为enum可以轻松地和switch结合使用。

下面这个例子会随机生成英文字母，并判断它们是元音还是辅音：
 */

import java.util.Random;

public class VowelsAndConsonants {
  //展示switch语句的常规方式
  public static void main(String[] args) {
    Random rand = new Random(47);
    for(int i = 0; i < 100; i++) {
      int c = rand.nextInt(26) + 'a';
      System.out.print((char)c + ", " + c + ": ");
      switch(c) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u': System.out.println("vowel");
                  break;
        case 'y':
        case 'w': System.out.println("Sometimes vowel");
                  break;
        default:  System.out.println("consonant");
      }
    }
  }
}
/* Output: (First 13 Lines)
y, 121: Sometimes vowel
n, 110: consonant
z, 122: consonant
b, 98: consonant
r, 114: consonant
n, 110: consonant
y, 121: Sometimes vowel
g, 103: consonant
c, 99: consonant
f, 102: consonant
o, 111: vowel
w, 119: Sometimes vowel
z, 122: consonant
                  ...
Random.nextInt(26)会产生一个0~25范围内的值，所以你只需要加上一个偏移量a，就能生成小写字母。
在case语句中，使用单引号包围的字符也能生成用于比较的整数值。

注意这些case语句是怎么“堆叠”在一起，从而为一段特定代码形成多重匹配的。
将break语句置于这段特殊代码的末尾十分重要，否则控制流程就会直接下移，继续执行后面的case语句。

在以下语句中：

int c = rand.nextInt(26) + 'a';
Random.nextInt()产生了一个0~25范围内的随机int值，然后和a的值相加。这表示a会自动转换为int，以执行加法操作。

如果想把c当作字符来打印，则必须将它转型为char，否则将输出整数值。
*/
