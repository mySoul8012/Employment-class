package com.ming8;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

public class Test02 {
    public static void main(String[] args) throws FileNotFoundException, DocumentException {
        SAXReader saxReader = new SAXReader();
        // 获取输入流
        InputStream inputStream = new FileInputStream(new File("C:\\Users\\Administrator\\IdeaProjects\\untitled6\\day-15\\src\\main\\resources\\books2.xml"));
        // 获取文档
        Document document = saxReader.read(inputStream);
        // 获取跟节点
        Element element = document.getRootElement();
        // 获取子节点
        List<Element> elements = element.elements();
        // 进行遍历
        for (Element element1 : elements) {
            // 进行遍历
            // 获取元素名字
            String name = element1.getName();
            // 获取元素文本
            String text = element1.getText();
            // 输出结果
            System.out.println(name + " " + text + " ");
        }
    }
}
