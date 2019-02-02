package com.musanli.threadlocal;

/**
 * @author: li_bin .
 * @description: .
 * @create: 2019-02-01 09:40 .
 */
public class LocalBean {
//    public static ThreadLocal<String> local = new ThreadLocal<String>();
//
//    public static String getLocal() {
//        return local.get();
//    }
//
//    public static void setLocal(String value) {
//        local.set(value);
//    }

    public static String local;

    public static String getLocal() {
        return local;
    }

    public static void setLocal(String value) {
        local = value;
    }

}
