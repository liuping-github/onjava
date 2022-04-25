package org.onjava.housekeeping;
// housekeeping/Apricot.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

/**
 * 假设你想在一个方法里获得对当前对象的引用。
 * 但该引用是由编译器隐式传入的——它不在参数列表中。
 * 不过Java提供了一个很方便的关键字：this。
 * this关键字只能在非静态方法中使用。
 * 当你想在方法里调用对象时，直接使用this就可以了，因为它表示对该对象的引用。
 * 可以像使用任何其他对象引用一样使用this。
 * 如果从类的一个方法中调用该类的另一个方法，那就没必要使用this，直接调用即可。
 * 当前方法里的this引用会自动应用于同一类中的其他方法。因此，可以这样写：
 */
public class Apricot {
  void pick() { /* ... */ }
  void pit() { pick(); /* ... */ }
}
/*
在pit()里面，你也可以使用this.pick()，但没有必要。
编译器会自动帮你添加。
当需要明确指出当前对象的引用时，才使用this关键字。
例如，它经常用在return语句中，来返回对当前对象的引用：
 */
