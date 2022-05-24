package com.connector;

/**
 * 功能：将数据输出到文件
 * 作者：SmartSi
 * 博客：http://smartsi.club/
 * 公众号：大数据生态
 * 日期：2022/5/23 上午12:01
 */
public class FileSink implements Sink {
    public String getSinkType() {
        return "file";
    }

    public void run(String content) {
        System.out.println("[INFO] file sink: " + content);
    }
}
