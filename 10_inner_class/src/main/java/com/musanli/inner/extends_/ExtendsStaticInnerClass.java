package com.musanli.inner.extends_;

/**
 * @author: li_bin .
 * @description: 静态内部类继承内部类 .
 * @create: 2018-10-23 08:24 .
 */
public class ExtendsStaticInnerClass extends OuterClass.StaticInnerClass {
    /**   静态内部类不需要重写方法。不用声明外部类的对象  */
    ExtendsStaticInnerClass(){}
    public static void main(String[] args) {
        ExtendsStaticInnerClass esc = new ExtendsStaticInnerClass();
        esc.like = "打球";
        System.out.println(esc.getLike());
    }
}



