package com.musanli.util;

import java.net.URL;

/**
 * @author: li_bin .
 * @description: 公共工具类 .
 * @create: 2018-10-30 19:44 .
 */
public class CommonUtil {
    /**
     * @return 返回当前class文件所在的绝对路径
     */
    public static String getProjectPath(Class cla){
        URL resource = cla.getResource("/");
        String projectPath = resource.toString().replace("%20"," ");
        return projectPath.substring("file:/".length());
    }
}
