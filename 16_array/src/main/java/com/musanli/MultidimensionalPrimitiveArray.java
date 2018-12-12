package com.musanli;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: li_bin .
 * @description: 多维数组 .
 * @create: 2018-12-12 18:34 .
 */
public class MultidimensionalPrimitiveArray {
    public static void main(String[] args) {
        int[][][] a = {
                { { 1 } },
                { { 1, 2 }, { 4, 5 } },
                { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }
        };
        Integer[] b =
                { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(Arrays.deepToString(a));
        System.out.println(Arrays.deepToString(b));
        System.out.println(Arrays.toString(a));

    }
}
