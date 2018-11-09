package com.musanli.link;

/**
 * @author: li_bin .
 * @description: 模拟链表结构 .
 * @create: 2018-11-08 19:38 .
 */
public class LinkedStackCopy<T> {

    private static class Node<U> {
        U item;
        Node<U> previous;
        Node<U> next;

        Node() {
            item = null;
            next = null;
            previous = null;
        }

        Node(Node<U> previous, U item, Node<U> next) {
            this.previous = previous;
            this.item = item;
            this.next = next;
        }

        boolean isEnd() {
            return next == null;
        }

        boolean isFirst() {
            return previous == null;
        }
    }

    private Node<T> top = new Node<T>();//End sentinel
    private Node<T> first = new Node<T>();

    //    private Node<T> end = new Node<T>();
    public void addLast(T t) {
        Node<T> tNode = new Node<T>(top, t, new Node<T>());
        top.next = tNode;
        if (top.item == null) first = tNode;
        this.top = tNode;
    }

    /**
     * 先进后出
     */
    public T pop() {
        if (top.isFirst()) {
            return null;
        }
        T item = top.item;
        top = top.previous;
        return item;
    }

    /**
     * 先进后出
     */
    public T invertedPop() {
        if (first.isEnd()) {
            return null;
        }
        T item = first.item;
        first = first.next;
        return item;
    }

    public static void main(String[] args) {
        LinkedStackCopy<String> lsc = new LinkedStackCopy<String>();
        lsc.addLast("1");
        lsc.addLast("2");
        lsc.addLast("3");
        String item = null;
        while ((item = lsc.pop()) != null) {
            System.out.println("lal:\t" + item);
        }
        System.out.println("lala------------------lala");
        while ((item = lsc.invertedPop()) != null) {
            System.out.println("lal:\t" + item);
        }
        new String("a").hashCode();
    }

}
