package com.musanli;//: io/FormattedMemoryInput.java

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileReader;
import java.io.IOException;

public class FormattedMemoryInput {
  public static void main(String[] args)
  throws IOException {
    try {
      DataInputStream in = new DataInputStream(
        new ByteArrayInputStream(
         BufferedInputFile.read(
          "D:\\Program Files (x86)\\spring-tool-suite-3.9.2\\thinking_in_java\\18_io_stream\\src\\main\\java\\com\\musanli\\FormattedMemoryInput.java").getBytes()));
      while(true)
        System.out.print(in.readLine());
//        System.out.print((char)in.readByte());
    } catch(EOFException e) {
      e.printStackTrace();
      System.err.println("End of stream");
    }
  }
} /* (Execute to see output) *///:~
class BufferedInputFile {
  // Throw exceptions to console:
  public static String
  read(String filename) throws IOException {
    // Reading input by lines:
    BufferedReader in = new BufferedReader(
            new FileReader(filename));
    String s;
    StringBuilder sb = new StringBuilder();
    while((s = in.readLine())!= null)
      sb.append(s + "\n");
    in.close();
    return sb.toString();
  }
  public static void main(String[] args)
          throws IOException {
    System.out.print(read("BufferedInputFile.java"));
  }
} /* (Execute to see output) *///:~