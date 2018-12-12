package com.example.spring_boot_test.controller;

import javax.servlet.http.HttpServletRequest;
import jdk.nashorn.internal.objects.annotations.Constructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: li_bin .
 * @description: .
 * @create: 2018-11-25 15:09 .
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {
    @RequestMapping("/index")
    public String index(HttpServletRequest request) {
        int i = 0;
        request.setAttribute("username","Hello World5");
        System.out.println("...Hello");
        System.out.println("...Hello: " + i++);
        System.out.println("...Hello: " + i++);
        System.out.println("...Hello: " + i++);
        System.out.println("...Hello: " + i++);
        System.out.println("...Hello: " + i++);
        System.out.println("...Hello: " + i++);
        System.out.println("...Hello: " + i++);
        System.out.println("...Hello: " + i++);
        System.out.println("...Hello World ");
        return "index";
    }
}
