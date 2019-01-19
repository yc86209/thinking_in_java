//: annotations/Testable.java
package com.musanli.testable;

import java.lang.annotation.*;

public class Testable {
    public void execute() {
        System.out.println("Executing..");
    }

    @Test
    void testExecute() {
        execute();
    }
}

/**
 * 定义注解
 */
@interface Test {
};