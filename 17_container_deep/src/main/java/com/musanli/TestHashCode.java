package com.musanli;


/**
 * @author: li_bin .
 * @description: 测试hashcode .
 * @create: 2018-12-19 09:08 .
 */
public class TestHashCode {
    public static void main(String[] args) {
        System.out.println(new A("name",1).hashCode());
        System.out.println(new A("name",1).hashCode());
    }
}

class A {
    private String name;
    private int age;

    public A(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
