package com.musanli.array;

/**
 * 不能够直接创建泛型的数据，如果非要用到泛型的数组，可以先创建一个数组然后强制转型为泛型。
 *
 * @author: li_bin .
 * @description: 创建泛型数组 .
 * @create: 2018-11-25 11:04 .
 */
public class GenericArray {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int[] arr2 = { 1, 2, 3 };
    }

    /**
     * 创建泛型数组，不能直接创建
     *
     * @param t
     * @param <T>
     * @return
     */
//    public static <T extends Object> T[] arrayT(T t) {
//        /*   该泛型不能被实力化   */
//       T[] arr = new T[10];
//       return arr;
//    }

    /**
     * 创建数组，然后强转为泛型的数组。
     *
     * @param objs
     * @param <T>
     * @return
     */
//    @org.jetbrains.annotations.Contract(pure = true) @SuppressWarnings("unchecked")
    public static <T extends Object> T[] arrayT(Object[] objs) {
        /*   该泛型不能被实力化   */

        return (T[]) objs;
    }
}
