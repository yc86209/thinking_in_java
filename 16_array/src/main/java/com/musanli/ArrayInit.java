package com.musanli;

import java.util.Arrays;

/**
 * @author: li_bin .
 * @description: 数组初始化 .
 * @create: 2018-12-12 18:24 .
 */
public class ArrayInit {
    public static void main(String[] args) {
        int[] intArr = new int[10];//初始化 0
        boolean[] booleanArr = new boolean[10];//初始化 false
        char[] charArr = new char[10];//初始化 0 然后强转为char
        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(booleanArr));
        System.out.println(Arrays.toString(charArr));
        System.out.println((int)charArr[0]);
    }
}
