package com.musanli.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author: li_bin .
 * @description: 测试java动态代理 .
 * @create: 2018-11-07 19:08 .
 */
public class DenamicProxy implements InvocationHandler {
    private Object proxied;

    public DenamicProxy(Object proxied) {
        this.proxied = proxied;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("pre:-proxy" + proxy.getClass().getName());
        System.out.println("pre:-proxied" + proxied.getClass().getName());
        System.out.println("pre:-method" + method.getName());
        System.out.println("pre:-args" + Arrays.toString(args));

        System.out.println("start...");
        Object invoke = method.invoke(proxy, args);
        System.out.println("end...");
        return invoke;
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        InterA a = new A();
        DenamicProxy handler = new DenamicProxy(a);
        Object o = Proxy.newProxyInstance(DenamicProxy.class.getClassLoader(),
                a.getClass().getInterfaces(),
                handler);
        System.out.println(o.getClass().getMethod("getName",String.class).invoke(o,"王小二"));
//        System.err.println(((InterA)o).getName("网天坛"));
    }
}

interface InterA {
    public String getName(String name);
}

class A implements InterA {

    public String getName(String name) {
        System.out.println("execute............");
        return name +  " lei hao a";
    }
}
