package com.musanli.eu;

import java.util.Arrays;

/**
 * @author: li_bin .
 * @description: 测试枚举 .
 * @create: 2018-10-15 17:25 .
 */
public class TMain {
    public static void main(String[] args) {
        System.out.println(Tone.NOT);
        System.out.println(Tone.values());
        System.out.println(Arrays.toString(Tone.values()));

    }
}


enum Tone {
    NOT,MILD,HOT,FLAMING
}
