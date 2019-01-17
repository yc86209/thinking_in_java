package com.musanli;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Properties;

/**
 * @author: li_bin .
 * @description: .
 * @create: 2019-01-17 21:16 .
 */
public class MyProperties {
    public static void main(String[] args) throws IOException {
        System.out.println(MyProperties.class.getResource(""));
        System.out.println(MyProperties.class.getResource("/"));
        System.out.println(MyProperties.class.getResource("./"));
        System.out.println(new File("Test.properties").getPath());
        System.out.println(new File("Test.properties").getAbsolutePath());
        System.out.println(new File("").getAbsolutePath());
        Properties pps = new Properties();
//        pps.load(new FileInputStream("Test.properties"));
        pps.load(MyProperties.class.getResourceAsStream("/Test.properties"));
        Enumeration enum1 = pps.propertyNames();//得到配置文件的名字
        while (enum1.hasMoreElements()) {
            String strKey = (String) enum1.nextElement();
            String strValue = pps.getProperty(strKey);
            System.out.println(strKey + "=" + strValue);

        }

    }
}
