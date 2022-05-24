package com.connector;
/**
 * 功能：将数据输出到 MySQL
 * 作者：SmartSi
 * 博客：http://smartsi.club/
 * 公众号：大数据生态
 * 日期：2022/5/23 上午12:01
 */
public class MySQLSink implements Sink {
    public String getSinkType() {
        return "mysql";
    }

    public void run(String content) {
        System.out.println("[INFO] mysql sink: " + content);
    }
}
