package com.ming2;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


import java.io.File;
import java.util.List;

public class Ming {
    public static void main(String[] args) throws DocumentException {
        SAXReader saxReader = new SAXReader();
        File file = new File("C:\\Users\\Administrator\\IdeaProjects\\untitled6\\day22-3\\src\\main\\resources\\ming.xml");
        Document document = saxReader.read(file);
        // 获取根节点
        Element root = document.getRootElement();
        System.out.println(root.getName());
        // 获取book节点集合
        List<Element> book = root.elements();
        System.out.println(book.size());
        // 进行集合遍历
        for (Element element2 : book) {
            System.out.println(element2.getName());
            // 获取List
            List<Element> list = element2.elements();
            // 进行遍历
            for (Element element : list) {
                // 进行遍历
                System.out.println(element.getName());
                System.out.println(element.getText());
            }
        }
    }
}
