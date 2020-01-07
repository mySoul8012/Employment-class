package com.ming7;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

public class Test {
    public static void main(String[] args) throws FileNotFoundException, DocumentException {
        // 读取books.xml文件
        // 创建解析器
        SAXReader saxReader = new SAXReader();
        // 创建文件输入流
        InputStream inputStream = new FileInputStream(new File("C:\\Users\\Administrator\\IdeaProjects\\untitled6\\day-15\\src\\main\\resources\\books2.xml"));
        // 生成document对象
        Document document = saxReader.read(inputStream);
        // 生成跟元素
        Element rootElement = document.getRootElement();
        // 获取元素列表
        List<Element> elements = rootElement.elements();
       // book元素列表
        // 进行遍历
        for (Element element : elements) {
            // 进行遍历
            // 对book元素内部进行遍历
            // 获取name节点
            String name = element.element("name").getText();
            // 获取出版社
            String cubanse = element.element("cubanse").getText();
            // 获取日期
            String riqi = element.element("riqi").getText();
            // 获取价格
            String jiage = element.element("price").getText();
            // 进行输出
            System.out.println("书名 " + name + "出版社 " + cubanse + "日期  " + riqi + "价格 " + jiage);


        }
    }
}
