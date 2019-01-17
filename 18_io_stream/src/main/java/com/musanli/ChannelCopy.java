package com.musanli;//: io/ChannelCopy.java
// Copying a file using channels and buffers
// {Args: ChannelCopy.java test.txt}

import java.nio.*;
import java.nio.channels.*;
import java.io.*;

public class ChannelCopy {
    private static final int BSIZE = 20;

    public static void main(String[] args) throws Exception {
//        if (args.length != 2) {
//            System.out.println("arguments: sourcefile destfile");
//            System.exit(1);
//        }
        FileChannel in = new FileInputStream("D:\\Program Files (x86)\\spring-tool-suite-3.9.2\\thinking_in_java\\18_io_stream\\test.out").getChannel(),
                out = new FileOutputStream("D:\\Program Files (x86)\\spring-tool-suite-3.9.2\\thinking_in_java\\18_io_stream\\testWrite.out").getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
        while (in.read(buffer) != -1) {
            buffer.flip(); // Prepare for writing
            out.write(buffer);
            buffer.clear();  // Prepare for reading
        }
    }
} ///:~
