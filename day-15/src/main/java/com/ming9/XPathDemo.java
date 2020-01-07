package com.ming9;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

public class XPathDemo {
    public static void main(String[] args) throws FileNotFoundException, DocumentException {
        // Dom4J核心类
        SAXReader saxReader = new SAXReader();
        // 读取xml
        InputStream inputStream = new FileInputStream(new File("C:\\Users\\Administrator\\IdeaProjects\\untitled6\\day-15\\src\\main\\resources\\books2.xml"));
        // 生成document对象
        Document document = saxReader.read(inputStream);
        // 获取根节点
        Element element = document.getRootElement();
        // 获取根节点集合
        List<Element> elements = element.elements();
        // 进行遍历
        for (Element element1 : elements) {
            // 进行遍历
            // 获取节点
            String text = element1.getText();
            // 进行打印
            System.out.println(text);
        }
    }
}
