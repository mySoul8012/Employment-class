package com.ming3;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

// HashMap 线程不安全，多个线程向同一个Map中添加键值对时，可能会出现 Map 中键值对，个数少于实际添加的个数。
// 在多线程的情况下，Java给我一个HashTable，它是线程安全，HashTable 使用全表锁。
// JDK 并发包，ConcurrentHashMap 线程安全，使用局部锁。
public class Const {
    // 线程不安全
    public static HashMap<String, String> map = new HashMap<>();
    // 线程安全
    public static Hashtable<String, String> map1 = new Hashtable<>();
    // 线程安全，采用局部锁，
    public static ConcurrentHashMap<String, String> map2 = new ConcurrentHashMap<>();

}
