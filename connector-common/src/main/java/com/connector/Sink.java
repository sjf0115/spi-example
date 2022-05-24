package com.connector;

/**
 * 将数据输出到外部系统
 */
public interface Sink {
    // 获取 Sink 类型
    String getSinkType();
    // 将数据输出到外部系统
    void run(String content);
}