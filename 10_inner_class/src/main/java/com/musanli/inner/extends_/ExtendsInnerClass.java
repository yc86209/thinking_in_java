package com.musanli.inner.extends_;

/**
 * @author: li_bin .
 * @description: 普通内部类继承内部类 .
 * @create: 2018-10-23 08:24 .
 */
public class ExtendsInnerClass extends OuterClass.InnerClass{
    /**   内部类的构造器隐含了外部类的对象，如果这届声明无参构造方法是不能够通过编译的。  */
    ExtendsInnerClass(OuterClass outer){
        outer.super();
    }
}


class OuterClass {
    String name;
    String getName() {
        return name;
    }

    public class InnerClass {
        InnerClass(){}
        InnerClass(String like){
            this.like = like;
        }
        String like;
        String getLike() {
            return like;
        }
    }


    public static class StaticInnerClass {
        String like;
        String getLike() {
            return like;
        }
    }
}
