package com.musanli.class_;

import javax.jws.WebService;

/**
 * @author: li_bin .
 * @description: 测试类加载器 .
 * @create: 2018-11-06 08:35 .
 */
public class TestClass {
    public static void main(String[] args) throws ClassNotFoundException {
        /*   此处也会加载一次类的静态块   */
        Class<TestClass> testClassClass = TestClass.class;
        Class<?> aClass = TestClass.class.forName("com.musanli.class_.TestClass");
        Class.forName("com.musanli.class_.TestClass");
        System.out.println(TestClass.class.getName());
        System.out.println(TestClass.class.getSimpleName());
        System.out.println(TestClass.class.getCanonicalName());
        System.out.println("testClassClass.isInterface()= "+testClassClass.isInterface());
        System.out.println("testClassClass.isAnnotation()= "+testClassClass.isAnnotation());
        System.out.println("testClassClass.getSuperclass().getName()= "+testClassClass.getSuperclass().getName());
        new TestClass();
    }

    /*   静态块，在类加载的时候执行一次   */
    static {
        System.out.println("hello static lump");
    }

    /**   方法块，在类实力化的时候执行一次  */ {
        System.out.println("hello lump");
    }
}
