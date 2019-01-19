//: enumerated/cartoons/EnumImplementation.java
// An enum can implement an interface
package com.musanli.cartoons;

import java.util.Random;

interface Generator<T> {
    T next();
} ///:~

enum CartoonCharacter
        implements Generator<CartoonCharacter> {
    SLAPPY, SPANKY, PUNCHY, SILLY, BOUNCY, NUTTY, BOB;
    private Random rand = new Random(47);

    public CartoonCharacter next() {
        return values()[rand.nextInt(values().length)];
    }
}

public class EnumImplementation {
    public static <T> void printNext(Generator<T> rg) {
        System.out.print(rg.next() + ", ");
    }

    public static void main(String[] args) {
        // Choose any instance:
        CartoonCharacter cc = CartoonCharacter.BOB;
        for (int i = 0; i < 10; i++)
            printNext(cc);
    }
}

class GeneratorImp implements Generator<GeneratorImp> {

    public GeneratorImp next() {
        System.out.println("next");
        return null;
    }
}
/* Output:
BOB, PUNCHY, BOB, SPANKY, NUTTY, PUNCHY, SLAPPY, NUTTY, NUTTY, SLAPPY,
*///:~
