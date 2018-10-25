package com.musanli.collection.print;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.SynchronousQueue;

/**
 * @author: li_bin .
 * @description: 控制台输出集合 .
 * @create: 2018-10-25 19:12 .
 */
public class PrintCollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("aa");
        list.add("aaa");
        System.out.println(list);
        Queue<String> queue = new SynchronousQueue<String>();
        queue.add("");
        queue.element();

    }
}

