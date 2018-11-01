package com.musanli.log;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @author: li_bin .
 * @description: 测试util包下的log .
 * 记录异常信息，及重定向异常信息输出
 * @create: 2018-10-31 08:59 .
 */
public class TestLoggerException2 extends Exception {
    public static Logger log = Logger.getLogger(TestLoggerException2.class.getName() + ": ");
    public static void exceptionLog(Exception e){
        StringWriter sw = new StringWriter();
        e.printStackTrace(new PrintWriter(sw));
        log.severe("startL: " + sw.toString());
        log.severe("End: ");
    }
    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        }catch (NullPointerException e){
            exceptionLog(e);
        }
    }
}
