package com.musanli.threadlocal;

/**
 * @author: li_bin .
 * @description: .
 * @create: 2019-02-01 09:42 .
 */
public class LocalRunnable implements Runnable {

    public void run() {
        LocalBean.setLocal(Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " : " + LocalBean.getLocal());
    }
}
