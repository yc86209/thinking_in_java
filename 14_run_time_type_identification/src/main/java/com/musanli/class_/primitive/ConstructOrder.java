package com.musanli.class_.primitive;

/**
 * @author: li_bin .
 * @description: 初始化顺序 .
 * @create: 2018-11-06 12:53 .
 */
public class ConstructOrder {
    public static void main(String[] args) throws ClassNotFoundException {
//        Class<B> bClass = B.class;
//        Class<A> aClass = A.class;
//        Class.forName(B.class.getName());
        new B();
        System.out.println("#\u6ce8\u518c\u4e2d\u5fc3\u540d\u79f0");
    }
}

class A {
public A(){
        System.out.println(A.class.getName()+".Construt();");
    }
    public A(String name){
        System.out.println(A.class.getName()+".Construt();...." + name);
    }
static {
    System.out.println("A 静态块");
}

}

class B extends A {
    public static A a = new A("有参构造");
    static {
        System.out.println("B 静态块");
    }
    B(){
        System.out.println(B.class.getName()+".Contrut()");
    }

}
