package com.musanli.collection.queue;

import java.util.PriorityQueue;
import java.util.Random;

/**
 * @author: li_bin .
 * @description: 测试有序队列 .
 *  1、允许重复。
 *  2、最小值拥有最高的优先级。（如果是字符串空格也算作优先级并且比字母的优先级高）
 *  3、泛型必须要实现comparator方法才能实现排序。
 * @create: 2018-10-29 12:48 .
 */
public class TestPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pqi = new PriorityQueue<Integer>();
        PriorityQueue<TestPriorityQueue> pqo = new PriorityQueue<TestPriorityQueue>();
        for (int i=0 ;i<100 ;i++){
            int rand = new Random().nextInt(100);
            System.out.print(rand +",\t");
            pqi.add(rand);
        }
        pqi.remove(0);
        System.out.println();
        System.out.println(pqi);
        while(pqi.peek() != null){
            System.out.print(pqi.poll() + ",\t");
        }
    }
}
