package com.ming;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class Test {
    public static void main(String[] args) throws IOException {
        //利用Properties类读取"fuhao.txt"文件，需要用到的变量名已经定义。（请在横线处填写多行代码）
        Reader fr=null;
        Properties prop=null;
        prop =new Properties();
        fr = new FileReader(new File("C:\\ming\\fuhao.txt"));
        System.out.println(fr);

        // 进行装载
        prop.load(fr);
        //获取文件中的所有key值。
        Set<String> keys = prop.stringPropertyNames();
        //遍历所有key值，判断是否存有王卫的数据，如果有就修改其身价，之后利用Properties类把修改后的数据写入到新文件中（请在横线处填写多行代码）
        for (String key : keys) {
            // 进行遍历
            if(key.equals("王卫")){
                // 如果有，进行修改
                prop.setProperty("王卫", "3333");
            }
        }
        // 写入到新文件中
        Writer  writer = new FileWriter(new File("C:\\ming\\fuhao.txt"));
        // 进行写入
        prop.store(writer, "xiaoxiao");
        // 关闭流
        writer.close();
        fr.close();
    }
}
