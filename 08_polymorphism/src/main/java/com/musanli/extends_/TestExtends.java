package com.musanli.extends_;

/**
 * @author: li_bin .
 * @description: 测试继承 .
 * @create: 2018-10-19 08:18 .
 */
public class TestExtends {
    public static void main(String[] args) {
        B b = new B("hello");
        b.mail();
    }
}

class A{
    public static int i = 0;
    A(){
        this.fox();
    }

    protected void fox() {
        System.out.println("A类fox"+this.getClass().getName());
    }
    protected void mail() {
        System.out.println("A类mail"+this.getClass().getName());
    }
}

class B extends A{
    private String str;
    B(String str){
        this.str = str;
        this.fox();
    }

    protected void fox() {
        System.out.println("B类"+this.getClass().getName()+"\t"+str);
    }
}