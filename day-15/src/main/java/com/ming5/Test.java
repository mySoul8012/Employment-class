package com.ming5;

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
        // 创建输入流
        InputStream inputStream = new FileInputStream(new File("C:\\Users\\Administrator\\IdeaProjects\\untitled6\\day-15\\src\\main\\resources\\books1.xml"));
        // 进行加载到内存
        Document document =  saxReader.read(inputStream);
        // 获取跟节点
        // 获取跟节点 books节点
        Element element = document.getRootElement();
        // 获取子节点数组 子节点为boo等数组
        List<Element> elements = element.elements();
        // 进行遍历子节点数组
        for (Element element1 : elements) {
            // 进行遍历
            // 获取子节点数组
            List<Element> element2 = element1.elements();
            // 输出属性
            String id = element1.attributeValue("id");
            // 获取属性值
            String cubanse = element1.attributeValue("出板社");
            // 对子节点进行遍历
            for (Element element3 : element2) {
                // 获取书名
                String name = element3.getText();
                // 获取作者名
                String author = element3.getText();
                // 获取price名
                String price = element3.getText();
                // 获取库存名
                String body = element3.getText();
                // 对数据进行打印
                System.out.println("属性值 "  + id + "属性 " + cubanse + " 书名 " + name + " 作者名 " + author + " 获取price " + price + " 库存名  " + body);
            }
        }
    }
}
