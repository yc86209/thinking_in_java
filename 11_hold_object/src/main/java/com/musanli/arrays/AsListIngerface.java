package com.musanli.arrays;

import java.util.Arrays;
import java.util.List;

/**
 * @author: li_bin .
 * @description: Collections局限 .
 * @create: 2018-10-25 09:12 .
 */
public class AsListIngerface {
    public static void main(String[] args) {
       List<Snow> snowList = Arrays.asList(new Crusty(),new Slush(),new Power(),new Light());
       /*   此处Arrays回去寻找 new Light(),new Heavy() 共有的父类，结果找到了Power，所以 表达式执行的结果为创建
         * Power类型的数据。 */
//       List<Snow> snowList2 = Arrays.asList(new Light(),new Heavy());
       List<Snow> snowList2 = Arrays.<Snow>asList(new Light(),new Heavy());
//        snowList.add(new Snow());//java.lang.UnsupportedOperationException
        System.out.println(snowList.get(0));
        snowList.remove(0);

    }
}
class Snow{}
class Power extends Snow{}
class Crusty extends Snow{}
class Slush extends Snow{}
class Light extends Power{}
class Heavy extends Power{}
