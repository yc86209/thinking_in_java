package com.musanli.inner.static_;

import sun.plugin2.main.client.WMozillaServiceDelegate;

/**
 * @author: li_bin .
 * @description: 静态内部类 .
 * @create: 2018-10-22 08:52 .
 */
public class StaticOuterClass {
    public static void main(String[] args) {
        /**   静态内部类  */
        StaticOuterClass.StaticInner socsi = new StaticOuterClass.StaticInner();
        StaticOuterClass.StaticInner.getOuter();
        System.out.println();
    }

    private String name;
    /**   静态内部类 - 不依附与外部类  */
    public static class StaticInner{
        /**   静态内部类可以声明静态的方法，而非静态内部类不能声明非静态方法。  */
        public static StaticOuterClass getOuter(){
            return new StaticOuterClass();
        }

    }
}
