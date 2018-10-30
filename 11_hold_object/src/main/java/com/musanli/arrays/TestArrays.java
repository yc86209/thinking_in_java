package com.musanli.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

/**
 * @author: li_bin .
 * @description: 测试Arrays与Collection .
 * @create: 2018-10-25 08:50 .
 */
public class TestArrays {
    public static void main(String[] args) {
        Collection<Integer> coll = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        Integer moreInts[]={6,7,8,9,10};
        coll.addAll(Arrays.asList(moreInts));
        Collections.addAll(coll,11,12,13,14);
        Integer moreInts2[]={16,17,18,19,15};
        Collections.addAll(coll,moreInts2);
        List list = new Vector<Integer>();
        list.add(100);
        list.set(0,99);
        System.out.println(list);
        System.out.println(coll);
        //Arrays.asList 方法返回值为Arrays&ArrayList 而不是Arraylist 。并且Arrays&ArrayList继承abstractList (中定义add方法抛出java.lang.UnsupportedOperationException异常)
        List<String> strings = Arrays.asList("a", "b", "c", "d", "e", "f");
        System.out.println(strings);
        System.out.println(strings.getClass().getName());
        strings.add("g");
        System.out.println(strings);
    }
}
