package com.musanli.pack;

/**
 * @author: li_bin .
 * @description: .
 * @create: 2018-10-31 20:06 .
 * 此处如果有一个检查性异常，就是程序必须处理或者抛出的异常。如果程序无法处理，并且不能抛出。则可以通过RuntimeException包装，然后抛出。
 */
public class PackException {
    public static void main(String[] args) {
        try {
            throw new Exception("你好啊");
        } catch (Exception e) {
            //e.printStackTrace();
            RuntimeException re = new RuntimeException(e);
            System.out.println(re.getCause().toString());
            throw re;

        }
    }
}
