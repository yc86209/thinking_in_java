package com.musanli;//: enumerated/ConstantSpecificMethod.java

import java.text.DateFormat;
import java.util.Date;

public enum ConstantSpecificMethod {
    DATE_TIME {
        String getInfo() {
            return DateFormat.getDateInstance().format(new Date());
        }
    },
    CLASSPATH {
        String getInfo() {
            return System.getenv("CLASSPATH");
        }
    },
    VERSION {
        String getInfo() {
            return System.getProperty("java.version");
        }
    },
    AAA_BBB {
        String getInfo() {
            return System.getProperty("java.version");
        }

        String aaa() {
            return "aaa";
        }
    };

    abstract String getInfo();

    public static void main(String[] args) {
        System.out.println(ConstantSpecificMethod.DATE_TIME.getInfo());
        for (ConstantSpecificMethod csm : values())
            System.out.println(csm.getInfo());
    }
    public void t1(ConstantSpecificMethod c){}
//    public void t1(ConstantSpecificMethod.DATE_TIME c){}//compile fail
} /* (Execute to see output) *///:~
