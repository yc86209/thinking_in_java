package com.musanli.wildcard;

/**
 * @author: li_bin .
 * @description: 通配符 .
 * @create: 2018-11-25 11:31 .
 */
public class WildcardArray {
    public static void main(String[] args) {
        /*   此处fruit运行时类型是Apple 而不是Fruit   */
        Fruit[] fruit = new Apple[10];
        fruit[0] = new Apple();
        fruit[1] = new Jonathan();
        try {
            fruit[2] = new Fruit();
        } catch (RuntimeException e) {
            System.out.println("00000000000001");
            e.printStackTrace();
        }
        System.out.println("----------------------------------");
        try {
            fruit[2] = new Orange();
        } catch (RuntimeException e) {
            System.out.println("00000000000002");
            e.printStackTrace();
        }

    }
}

class Fruit {
}//水果

class Apple extends Fruit {
}//苹果

class Jonathan extends Apple {
}//

class Orange extends Fruit {
}//橘子

