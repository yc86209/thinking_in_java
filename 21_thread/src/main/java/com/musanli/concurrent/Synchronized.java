package com.musanli.concurrent;

/**
 * @author: li_bin .
 * @description: .
 * @create: 2019-02-22 09:17 .
 */
public class Synchronized {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(System.identityHashCode(new String("王")));
        System.out.println(System.identityHashCode(new String("王")));
        System.out.println(System.identityHashCode(new String("王")));
        long start = System.currentTimeMillis();
        SynchronizedThread st = new SynchronizedThread();
        st.setName(new String("王"));
        Thread thread1 = new Thread(st);
        thread1.start();
        Thread.currentThread().sleep(100);

//        st.setName(new String("王"));
//        st.setName("阳");
        Thread thread2 = new Thread(st);
        thread2.start();
        long end = System.currentTimeMillis();
    }
}

class SynchronizedThread implements Runnable {
    private String name;

    public void run() {
        tt();
    }

    public String getName() {
        String name1 = Thread.currentThread().getName();
        System.out.println(name1 + "\t\tgetName");
        return name;
    }

    public void setName(String name) {
        String name1 = Thread.currentThread().getName();
//        System.out.println(name1 + "\t\tgetName");
        this.name = name;
    }

    public void tt() {
        synchronized (this.name) {
            try {
                System.out.println(Thread.currentThread().getName() + "\tstart:\t" + this.name);
                Thread.currentThread().sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "\t  end:\t" + this.name);
        }
    }
}
