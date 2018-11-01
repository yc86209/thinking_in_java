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
public class TestLoggerException3 extends Exception {
    public static Logger log = Logger.getLogger(TestLoggerException3.class.getName() + ": ");


    /**   异常传递  */
    public static void main(String[] args) {
        printException();
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            Throwable throwable = e.fillInStackTrace();
            try {
                throw ((Exception) throwable);
            } catch (Exception e1) {
                e1.printStackTrace();
            }finally{
                System.out.println("你好啊");
            }
        }
    }

    public static void printException() {
        try {
            throw new Exception("玩呢");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally{
            System.err.println("你好啊");
        }
    }
}
