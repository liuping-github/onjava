package org.onjava.operators;// operators/Exponents.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// "e" means "10 to the power."

/**
 * 科学记数法（又称“指数记数法”）
 * 我一直觉得指数采用的记数法很不直观，例如：
 */
public class Exponents {
  public static void main(String[] args) {
    // Uppercase and lowercase 'e' are the same:
    float expFloat = 1.39e-43f;
    expFloat = 1.39E-43f;
    System.out.println(expFloat);
    double expDouble = 47e47d; // 'd' is optional
    double expDouble2 = 47e47; // Automatically double
    System.out.println(expDouble);
  }
}
/* Output:
1.39E-43
4.7E48
*/
/*
在科学与工程领域，“e”代表自然对数的基数，约等于2.718 （Java中的Math.E给出了它更精确的double类型值）。
例如，1.39×e-43这样的指数表达式表示1.39×2.718-43。但设计FORTRAN语言的时候，设计师决定让e代表“10的幂次”。
这个决定很奇怪，因为FORTRAN就是面向科学与工程领域的，它的设计者对引入这样容易令人混淆的概念应该更为谨慎才对4。
但不管怎样，这种惯例在C、C++以及Java中被保留了下来。
因此，如果你习惯将e作为自然对数的基数使用，那么在Java中看到像1.39e-43f这样的表达式时，请转换思维，它的含义其实是1.39×10-43。
注意，如果编译器能正确识别类型，就不需要数值后面的后缀字符。例如语句
long n3 = 200;
它不存在不确定的地方，所以200后面不用加L。但对于语句
float f4 = 1e-43f; // 10的幂次
编译器一般会将指数作为double类型处理，所以如果没有尾部的f，我们会收到一条出错提示，告诉我们必须将double类型转换成float类型。
 */