# 题目1
1.(多选)tomcat发布项目的方式有哪几种( )
A.在webapps文件夹下面直接发布;
B.修改conf/server.xml文件;
C.配置独立xml文件;
D.直接部署在bin文件夹下面;

答案： A，B,C

# 题目2
2.(单选)在Tomcat服务器的webapps文件夹下部署了名称为aaa的web项目,项目根目录下有一个test.html文件,服务器启动后(端口不曾被修改)，正确访问test.html文件的方式是()
A. localhost:8080/webapps/aaa/test.html
B. localhost:8080/aaa/test.html
C. localhost:8080/test.html
D. localhost:9090/aaa/test.html

答案： B

# 题目3
3.(多选)以下哪些是静态的web资源？()
A.Html  B. CSS  C. JavaScript  D.图片

答案： ABCD

# 题目4
4.(多选)以下软件哪些为B/S架构(  )
A.黑马官网(www.itheima.com)
B.传智播客官网(www.tcast.cn)
C.手机QQ
D.网页版淘宝

答案： ABD

# 题目5
5.(多选)以下软件哪些为C/S架构(  )
A.黑马官网(www.itheima.com)
B.传智播客官网(www.tcast.cn)
C.手机QQ
D.手机版淘宝

答案： C，D

# 题目6
6.(多选)以下哪些请求为get请求()
A.在浏览器地址栏中输入一个请求路径
B.<a href=”http://www.itheima.com/index.html”></a>
C.JavaScript代码: location.href=”http://www.itheima.com/index.html”
D.<form action=”http://www.itheima.com/index.html” ></form>

答案： ABCD

# 题目7
1.描述tomcat服务器每个目录的作用?
bin目录： 存放启动和关闭tomcat服务器的脚本文件
conf目录： 存放tomcat服务器配置文件。
lib目录，存放tomcat服务器以及web应用需要使用的jar包
webapps目录，存放部署到服务器上的web应用程序。
work目录，存放tomcat服务器把jsp转成java类和class文件

# 题目8
项目名称：
    |- 静态资源(html,css,js,img)
    |- WEB-INF(存放受到保护的web资源，这些资源文件不能通过浏览器直接访问)
        |- web.xml 当前web项目的核心配置文件，servlet2.5必须有，3.0以后可有可无
        |- lib 存放当前web项目依赖的jar包
        |- classes 存放当前web项目中的Java类编译后的class文件。
# 题目9
3.描述HTTP协议的作用以及组成部分,每部分包含哪些信息
http协议包括在 tcp/ip 协议之上，它规范了传输数据的内容和格式。
http协议包含：
    请求，浏览器发送给服务器的内容。
        http协议约束请求信息的格式和内容。
    响应： 服务器返回给浏览器的内容。
        http 协议约束响应的格式和内容
    注意： 先有请求，后有响应，一次请求对应一次响应，请求和响应成对出现。

# 题目10
get请求和post请求的区别
get请求，请求参数会显示在浏览器的地址栏，携带的数据不安全。
请求的携带的数据量受到浏览器地址大小的限制。
get请求没有请求体。
post请求：
请求参数不会显示在浏览器地址栏。
请求携带的数据相对安全。
请求携带的数据量不受限制。
post请求有请求体，请求体中存放请求的参数。