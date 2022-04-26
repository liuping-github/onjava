package org.onjava.housekeeping;// housekeeping/InitialValues.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Shows default initial values
/**
6.6　成员初始化
Java会不遗余力地保证变量在使用之前被正确初始化。对于方法的局部变量，这种保证以编译时错误的形式出现。所以如果代码这样写：

void f() {
  int i;
  i++;
}
你会收到一条错误消息，指出i可能未初始化。编译器可以给i一个默认值，但未初始化的局部变量更有可能是程序员的失误，而默认值会掩盖这一点。
 强制程序员提供初始化值更有可能避免错误。

然而，如果类的字段是基本类型的话，情况就会有所不同。正如在第3章中所看到的那样，类的每个基本类型字段都会获得一个初始值。
 下面的程序可以验证这一点，并显示了这个值：
 显示默认初始值
 */
public class InitialValues {
  boolean t;
  char c;
  byte b;
  short s;
  int i;
  long l;
  float f;
  double d;
  InitialValues reference;
  void printInitialValues() {
    System.out.println("Data type   Initial value");
    System.out.println("boolean     " + t);
    System.out.println("char        [" + c + "]");
    System.out.println("byte        " + b);
    System.out.println("short       " + s);
    System.out.println("int         " + i);
    System.out.println("long        " + l);
    System.out.println("float       " + f);
    System.out.println("double      " + d);
    System.out.println("reference   " + reference);
  }
  public static void main(String[] args) {
    new InitialValues().printInitialValues();
  }
}
/* Output:
Data type   Initial value
boolean     false
char        [NUL]
byte        0
short       0
int         0
long        0
float       0.0
double      0.0
reference   null
即使未指定值，类的字段也会自动被初始化（char值为零，我的输出验证系统将其转换为NUL）。所以至少不会有使用未初始化变量的危险。

当在类中定义了一个对象引用而不将其初始化时，这个引用就会被赋予一个特殊值null。
*/
