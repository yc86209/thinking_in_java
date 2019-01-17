package com.musanli;//: io/ChangeSystemOut.java
// Turn System.out into a PrintWriter.

import java.io.PrintWriter;

public class ChangeSystemOut {
  public static void main(String[] args) {
    PrintWriter out = new PrintWriter(System.out, false);
    out.println("Hello, world1");
    out.println("Hello, world2");
    out.flush();
  }
} /* Output:
Hello, world
*///:~
