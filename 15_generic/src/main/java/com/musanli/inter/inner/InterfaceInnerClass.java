package com.musanli.inter.inner;

/**
 * @author: li_bin .
 * @description: 接口内部类 .
 * 1.接口中没有构造器，接口不能创建对象。不能定义普通方法  不能new
 * 2.接口中定义的成员变量，实质是全局静态常量，默认使用 public static final修饰。
 * 3.接口中定义的方法都是公共的抽象方法，默认使用public abstract 来修饰
 * 4.接口中定义的内部类，都是公共的静态内部类,默认使用public static来修饰内部类。
 * <p>
 * <p>
 * final 修饰的变量必须在初始化之前赋值，或者在创建时就赋值。
 * @create: 2018-11-08 08:37 .
 */
public interface InterfaceInnerClass {
    String name = null;

    String getLike(String name);

    class InnerClass {
        public String getName(String name1) {
            return "welcome " + name1;
        }

        public String getLike(String like) {
            return "welcome " + name;
        }
    }
}

class Imp implements InterfaceInnerClass {

    public String getLike(String name1) {
        System.out.println(name + name1);
        return name1;
    }
}

class TestMain {
    final String name;
    public static final String age = null;

    {
        name = "";
    }

    public static void main(String[] args) {
        Imp.InnerClass iic = new Imp.InnerClass();
        iic.getLike("kakak");
        iic.getName("........");
    }
}
