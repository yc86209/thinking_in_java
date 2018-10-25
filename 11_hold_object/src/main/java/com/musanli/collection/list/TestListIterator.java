package com.musanli.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * @author: li_bin .
 * @description: 测试ListIterator .
 * @create: 2018-10-25 19:41 .
 */
public class TestListIterator {
    public static void main(String[] args) {
        int i = 65;
        List<Character> list = new ArrayList<Character>(Arrays.asList((char) i++, (char) i++
                , (char) i++, (char) i++, (char) i++, (char) i++, (char) i++, (char) i++
                , (char) i++, (char) i++, (char) i++, (char) i++, (char) i++
                , (char) i++, (char) i++, (char) i++, (char) i++, (char) i++));
        System.out.println(list);
        ListIterator<Character> listiterator = list.listIterator();
        System.out.println("hasPrevious: "+listiterator.hasPrevious());
        System.out.println("next: "+listiterator.next());
        System.out.println("previousIndex: "+listiterator.previousIndex());
        System.out.println("previousIndex: "+listiterator.previousIndex());
        System.out.println("nextIndex: "+listiterator.nextIndex());
        System.out.println("nextIndex: "+listiterator.nextIndex());
        System.out.println("previous: "+listiterator.previous());
    }
}
