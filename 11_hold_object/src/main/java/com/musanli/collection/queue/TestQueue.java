package com.musanli.collection.queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: li_bin .
 * @description: 测试序列 .
 * @create: 2018-10-26 08:52 .
 */
public class TestQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>(Arrays.asList("1","12","123","1234","12345","123456","7","78"));
//        printQ(queue);
        printPoll(queue);
        System.out.println(queue.size());
        System.out.println( TestQueue.class.getName());
    }

    public static void printQ(Queue queue) {
        while (queue.peek() != null) {
            System.out.println(queue.remove()+"\t\tsize:"+queue.size());
        }
    }

    public static void printPoll(Queue queue) {
        while (queue.peek() != null) {
            System.out.println(queue.poll()+"\t\tsize:"+queue.size());
        }
    }
}
