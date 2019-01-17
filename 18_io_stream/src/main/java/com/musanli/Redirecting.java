package com.musanli;//: io/Redirecting.java
// Demonstrates standard I/O redirection.

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Redirecting {
  public static void main(String[] args)
  throws IOException {
    PrintStream console = System.out;
    BufferedInputStream in = new BufferedInputStream(
      new FileInputStream("D:\\Program Files (x86)\\spring-tool-suite-3.9.2\\thinking_in_java\\18_io_stream\\src\\main\\java\\com\\musanli\\Redirecting.java"));
    PrintStream out = new PrintStream(
      new BufferedOutputStream(
        new FileOutputStream("D:\\Program Files (x86)\\spring-tool-suite-3.9.2\\thinking_in_java\\18_io_stream\\test.out")));
    System.setIn(in);
    System.setOut(out);
//    System.setErr(out);
    BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
    String s;
    while((s = br.readLine()) != null)
      System.out.println(s);
    System.out.println("555555");
    out.close(); // Remember this!
    System.setOut(console);
  }
} ///:~
