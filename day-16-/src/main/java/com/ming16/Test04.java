package com.ming16;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test04 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 获取Class对象
        Class clazz = Test01.class;
        // 创建构造方法
        Constructor constructor = clazz.getConstructor(String.class, int.class);
        // 生成对象
        Object object = constructor.newInstance("23", 23);
        // 进行对象格式化
        Test01 test01 = (Test01)object;

    }
}
