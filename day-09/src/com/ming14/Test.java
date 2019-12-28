package com.ming14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test{
   public static void main(String[] args){
       List<String> stringList = new ArrayList<>();
       // 添加数据
       stringList.add("张三分");
       stringList.add("王思聪");
       stringList.add("张飞");
       stringList.add("流小明");
       // 获取 Stream
       Stream stream = stringList.stream();
       // 进行打印
      // stream.forEach((str1) -> {System.out.println(str1);});

       // 筛选
       Stream stream1 = stringList.stream().filter((String str) -> {
           // 进行过滤
           return (str.indexOf(0) + "").equals("张");
       });
       // 输出
       stream1.forEach((str1) -> {
           System.out.println(str1);
       });
   }
}
