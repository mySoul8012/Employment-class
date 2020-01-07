package com.ming;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

public class XPathDemo {
    public static void main(String[] args) throws FileNotFoundException, DocumentException {
        // Demo4j 核心类
        SAXReader reader = new SAXReader();
        // 读取xml
        InputStream inputStream;
        inputStream = new FileInputStream(new File("C:\\Users\\Administrator\\IdeaProjects\\untitled6\\day-15\\target\\classes\\books.xml"));
        // 进行读取
        Document document = reader.read(inputStream);
        // 获取xpath
        List<Node> nodes = document.selectNodes("/book/book/sale");
        // 进行遍历
        for(Node node:nodes){
            // 进行输出
            String text = node.getText();
            // 进行输出
            System.out.println(text);
        }
        // 设置全文搜索
        List<Node> nodes1 = document.selectNodes("//name");
        // 进行遍历
        for(Node node:nodes1){
            // 进行输出
            System.out.println(node.getText());
        }
        // 进行条件筛选
        Node node = document.selectSingleNode("//book[@id=0001]");
        // 进行输出
        System.out.println(node.getName());
        // 输出相对路径
        Node node1 = node.selectSingleNode("name");
        // 输出结果
        System.out.println(node1.getText());
    }
}
