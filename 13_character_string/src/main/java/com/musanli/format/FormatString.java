package com.musanli.format;

/**
 * @author: li_bin .
 * @description: 格式化输出 .
 * @create: 2018-11-01 19:15 .
 */
public class FormatString {
    public static void main(String[] args) {
        int x = 5;
        double y = 7.45616465D;
        System.out.println("Row 1: [" + x + " " + y + "]" );
        System.out.format("Row 1:[%d %f]\n",x,y);
        System.out.printf("Row 1:[%d %f]\n",x,y);
    }
}
