package com.musanli.check;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author: li_bin .
 * @description: 类型检查 .
 * @create: 2018-11-25 16:18 .
 */
public class TypeCheck {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        add(list);
        System.out.println(list);
        List<Integer> list2 = Collections.checkedList(new ArrayList<Integer>(),Integer.class);
        System.out.println(list2.getClass().getName());
        add(list2);
        System.out.println(list2);
    }
    public static void add(List list){
        list.add("Hello");
    }

}
