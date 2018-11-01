package com.musanli.finally_;

/**
 * @author: li_bin .
 * @description: 测试finally .
 * @create: 2018-10-31 19:27 .
 */
public class TestFinally {
    public static void main(String[] args) {
//        superException();
//        returnException();
        superReturnException();
    }

    /**
     * finally 既是catch无法抓住异常也会执行finally块。
     */
    public static void superException() {
        try {
            throw new NullPointerException();
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            System.err.println("finally...");
        }
    }


    /**
     * finally 语句无论如何都会被调用
     */
    public static void returnException() {
        try {
            return;
            //            throw new NullPointerException();
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            System.err.println("finally...");
        }
    }

    /**
     * 抛出了异常，但是完全没有输出
     */
    public static void superReturnException() {
        try {
            throw new NullPointerException();
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            return;
//            System.err.println("finally...");
        }
    }
}
