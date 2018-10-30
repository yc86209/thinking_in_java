package com.musanli.collection.iterator;

import com.musanli.collection.CopyCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/**
 * @author: li_bin .
 * @description: 测试系统变量.
 * foreach 底层的原理是什么，它同iterator的关系又是什么。
 * @create: 2018-10-29 19:50 .
 */
public class TestSystem {
    public static void main(String[] args) {
        for (Map.Entry entry : System.getenv().entrySet())
            System.out.println(entry.getKey() + "\t\t" + entry.getValue());
        ReversibleArrayList<String> revlist = new ReversibleArrayList<String>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i"));

        for (String s : revlist) {
            System.out.println("正向： " + s);
        }
        Iterable<String> reversible = revlist.reversible();
        //这里为什么会报 foreach net applicable type java.util.Iterator
        //迭代器实现的应该为java.lang.Iterable
        for (String s : reversible) {
            System.out.println("反向： "+s);
        }
        Collection<String> strColl = null;
        for (String s : strColl) {

        }
        CopyCollection<String> cc = null;
        for (String s : cc) {

        }

    }
}

class ReversibleArrayList<T> extends ArrayList<T> {
    public ReversibleArrayList(Collection<T> c) {
        super(c);
    }

    public Iterable<T> reversible() {
        return new Iterable<T>() {
            int current = ReversibleArrayList.this.size() - 1;
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    /*   重写Iterator方法   */
                    public T next() {
                        System.out.println("next()");
                        return ReversibleArrayList.this.get(current--);
                    }

                    /*   重写Iterator方法   */
                    public void remove() {
                        System.out.println("remove()");
                        //not Implements
                        throw new UnsupportedOperationException();
                    }

                    /*   重写Iterator方法   */
                    public boolean hasNext() {
                        System.out.println("hasNext()");
                        return current > -1;
                    }
                };
            }
        };
    }
}
