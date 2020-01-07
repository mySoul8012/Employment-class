package com.ming;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, DocumentException {
        SAXReader reader = new SAXReader();
        // 读取xml
        InputStream inputStream = new FileInputStream(new File("C:\\Users\\Administrator\\IdeaProjects\\untitled6\\day-15\\target\\classes\\books.xml"));
        // 进行装载
        Document document = reader.read(inputStream);
        // 获取跟元素
        Element rootElement = document.getRootElement();
        // 进行打印
        System.out.println(rootElement.getName());
        // 获取所有子元素
        List<Element> elements = rootElement.elements();
        // 进行遍历集合
        for(Element bookElement:elements){
            // 获取book元素的属性
            String idValue = bookElement.attributeValue("id");
            // 进行打印
            System.out.println(bookElement.getName());
            // 进行打印值
            System.out.println("id的属性值为 " + idValue);
            // 获取book元素的子元素
            List<Element> elements1 = bookElement.elements();
            // 进行遍历
            for (Element element : elements1) {
                // 进行遍历
                // 获取元素名字
                System.out.println(element.getName());
                // 获取元素文本
                String text = element.getText();
                // 进行文本打印
                System.out.println("文本的内容是 " + text);
            }
        }
    }
}
