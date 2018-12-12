package com.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author: li_bin .
 * @description: 类的潜在机制 .
 * @create: 2018-12-10 19:36 .
 */
public class ClassAttribute {
    public static void main(String[] args) {
        List<Contract> contracts = new ArrayList<Contract>();
        Fill.fill(contracts, Contract.class, 3);
        Fill.fill(contracts, TitleTransfer.class, 2);
        for (Contract item : contracts) {
            System.out.println(item.toString()
            );
        }
    }
}

class Fill {
    public static <T> void fill(Collection<T> collection, Class<? extends T> classToken, int size) {
        for (int i = 0; i < size; i++) {
            try {
                collection.add(classToken.newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}

class Contract {
    private static long counter = 0;
    private final long id = addLong();

    @Override public String toString() {
        return this.getClass().getName() + " .. " + id;
    }

    private long addLong() {
        System.out.println("调用。。。" + counter++);
        return counter;
    }
}

class TitleTransfer extends Contract {
}
