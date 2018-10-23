package com.musanli.interface_;

/**
 * @author: li_bin .
 * @description: 测试接口 .
 * @create: 2018-10-19 09:06 .
 * 如果一个类同时实现多个接口，且多个接口中存在方法名称，相同参数，不同返回值的情况，此时会造成混乱。
 * 接口中任何域都是public static final 的，所以可以用接口来创建常量类。
 */
//public class TestInterface implements A,C {
public class TestInterface implements A,B {
    public static void main(String[] args) {
       String str = C.name;
    }
    public String getUser(String name) {
        return null;
    }

    public String getName(String name) {
        return null;
    }

    public String getlike(String name) {
        return null;
    }
}

interface A {
    String getUser(String name);
    String getlike(String name);
}
interface B {
    String getUser(String name);
    String getName(String name);
}
interface C {
    String name="祝枝山";
    int getUser(String name);
    String getName(String name);
}
