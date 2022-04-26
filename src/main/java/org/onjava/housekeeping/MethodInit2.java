package org.onjava.housekeeping;

// housekeeping/MethodInit2.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
/**
这个方法可以有参数，但这些参数必须是已经初始化了的。因此，可以这样写：

public class MethodInit2 {
    int i = f();
    int j = g();
    int k = h();

    int f() {
        return 1;
    }

    int g() {
        return 2;
    }

    int h() {
        return 3;
    }
}
 */
public class MethodInit2 {
  int i = f();
  int j = g(i);
  int f() { return 11; }
  int g(int n) { return n * 10; }
}
