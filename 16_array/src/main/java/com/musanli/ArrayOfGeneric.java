package com.musanli;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: li_bin .
 * @description: 泛型和数组 .
 * @create: 2018-12-12 18:47 .
 */
public class ArrayOfGeneric {
    public static void main(String[] args) {
        List<String>[] ls;
//        List<String>[] ls1 = new ArrayList<String>[10];//compile error generic array creation
        List<String>[] ls2 = new ArrayList[10];
//        ls2[0] = new ArrayList<Integer>(10);//compile error
    }
}
