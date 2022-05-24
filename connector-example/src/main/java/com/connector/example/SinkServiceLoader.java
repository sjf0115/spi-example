package com.connector.example;


import com.connector.Sink;

import java.util.Iterator;
import java.util.Objects;
import java.util.ServiceLoader;

/**
 * 功能：数据输出到外部系统
 * 作者：SmartSi
 * 博客：http://smartsi.club/
 * 公众号：大数据生态
 * 日期：2022/5/22 下午11:57
 */
public class SinkServiceLoader {
    public static void main(String[] args) {
        ServiceLoader<Sink> sinkServiceLoader = ServiceLoader.load(Sink.class);
        Iterator<Sink> iterator = sinkServiceLoader.iterator();
        while (iterator.hasNext()) {
            Sink sink = iterator.next();
            String sinkType = sink.getSinkType();
            // 使用 MySQL Sink 输出
            if (Objects.equals(sinkType, "mysql")) {
                sink.run("hello world");
            } else {
                System.out.println("[INFO] 不使用 " + sinkType + " sink");
            }
        }
    }
}
