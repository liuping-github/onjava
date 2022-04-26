package org.onjava.housekeeping;// housekeeping/Burrito.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

/**
 * 尽管enum似乎是一种新的数据类型，但这个关键字只是在生成枚举类时触发了编译器的一些操作，因此在很大程度上你可以将enum视作其他任何类来处理。事实上，enum的确是一个类，并且有自己的方法。
 *
 * enum有一个很好的特性，就是可以在switch语句中使用：
 * switch旨在从一组有限的可能值中进行选择，因此它和enum正是理想的组合。注意示例中enum名字是如何更清晰地表达我们的意图的。
 *
 * 通常，你可以把enum当作另一种创建数据类型的方法，然后直接将所得到的类型拿来使用即可。这就是关键——你无须过多考虑它们。
 * 在引入enum之前，你需要付出很多努力才能创建一个可以安全使用的类似功能。
 *
 * 这些介绍足以让你理解和使用基本的enum，我们将在进阶卷第1章中进行更深入的研究。
 */
public class Burrito {
  Spiciness degree;
  public Burrito(Spiciness degree) {
    this.degree = degree;
  }
  public void describe() {
    System.out.print("This burrito is ");
    switch(degree) {
      case NOT:    System.out.println(
                      "not spicy at all.");
                   break;
      case MILD:
      case MEDIUM: System.out.println("a little hot.");
                   break;
      case HOT:
      case FLAMING:
      default:     System.out.println("maybe too hot.");
    }
  }
  public static void main(String[] args) {
    Burrito
      plain = new Burrito(Spiciness.NOT),
      greenChile = new Burrito(Spiciness.MEDIUM),
      jalapeno = new Burrito(Spiciness.HOT);
    plain.describe();
    greenChile.describe();
    jalapeno.describe();
  }
}
/* Output:
This burrito is not spicy at all.
This burrito is a little hot.
This burrito is maybe too hot.
*/
