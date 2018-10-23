package com.musanli;

import com.musanli.inner.TestInnerClass;
import com.musanli.inner.inerface_.OuterInterfac;
import com.musanli.inner.static_.StaticOuterClass;

/**
 * @author: li_bin .
 * @description: .
 * @create: 2018-10-20 17:13 .
 * 内部类不能直接new 需要创建外部类的对象后才能对外部类进行操作，在内部类中如果要获取到外部类的引用可以用外部类名字点this
 * 如果要创建内部类对象，则可以通过外部类对象点new 然后调用内部类的方法。
 */
public class TestMain {
    public static void main(String[] args) {
        TestInnerClass testInnerClass = new TestInnerClass();
        testInnerClass.getInner();
        /**   普通内部类创建  */
        TestInnerClass.InnerClass innerClass = testInnerClass.new InnerClass();
        /**   静态内部类创建  */
        StaticOuterClass.StaticInner staticInnerClass = new StaticOuterClass.StaticInner();
        /**   由接口定义规则，然后创建内部类来实现规则  */
        OuterInterfac innerClass1 = new OuterInterfac.InnerClass();
    }
}
