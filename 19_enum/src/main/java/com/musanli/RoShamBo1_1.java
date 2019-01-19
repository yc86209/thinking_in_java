//: enumerated/RoShamBo1.java
// Demonstration of multiple dispatching.
package com.musanli;

enum Category_1{
    PAPER{
        Outcome eval(Category_1 cate){
            switch (cate){
            case ROCK:
                return Outcome.WIN;
            case SCISSORS:
                return Outcome.LOSE;
            case PAPER:
                return Outcome.DRAW;
            }
            throw  new RuntimeException("");
        }
    },
    SCISSORS{
        Outcome eval(Category_1 cate){
            switch (cate){
            case ROCK:
                return Outcome.LOSE;
            case SCISSORS:
                return Outcome.DRAW;
            case PAPER:
                return Outcome.WIN;
            }
            throw  new RuntimeException("");
        }
    },
    ROCK{
        Outcome eval(Category_1 cate){
            switch (cate){
            case ROCK:
                return Outcome.DRAW;
            case SCISSORS:
                return Outcome.WIN;
            case PAPER:
                return Outcome.LOSE;
            }
            throw  new RuntimeException("");
        }
    };
abstract Outcome eval(Category_1 cate);
}
public class RoShamBo1_1 {

    public static void main(String[] args) {

        for (int i=0;i<10;i++){

        }
    }
}

