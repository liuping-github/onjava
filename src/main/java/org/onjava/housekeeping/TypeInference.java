package org.onjava.housekeeping;// housekeeping/TypeInference.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// {NewFeature} Since JDK 11

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
