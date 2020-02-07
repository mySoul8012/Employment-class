package com.ming37;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class Const {
    // 线程不安全
    public static HashMap<String, String> map = new HashMap<>();
    // 线程安全，采用全局锁，性能较低
    public static Hashtable<String, String> map1 = new Hashtable<>();
    // 线程安全，采用局部锁，性能更高
    public static ConcurrentHashMap<String, String> map2 = new ConcurrentHashMap<>();
}

