package com.musanli;

/**
 * @author: li_bin .
 * @description: 构造器初始化执行顺序 .
 * @create: 2018-10-15 16:42 .
 */
public class construction {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        System.err.println(testClass.w1.hashCode());
        System.err.println(testClass.w12.hashCode());
        System.err.println(testClass.w2.hashCode());
        System.err.println(testClass.w22.hashCode());
    }
}
class TestClass{
    TestClass(){
        System.out.println(this.getClass().getName());
    }
    Windows w1 = new Windows();
    Windows w12 = new Windows();
    Windows w2 = new Windows(1);
    Windows w22 = new Windows(100);
}
class Windows{
    int i;
    Windows(){
        System.out.println("hello :" + this.hashCode());
    }
    Windows(int i){
        this.i = i;
        System.out.println("hello-i :"+ this.hashCode());
    }
}