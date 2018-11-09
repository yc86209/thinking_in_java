package com.musanli.proxy;

import java.lang.reflect.Method;
import java.util.Arrays;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @author: li_bin .
 * @description: cglib代理 .
 * @create: 2018-11-08 14:37 .
 * 静态代理：由程序员创建或特定工具自动生成源代码，再对其编译。在程序运行前，代理类的.class文件就已经存在了。
 * 动态代理：在程序运行时，运用反射机制动态创建而成。
 */
public class DenamicCgLib implements MethodInterceptor {
    private Object target;
    public Object getInstance(Object target){
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        //回调方法
        enhancer.setCallback(this);
        //创建代理对象
        Object proxyObj = enhancer.create();
        return proxyObj;
    }
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Object:\t"+o.getClass().getName());
        System.out.println("method:\t"+method.getName());
        System.out.println("methodProxy:\t"+methodProxy.getClass().getName());
        System.out.println("objects[]:\t"+ Arrays.toString(objects));
        System.out.println("cglib.....start");
        Object invoke = methodProxy.invoke(this.target, objects);
        System.out.println("cglib.....end");
        return null;
    }
}



class BookFacadeImpl1 {
    public static void main(String[] args) {
        DenamicCgLib cglib=new DenamicCgLib();
        BookFacadeImpl1 bookCglib=(BookFacadeImpl1)cglib.getInstance(new BookFacadeImpl1());
        bookCglib.addBook();
    }
    
    public void addBook() {
        System.out.println("增加图书的普通方法...");
    }
}