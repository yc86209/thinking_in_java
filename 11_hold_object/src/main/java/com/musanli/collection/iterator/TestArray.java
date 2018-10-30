package com.musanli.collection.iterator;

import java.util.*;

/**
 * @author: li_bin .
 * @description: 覆盖iterator并遍历数组 .
 * @create: 2018-10-30 11:30 .
 */
public class TestArray {
    public static void main(String[] args) {
        IteratorArray ia = new IteratorArray();
        for (String s : ia.reversed()) {
            System.out.println(s);
        }
        System.out.println("---------------------------------------------------");
        System.out.println(Arrays.toString(ia.words));
        for (String s : ia.randomized()) {
            System.out.println(s);
        }
        System.out.println("---------------------------------------------------");
        System.out.println(Arrays.toString(ia.words));
        for (String s : ia.reversed()) {
            System.out.println(s);
        }
        System.out.println(Arrays.toString(ia.words));
    }
}

class IteratorArray extends IterableClass {
    public Iterable<String> reversed() {
        return new Iterable() {
            public Iterator iterator() {
                return new Iterator() {
                    int current = words.length - 1;
                    public void remove() {
                    }
                    public boolean hasNext() {
                        return current > -1;
                    }
                    public String next() {
                        return words[current--];
                    }
                };
            }
        };
    }

    public Iterable<String> randomized() {
        return new Iterable<String>() {
            public Iterator<String> iterator() {
                List<String> strings = new ArrayList<String>(Arrays.asList(words));
                Collections.shuffle(strings, new Random(47));
                return strings.iterator();
            }
        };
    }
}

class IterableClass implements Iterable<String> {
    String[] words = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"};


    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;

            public boolean hasNext() {
                return index < words.length;
            }

            public String next() {
                return words[index++];
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}