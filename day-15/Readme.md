# 题目1
一个字符串由三个0到9的数字字符组成，第一个和第三个一样，匹配规则正确的是：（）

A：”\\d\\d\\d”

B：”\\d{3}”

C：”(\\d)\\d\\1”

D：”[\\d\\d\\d]”

答案： C

# 题目2
符合正则表达式"[12]|[34]"的匹配规则的字符串是：（）

A：”12”

B：”34”

C：”13”

D：”4”


答案： D

# 题目3
(     )是Java中作为解析XML文档后生成的文档树模型

A：Element类

B: Document类

C: Node类

D: Text类


答案： B

# 题目4
Xml文档中的标签以下说法不正确的是(     )

A: 标签必须关闭

B: 标签的属性值必须用引号引起来

C: xml标签不区分大小写

D: 一个格式良好的xml必须有根元素

答案： C

# 题目5
根据下列xml文档实例，选择说法不正确的是(     )

```angular2html
<?xml version="1.0" encoding="UTF-8"?>
<bookstore>
     <book category="CHILDREN">
        <title>Harry Potter</title>
        <author>J K. Rowling</author>
        <year>2005</year>
        <price>29.99</price>
     </book>
</bookstore>
```

A：```<bookstore>``` 和 ```<book>```是属性节点

B：```<bookstore>``` 和 ```<book>``` 是元素节点

C：```category```是一个属性节点

D：```<title>```、```<author>```、```<year>``` 和 ```<price>``` 是元素节点

# 题目6
根据下列DTD约束，选择书写不正确的xml实例文档(     )
```angular2html
<?xml version="1.0" encoding="UTF-8"?>
<!ELEMENT books (book*)>
<!ELEMENT book (name*)>
<!ELEMENT name (#PCDATA)>
<!ATTLIST book id #REQUIRED> 
```

```angular2html
A：<?xml version="1.0" encoding="UTF-8"?>
   <!DOCTYPE books SYSTEM "book2.dtd">
	<books> 
        <book id="b1"> 
            <name>James</name> 
        </book> 
        <book id="b2"> 
            <name>James</name> 
     	</book>
	</books>
B：<?xml version="1.0" encoding="UTF-8"?>
   <!DOCTYPE books SYSTEM "book2.dtd">
	<books> 
        <book id="b1"> 
            <name>James</name> 
        </book>
	</books>
C：<?xml version="1.0" encoding="UTF-8"?>
   <!DOCTYPE books SYSTEM "book2.dtd">
	<books> 
        <book > 
            <name>James</name> 
        </book> 
        <book > 
            <name>James</name> 
        </book>
     </books>
D：<?xml version="1.0" encoding="UTF-8"?>
   <!DOCTYPE books SYSTEM "book2.dtd">
   <books> 
       <book id="b2"> 
           <name>James</name> 
       </book>
   </books>
```

答案： C

# 题目7
根据下列需求，选择合适的选项完善代码(     )

需求：根据下图，解析book.xml获取id=01的书名，作者，价格打印输出到控制台

```angular2html
book.xml
<?xml version="1.0" encoding="UTF-8"?>
<books>
       <book id="01" 出版社="传智出版社">
            <name>Java变成思想</name>
            <author>James</author>
            <price>79.00</price>
            <body>库存：30</body>
       </book>
</books>
```

```angular2html
public class Test01 {
    public static void main(String[] args) throws Exception{
        fun();
    }

   public  static void fun() throws Exception{
        SAXReader saxReader  = new SAXReader();
        Document document  =  saxReader.read("book.xml");
        Element root = document.getRootElement();
        List<Element> bookList  = root.elements("book");
        Element bookElement  = bookList.get(0);
        Element nameElement  = bookElement.element("name");
        Element authorElement  = bookElement.element("author");
        Element priceElement  = bookElement.element("price");
        System.out.println("书名："+        +"  作者："+ authorElement.getText()+"  价格："+ priceElement.getText());
    }
}
```

A. document.getElements()
B. document.getRootElement()
C. nameElement.getText()
D. nameElement.getelementText()

答案： C
