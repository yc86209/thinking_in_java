package com.musanli;//: io/TransferTo.java
// Using transferTo() between channels
// {Args: TransferTo.java TransferTo.txt}
import java.nio.channels.*;
import java.io.*;

public class TransferTo {
  public static void main(String[] args) throws Exception {
    FileChannel
      in = new FileInputStream("D:\\Program Files (x86)\\spring-tool-suite-3.9.2\\thinking_in_java\\18_io_stream\\test.out").getChannel(),
      out = new FileOutputStream("D:\\Program Files (x86)\\spring-tool-suite-3.9.2\\thinking_in_java\\18_io_stream\\testWrite.out").getChannel();

    out.transferTo(0, in.size(), out);
//    in.transferTo(0, in.size(), out);
    // Or:
     out.transferFrom(in, 0, in.size());
  }
} ///:~
