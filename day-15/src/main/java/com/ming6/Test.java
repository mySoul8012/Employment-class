package com.ming6;

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
        // 创建解析器
        SAXReader saxReader = new SAXReader();
        // 创建文件输入流
        InputStream inputStream = new FileInputStream(new File("C:\\Users\\Administrator\\IdeaProjects\\untitled6\\day-15\\src\\main\\resources\\books2.xml"));
        // 获取document文档
        Document document = saxReader.read(inputStream);
        // 获取跟元素
        Element element = document.getRootElement();
        // 获取元素列表
        List<Element> elements = element.elements();
        // 获取book节点
        // 进行元素遍历
        for (Element element1 : elements) {
            // 进行打印
            // 获取节点
            // 对book节点获取
            List<Element> element2 = element1.elements();
            // 对节点进行遍历操作
            for (Element element3 : element2) {
                // 进行遍历操作
                // 获取name属性
                String name = element3.getText();
                // 获取出版社
                String cubanse = element3.getText();
                // 获取出版日期
                String riqi = element3.getText();
                // 获取价格
                String jiage = element3.getText();
                // 进行打印
                System.out.println("name的值为 " + name + " 出版社为 " + cubanse + " 出版日期为 " + riqi + " 价格 "  + jiage);
            }
        }
    }
}
