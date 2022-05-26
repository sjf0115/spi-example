package com.connector.example;

import com.connector.Sink;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/**
 * 功能：Loader 获取 Resource
 * 作者：SmartSi
 * 博客：http://smartsi.club/
 * 公众号：大数据生态
 * 日期：2022/5/25 下午9:50
 */
public class LoaderResourceExample {
    public static void main(String[] args) throws IOException {
        String PREFIX = "META-INF/services/";
        String fullName = PREFIX + Sink.class.getName();

        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Enumeration<URL> config = loader.getResources(fullName);
        while (config.hasMoreElements()) {
            URL url = config.nextElement();
            System.out.println(url.getPath());
        }

        Enumeration<URL> systemConfig = ClassLoader.getSystemResources(fullName);
        while (systemConfig.hasMoreElements()) {
            URL url = systemConfig.nextElement();
            System.out.println(url.getPath());
        }
    }
}
///Users/wy/study/code/spi-example/connector-mysql/target/classes/META-INF/services/com.connector.Sink
///Users/wy/study/code/spi-example/connector-file/target/classes/META-INF/services/com.connector.Sink