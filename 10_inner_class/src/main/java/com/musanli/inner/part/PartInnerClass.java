package com.musanli.inner.part;

/**
 * @author: li_bin .
 * @description: 测试局部内部类
 * 与
 * 匿名内部类 .
 * 1、需要修改当前导出类的构造方法
 * 2、需要创建多个导出类的对象。
 * @create: 2018-10-23 10:04 .
 */
public class PartInnerClass {
    public static void main(String[] args) {
        LocalInnerClass lic = new LocalInnerClass();
        Counter
                c1 = lic.getCounter("Local inner"),
                c2 = lic.getCounter2("Anonymous inner");
        for (int i=0;i<5;i++) System.out.println(c1.next());
        for (int i=0;i<5;i++) System.out.println(c2.next());
    }
}

interface Counter {
    int next();
}

class LocalInnerClass {
    private int count = 0;


    /**
     * 局部内部类
     *
     * @param name
     * @return
     */
    Counter getCounter(final String name) {
        // a local inner class
        class LocalCounter implements Counter {
            public LocalCounter() {
                //local inner class can have a constructor
                System.out.println("LocalCounter()");
            }

            public int next() {
                System.out.println(name);//Access local final
                return count++;
            }
        }
        return new LocalCounter();
    }

    /**
     * 匿名内部类
     *
     * @param name
     * @return
     */
    Counter getCounter2(final String name) {
        return new Counter() {
            public int next() {
                System.out.println(name);
                return count++;
            }
        };
    }
}