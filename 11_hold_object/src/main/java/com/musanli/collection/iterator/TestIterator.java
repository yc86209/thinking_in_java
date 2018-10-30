//package com.musanli.collection.iterator;
//
//import java.util.Iterator;
//import java.util.List;
//
///**
// * @author: li_bin .
// * @description: 测试迭代器 .
// * for-each循环仅应用于实现了Iterable接口的Java array和Collection类，
// * @create: 2018-10-29 19:15 .
// */
//public class TestIterator {
//    public static void main(String[] args) {
//        List<String> list = null;
//        for (String s:list){
//
//        }
//    }
//
//    public static void iteratorString(IteratorClass it) {
////        while(it.hasNext()){
////            System.out.println(it.next());
////        }
//        for (String t : it) {
//            System.out.println(t);
//
//        }
//    }
//
//
//    public static <T extends Object> void iterator(Iterator<T> it) {
////        while(it.hasNext()){
////            System.out.println(it.next());
////        }
//        for ( Object t : it) {
//
//foreach not applicable to type java.util.Iterator
//        }
//    }
//}
//
//class IteratorClass implements Iterator<String> {
//String[] words = null;
//public Iterator<String> iterator(){
//    return new Iterator<String>(){
//        int index = 0;
//        public boolean hasNext() {
//            return false;
//        }
//        public String next() {
//            return null;
//        }
//
//        public void remove() {
//
//        }
//    };
//}
//
//    public boolean hasNext() {
//        return false;
//    }
//
//    public String next() {
//        return null;
//    }
//}
