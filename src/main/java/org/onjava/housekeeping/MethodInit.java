package org.onjava.housekeeping;

// housekeeping/MethodInit.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
/*
还可以通过调用方法来提供初始值：
 
public class MethodInit {
    int i = f();
    int j = g();

    int f() {
        return 11;
    }

    int g() {
        return 22;
    }
}
Depth d = new Depth();

public class MethodInit {
    public static void main(String[] args) {
        Depth d = new Depth();
        System.out.println(d.getDepth());
    }
}
 */
public class MethodInit {
  int i = f();
  int f() { return 11; }
  public static void main(String[] args) {
    Depth d = new Depth();
  }
}
