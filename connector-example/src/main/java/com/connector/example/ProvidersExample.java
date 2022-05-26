package com.connector.example;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 功能：
 * 作者：SmartSi
 * 博客：http://smartsi.club/
 * 公众号：大数据生态
 * 日期：2022/5/26 上午9:22
 */
public class ProvidersExample {
    public static void main(String[] args) {
        LinkedHashMap<String, String> providers = new LinkedHashMap<String, String>();
        providers.put("a", "b");
        Iterator<Map.Entry<String, String>> iterator = providers.entrySet().iterator();
        providers.put("b", "b");
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey() + ": " + next.getValue());
        }
    }
}
