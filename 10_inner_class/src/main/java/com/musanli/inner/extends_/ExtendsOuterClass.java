package com.musanli.inner.extends_;


/**
 * @author: li_bin .
 * @description: 继承外部类，是否能覆盖内部类 .
 * @create: 2018-10-23 08:57 .
 */

import java.awt.Insets;

/**
 * 内部类不能被继承，如果某一类继承其外部类然后在导出类中重新定义基类的内部类，则相当于在基类的内部类外围重新定义了一个内部类。
 */
public class ExtendsOuterClass extends OuterClass {
    public class InnerClass {
        String like;

        String getLike() {
            return like;
        }
    }

    /**
     * 内部类隐藏具体的实现，不可以被继承。
     *
     */
    public static void main(String[] args) {
//        ExtendsOuterClass eoc = new ExtendsOuterClass();
        new BiggerEgg2().g();
    }
}

class Egg2 {
    private  Yolk y = new Yolk();
    Egg2(){
        System.out.println("基类构造器");
    }
    void insertYolk(Yolk yy){
        y = yy;
    }
    void g(){
        y.f();
    }
    class Yolk {
        Yolk() {
            System.out.println("基类-Yolk()");
        }

        void f() {
            System.out.println("基类 - f()");
        }
    }
}

/**   外部类继承外部类
 *    内部类继承内部类
 *    */
class BiggerEgg2 extends Egg2 {
    BiggerEgg2(){
        insertYolk(new Yolk());
    }
    /**
     * 内部类继承内部类
     */
    class Yolk extends Egg2.Yolk {
        Yolk() {
            System.out.println("导出类-Yolk()");
        }

        void f() {
            System.out.println("导出类 - f()");
        }
    }
}
