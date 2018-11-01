package com.musanli.log;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @author: li_bin .
 * @description: 测试util包下的log .
 * @create: 2018-10-31 08:59 .
 */
public class TestLoggerException extends Exception {
    public static Logger log = Logger.getLogger(TestLoggerException.class.getName() + ": ");

    public TestLoggerException() {
        StringWriter sw = new StringWriter();
        printStackTrace(new PrintWriter(sw));
        log.severe(sw.toString());
    }

    public static void main(String[] args) {
//        new TestLoggerException();
//        System.out.println("end");
        try {
            throw new TestLoggerException();
        } catch (TestLoggerException e) {
            System.out.println("catch: " + e);
        }
    }
}
