package com.musanli;

import com.musanli.util.CommonUtil;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * @author: li_bin .
 * @description: 重定向System.out .
 * @create: 2018-10-30 19:36 .
 */
public class RedirectSystemOut {
    public static void main(String[] args) {
        PrintStream out = System.out;
        System.out.println(CommonUtil.getProjectPath(RedirectSystemOut.class));
        try {
            /*   将控制台输出重定向到文件   */
            System.setOut(new PrintStream(new FileOutputStream(CommonUtil.getProjectPath(RedirectSystemOut.class)+"/log.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("你好");
//        System.setOut();
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("user.dir"));
        System.out.println(RedirectSystemOut.class.getResource(""));
        System.out.println(RedirectSystemOut.class.getResource("/"));
        System.out.println(new File("").getAbsolutePath());
        /**   将控制台输出重定向到控制台  */
        System.setOut(out);
        System.out.println(System.getProperty("java.class.path"));
//        System.setErr();
    }
}
