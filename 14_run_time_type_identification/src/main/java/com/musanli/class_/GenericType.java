package com.musanli.class_;

import java.sql.Connection;
import java.util.ArrayList;

/**
 * @author: li_bin .
 * @description: Class泛型 .
 * 泛型是java运行时类型检查
 * Run Time Type Identification
 * @create: 2018-11-07 08:59 .
 */
public class GenericType {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        /*   ? 是super的超类   */
        Class<? super Integer> integerClass = int.class;
        Class<? extends Integer> ic1 = int.class;
        Class<?> ic2 = int.class;
        Object o = ic2.newInstance();
        Object object = integerClass.newInstance();
        Integer integer = ic1.newInstance();
        Class<? super ArrayList>  cal = null;
        Object cast = ic2.cast(ic2);
    }
}
