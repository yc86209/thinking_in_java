package com.musanli.yield;

/**
 * Java线程中的Thread.yield( )方法，译为线程让步。顾名思义，就是说当一个线程使用了这个方法之后，它就会把自己CPU执行的时间让掉，
 * 让自己或者其它的线程运行，注意是让自己或者其他线程运行，并不是单纯的让给其他线程。
 *
 * @author: li_bin .
 * @description: .
 * @create: 2019-02-21 21:29 .
 */
public class YieldExcemple {
    public static void main(String[] args) {
        Thread threada = new ThreadA();
        Thread threadb = new ThreadB();
        // 设置优先级:MIN_PRIORITY最低优先级1;NORM_PRIORITY普通优先级5;MAX_PRIORITY最高优先级10
        threada.setPriority(Thread.MIN_PRIORITY);
        threadb.setPriority(Thread.MIN_PRIORITY);

        threada.start();
        threadb.start();
    }
}

class ThreadA extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("ThreadA--" + i + "\t\t" + System.currentTimeMillis());
//            Thread.yield();
        }
    }
}

class ThreadB extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("ThreadB--" + i + "\t\t" + System.currentTimeMillis());
            Thread.yield();
        }
    }
}
