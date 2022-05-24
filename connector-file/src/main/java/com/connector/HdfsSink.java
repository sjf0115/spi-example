package com.connector;
/**
 * 功能：将数据输出到 HDFS
 * 作者：SmartSi
 * 博客：http://smartsi.club/
 * 公众号：大数据生态
 * 日期：2022/5/24 下午11:05
 */
public class HdfsSink implements Sink{
    public String getSinkType() {
        return "hdfs";
    }

    public void run(String content) {
        System.out.println("[INFO] hdfs sink: " + content);
    }
}
