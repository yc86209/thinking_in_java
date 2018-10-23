package com.musanli.inner.inerface_;

import com.musanli.inner.static_.StaticOuterClass;

/**
 * @author: li_bin .
 * @description: 接口内部类 .
 * @create: 2018-10-22 09:11 .
 */

public interface OuterInterfac {
    public static final String name = null;
    String getName(String name);
    /**   接口内部类 - 可以有具体的实现
     * 接口中的字段（域）默认为public static final */
    class InnerClass implements OuterInterfac{
        public String getName(String name){
            return name;
        }
    }
}
