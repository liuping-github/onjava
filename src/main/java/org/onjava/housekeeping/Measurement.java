package org.onjava.housekeeping;

// housekeeping/Measurement.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
/**
 * 也可以用同样的方式初始化非基本类型的对象。如果Depth是一个类，你可以创建一个变量，然后这样初始化：
如果没有给d一个初始值就尝试使用它，会得到一个叫作异常（exception）的运行时错误（第15章中会介绍）。
 */
class Depth {}

public class Measurement {
  Depth d = new Depth();
  // ...
}
