package com.musanli;

import java.io.File;
import java.io.IOException;
import org.junit.Test;

/**
 * @author: li_bin .
 * @description: File工具类 .
 * @create: 2019-01-07 20:35 .
 */
public class FileUtil {
    @Test
    public void test_getCanonicalFile() throws IOException {
        File file = new File(".\\");
        System.out.println(file.getPath());
        System.out.println(file.getCanonicalFile());
        System.out.println(file.getCanonicalPath());
        System.out.println(file.getAbsolutePath());
    }
}
