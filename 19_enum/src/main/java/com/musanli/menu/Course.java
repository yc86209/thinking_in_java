//: enumerated/menu/Course.java
package com.musanli.menu;

public enum Course {
    APPETIZER(Food.Appetizer.class),
    MAINCOURSE(Food.MainCourse.class),
    DESSERT(Food.Dessert.class),
    COFFEE(Food.Coffee.class);
    public Food[] values;

    private Course(Class<? extends Food> kind) {
        values = kind.getEnumConstants();
    }

    public Food randomSelection() {
        return Enums.random(values);
    }

    public static void main(String[] args) {
        Course c = Course.APPETIZER;
        for (Food f : c.values) {

            System.out.println(f);
        }
    }
} ///:
