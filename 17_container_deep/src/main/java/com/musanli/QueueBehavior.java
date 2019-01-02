package com.musanli;//: containers/QueueBehavior.java
// Compares the behavior of some of the queues

import java.util.concurrent.*;
import java.util.*;

public class QueueBehavior {
    private static int count = 10;

    static <T> void test(Queue<T> queue, Generator<T> gen) {
        for (int i = 0; i < count; i++)
            queue.offer(gen.next());
        while (queue.peek() != null)
            System.out.print(queue.remove() + " ");
        System.out.println();
    }

    static class Gen implements Generator<String> {
        String[] s = ("one two three four five six seven " +
                "eight nine ten").split(" ");
        public String next() {
            return s[i++];
        }

        int i;
    }

    public static void main(String[] args) {
        new LinkedList<String>().add(null);
        HashSet<String> set = new HashSet<String>();
        set.add(null);
        set.add(null);
//        new HashMap<String,String>(null,"ddd");
        /*   LinkedList根据插入顺序   */
        test(new LinkedList<String>(), new Gen());
        /*   根据插入数据的字典顺序，或者compartor   */
        test(new PriorityQueue<String>(), new Gen());
        test(new ArrayBlockingQueue<String>(count), new Gen());
        test(new ConcurrentLinkedQueue<String>(), new Gen());
        test(new LinkedBlockingQueue<String>(), new Gen());
        test(new PriorityBlockingQueue<String>(), new Gen());
    }
} /* Output:
one two three four five six seven eight nine ten
eight five four nine one seven six ten three two
one two three four five six seven eight nine ten
one two three four five six seven eight nine ten
one two three four five six seven eight nine ten
eight five four nine one seven six ten three two
*///:~

interface Generator<T> {
    T next();
} ///:~