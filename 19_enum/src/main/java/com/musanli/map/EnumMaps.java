//: enumerated/EnumMaps.java
// Basics of EnumMaps.
package com.musanli.map;

import com.musanli.AlarmPoints;
import java.util.EnumMap;
import java.util.Map;

import static com.musanli.AlarmPoints.BATHROOM;
import static com.musanli.AlarmPoints.KITCHEN;
import static com.musanli.AlarmPoints.UTILITY;

interface Command {
    void action();
}

public class EnumMaps {
    public static void main(String[] args) {
        EnumMap<AlarmPoints, Command> em = new EnumMap<AlarmPoints, Command>(AlarmPoints.class);
        em.put(KITCHEN, new Command() {
            public void action() {
                System.out.println("Kitchen fire!");
            }
        });
        em.put(BATHROOM, new Command() {
            public void action() {
                System.out.println("Bathroom alert!");
            }
        });
        for (Map.Entry<AlarmPoints, Command> e : em.entrySet()) {
            System.out.println(e.getKey() + ": ");
            e.getValue().action();
        }
        try { // If there's no value for a particular key:
            em.get(UTILITY).action();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
} /* Output:
BATHROOM: Bathroom alert!
KITCHEN: Kitchen fire!
java.lang.NullPointerException
*///:~
