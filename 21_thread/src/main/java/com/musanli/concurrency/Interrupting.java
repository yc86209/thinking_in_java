package com.musanli.concurrency;//: concurrency/Interrupting.java
// Interrupting a blocked thread.

import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class SleepBlocked implements Runnable {
    public void run() {
        ff();
        System.out.println("Exiting SleepBlocked.run()");
    }

    private void ff() {
        int i = 0;
        while (true) {
            try {
                System.out.println(Thread.currentThread().getName() + "\t:\t" + i++);
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
//                e.printStackTrace();
                System.out.println("Thread.currentThread().isInterrupted():   "+Thread.currentThread().isInterrupted());

            }
        }

    }
}

class IOBlocked implements Runnable {
    private InputStream in;

    public IOBlocked(InputStream is) {
        in = is;
    }

    public void run() {
        try {
            System.out.println("Waiting for read():");
//            in.read();
            int i = 0;
            while (true) {
//                try {
//                    Thread.currentThread().sleep(1000);
//                    TimeUnit.SECONDS.sleep(1);
                System.out.println(Thread.currentThread().getName() + " current:\t" + i++);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
        } catch (Exception e) {
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("Interrupted from blocked I/O");
            } else {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Exiting IOBlocked.run()");
    }
}

class SynchronizedBlocked implements Runnable {
    public void f() {
        int i = 0;
        while (true) // Never releases lock
        {
            try {
                System.out.println(Thread.currentThread().getName() + "\t:\t" + i++);
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread.currentThread().isInterrupted():   "+Thread.currentThread().isInterrupted());
                e.printStackTrace();
            }
        }
    }

    public SynchronizedBlocked() {
//        new Thread() {
//            public void run() {
//                f(); // Lock acquired by this thread
//                System.out.println("SynchronizedBlocked-Thread end");
//            }
//        }.start();
    }

    public void run() {
        System.out.println("Trying to call f()");
        f();
        System.out.println("Exiting SynchronizedBlocked.run()");
    }
}

class WhileBlocked implements Runnable {
    public void f() {
        System.out.println("f() start.....");
        while (true) // Never releases lock
        {
//            System.out.println("1111111");
            Thread.yield();
        }
    }

    public void run() {
        System.out.println("com.musanli.concurrency.WhileBlocked.run start ....");
        f();
        System.out.println("com.musanli.concurrency.WhileBlocked.run end ....");
    }
}

public class Interrupting {
    private static ExecutorService exec = Executors.newCachedThreadPool();

    static void test(Runnable r) throws InterruptedException {
        Future<?> f = exec.submit(r);
        TimeUnit.MILLISECONDS.sleep(1000);
        System.out.println("Interrupting " + r.getClass().getName());
        f.cancel(true); // Interrupts if running
        System.out.println("Interrupt sent to " + r.getClass().getName());
    }

    public static void main(String[] args) throws Exception {
        test(new SleepBlocked());
//        test(new IOBlocked(System.in));
//        test(new SynchronizedBlocked());
//        test(new WhileBlocked());
        TimeUnit.SECONDS.sleep(20);
        System.out.println("Aborting with System.exit(0)");
        System.exit(0); // ... since last 2 interrupts failed
    }
} /* Output: (95% match)
Interrupting SleepBlocked
InterruptedException
Exiting SleepBlocked.run()
Interrupt sent to SleepBlocked
Waiting for read():
Interrupting IOBlocked
Interrupt sent to IOBlocked
Trying to call f()
Interrupting SynchronizedBlocked
Interrupt sent to SynchronizedBlocked
Aborting with System.exit(0)
*///:~
