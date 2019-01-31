package com.musanli;//: concurrency/LiftOff.java
// Demonstration of the Runnable interface.

public class LiftOffCopy extends Thread {
    public static void main(String[] args) {
        Thread thread = new Thread(new LiftOffCopy());
    }

    protected int countDown = 10; // Default
    private static int taskCount = 0;
    private final int id = taskCount++;

    public LiftOffCopy() {
    }

    public LiftOffCopy(int countDown) {
        this.countDown = countDown;
    }

    public String status() {
        return "#" + id + "(" + (countDown > 0 ? countDown : "Liftoff!") + "), ";
    }

    public void run() {
        while (countDown-- > 0) {
            System.out.print(status());
            Thread.yield();
        }
    }
} ///:~
