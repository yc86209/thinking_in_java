package com.musanli.wildcard;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型的集合不支持转型（容器的类型、跟容器所持有的类型不是一回事）
 *
 * @author: li_bin .
 * @description: 泛型集合 .
 * @create: 2018-11-25 11:44 .
 */
public class WildcardCollection {
//    public static void main(String[] args) {
//        //compile to :incompatible types.不能
//        //容器的类型、容器所持有的类型。不是一种类型
////        List<Fruit> list = new ArrayList<Apple>();
////        List<Apple> list2 = new ArrayList<Fruit>();
//
//        /*   泛型通配符   */
//        List<? extends Apple> list2 = new ArrayList<Jonathan>();
//        Apple apple = list2.get(1);
//        list2.add(new Apple());
//        list2.add(new Fruit());
//        list2.add(new Orange());
//        list2.add(new Jonathan());
//        List<? super Apple> list3 = new ArrayList<Fruit>();
//        Object object = list3.get(0);
//        list3.add(new Fruit());
//        list3.add(new Apple());
//        list3.add(new Jonathan());
//        list3.add(new Orange());
//
//        List<Fruit> fruits = null;
//        fruits.add(new Apple());
//    }
}

interface Payable<T>{}
class Employee implements  Payable<Employee>{}
/**   此处会编译失败。因为一个类不能同时实现两个泛型接口。源于类型擦除的原因，会使两个泛型接口变为同一个
 * 另外，extends关键字应该位于interface关键字之前。 */
class Hourly extends  Employee implements Payable<Employee> {}
