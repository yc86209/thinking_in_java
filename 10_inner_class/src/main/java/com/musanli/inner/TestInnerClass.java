package com.musanli.inner;

/**
 * @author: li_bin .
 * @description: 内部类访问权限 .
 * @create: 2018-10-20 17:03 .
 */
public class TestInnerClass {
    public static void main(String[] args) {
        TestInnerClass outClass = new TestInnerClass();
        System.out.println(outClass.hashCode());
        System.out.println(outClass.getInner().getName("hello"));
        System.out.println(outClass.getInner().getOutClass().hashCode());
//        TestInnerClass.InnerClass ti = outClass.new.
        TestInnerClass.InnerClass innerClass = outClass.new InnerClass();
    }
    public Runnable ra = new Runnable() {
        public void run() {

        }
    };
    private String name;
    public InnerClass getInner(){
        return new InnerClass();
    }
    public class InnerClass{
        public InnerClass(){

        }
        public InnerClass(String name){
            TestInnerClass.this.name = name;
        }
        private String getName(String name){
            System.out.println(name);
            return name;
        }
        public String getLike(){
            System.out.println(name);
            return "打球";
        }
        /**   获取外部类对象  */
        private  TestInnerClass getOutClass(){
            return TestInnerClass.this;
        }
    }
}
