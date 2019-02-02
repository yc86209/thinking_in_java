package com.musanli.threadlocal;

/**
 * @author: li_bin .
 * @description: .
 * @create: 2019-02-01 09:42 .
 */
public class ThreadLocalMain {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Thread thread1 = new Thread(new LocalRunnable(), "Thread-" + i);
            thread1.start();
        }
    }
}
