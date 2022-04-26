package org.onjava.housekeeping;// housekeeping/TypeInference.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// {NewFeature} Since JDK 11

/**
 * 6.10　新特性：局部变量类型推断
 * JDK 11提供了一个用来简化局部变量定义的特性。它最先在JDK 10中添加，但随后在JDK 11中进行了改进。在一个局部定义中（即在方法内部），编译器可以自动发现类型。这就是类型推断（type inference），我们可以通过var关键字启用它：
 * {NewFeature} 从JDK 11开始
 * {NewFeature}注释标签会从基于JDK 8的Gradle构建中排除这个示例。
 *
 * 在method()中，我们比较了（经典的）显式类型规范与var方式。使用var时，我们仍然可以从初始化值中看到类型是String或Plumbus，而不需要添加冗余的类型规范。
 *
 * 静态方法也允许类型推断。
 * NoInference类显示了使用var时的一些限制。你不能在字段上使用类型推断，即使看起来我们已经有了足够的信息来推断。
 * 如果你不提供任何初始化数据，或者提供了null，编译器就没有可以推断类型的信息，因此无法推断出变量noInitializer和aNull的类型。
 * inferReturnType()方法的定义方式也不被允许，即使编译器似乎有足够的信息来确定方法的返回类型。
 *
 * 类型推断不能用于方法的参数。首先来说，Java不支持默认参数（default argument），因此也就无法提供类型推断所需的初始化值。
 */
class Plumbus {}

public class TypeInference {
  void method() {
    // Explicit type:
    String hello1 = "Hello";
    // Type inference:
    String hello = "Hello!";
    // Works for user-defined types:
    Plumbus pb1 = new Plumbus();
    Plumbus pb2 = new Plumbus();
  }
  // Also works for static methods:
  static void staticMethod() {
    String hello = "Hello!";
    Plumbus pb2 = new Plumbus();
  }
}

class NoInference {
  String field1 = "Field initialization";
  // var field2 = "Can't do this";
  // void method() {
  //   var noInitializer; // No inference data
  //   var aNull = null;  // No inference data
  // }
  // var inferReturnType() {
  //   return "Can't infer return type";
  // }
}
