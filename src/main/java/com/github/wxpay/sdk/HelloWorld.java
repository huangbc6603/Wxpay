package com.github.wxpay.sdk;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author huangbc
 */
public class HelloWorld {

    public static void main(String[] args) {

        Map<String, String> hashMap = new HashMap();
        hashMap.put("huang", "bc");
        hashMap.put("zhang", "sanfeng");
        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        Set<String> keySet = hashMap.keySet();
        for (String s : keySet) {
            System.out.println(s);
        }

        for (String value : hashMap.values()) {
            System.out.println(value);
        }

        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            next.getKey();
            next.getValue();
        }

        System.out.println("test测试代码冲突");
        System.out.println("test1 冲突");
        System.out.println("this is master branch");

    }


}
