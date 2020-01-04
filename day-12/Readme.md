# 题目1
网络编程三要素不包括：（）

A：IP

B：端口

C：协议

D：域名

答案： D

# 题目2
UDP协议的特点不包括:（）

A：面向无连接，不可靠；

B：传输数据大小有限制，每次最多64kb；

C：效率高；

D：数据接收方必须存在才能发送数据；

答案： D
UDP协议的特点，面相无连接的，效率高，当不可靠，每次传输的数据大小有限制。
即，发送的数据没影响，最终接受方接受的数据会被丢弃。

# 题目3
TCP协议的特点不包括：（）

A：面向有连接，安全可靠；

B：数据传输大小没有限制；

C：需要经过三次握手，确认对方存在才能建立连接，效率比UDP协议更低；

D：一般在传输文件时不能使用TCP协议，因为TCP协议效率低；

答案： D
TCP 协议传输数据大小没有限制，而且面相有连接，安全可靠，传输文件时都会使用 TCP 协议。

# 题目4
下列说法错误的是：（）

A：使用UDP协议发送数据，需要将数据封装到一个数据报包（DatagramPacket）对象中；

B：UDP发送方的数据报包对象就像一个快递包裹，包含了发送的数据、接收方的ip和接收方的端口；

C：UDP接收方接受的数据，也要使用一个数据报包对象封装，应该给这个数据报包对象传递一个数组来保存接收的数据；

D：UDP协议发送数据，发送多个数据报包时，接收方是按照发送的顺序接受的；

答案： D

因为UDP是无连接的协议，现实中的网络很复杂，所以不保证接收方都能接收到数据，所以不保证接收方接受的顺序。


# 题目5
下列说法错误的是：（）

A：使用TCP协议通信时，首先发起连接请求的一方叫做客户端，被动接受请求的一方叫做服务器；

B：TCP协议的服务器一方使用ServerSocket类的对象表示，创建这个类的对象时需要指定服务器监听的端口；

C： TCP服务器启动后，没有客户端连接，就会一直阻塞；当有客户连接到达时，就会获取一个表示这个连接的Socket对象，然后通过这个Socket对象和客户端通信；

D：TCP服务器在处理完一个客户端请求之前，不能接受其他的客户端请求；

答案： D
使用多线程。处理完一个客户端请求，不能接受其他客户端请求。


# 题目6
观察下列代码，最终结果是：(   )

客户端代码：
```aidl
Socket s = new Socket("127.0.0.1", 10000);

OutputStream os = s.getOutputStream();

os.write("hello，TCP,我来了".getBytes());

s.close();
```
服务端代码：

```aidl
ServerSocket serverSocket = new ServerSocket(9999);

Socket socket = serverSocket.accept();

InputStream is = socket.getInputStream();

byte[] buf=new byte[1024];

int len=0;

while((len=is.read(buf))!=-1){System.out.println(new String(buf,0,len));}
```
A:  hello，TCP,我来了

B:  客户端报异常，java.net.ConnectException: Connection refused

C:  报连接超时异常

D:  没有输出任何内容

答案： B

两个Socket不在一个局域网内

# 题目7
以下关于TCP传输协议描述错误的是：(   )

A:  TCP需要先建立连接，因此，服务端必须先存在，客户端才能正常执行

B:  对于TCP传输协议，服务端不需要使用客户端Socket

C:  多个客户端可以访问一个服务端

D:  客户端之间是不能相互访问的

答案： B

# 题目8
以下关于TCP传输协议下文件的上传描述错误的是： (    )

A:  文件上传，服务端需要获取客户端的Socket，然后使用获取的Socket向通道中写反馈信息

B:  如果客户端已经上传完毕，那么需要使用Socket类中的shutdownOutput()方法向通道中写结束标记

C:  在服务端需要使用accept()方法来侦听并获取客户端套接字对象

D:  客户端不用知道服务端端口号也能访问服务端

答案： D

# 题目9
以下关于TCP传输协议下文件的上传描述错误的是： (    )

A:  文件上传，服务端需要获取客户端的Socket，然后使用获取的Socket向通道中写反馈信息

B:  如果客户端已经上传完毕，那么需要使用Socket类中的shutdownOutput()方法向通道中写结束标记

C:  在服务端需要使用accept()方法来侦听并获取客户端套接字对象

D:  客户端不用知道服务端端口号也能访问服务端

答案： D

# 题目10
以下关于CS架构说法错误的是：(   )

A:  全称为Client/Server结构，是指客户端和服务器结构

B:  可以把一些运算放在客户端的电脑上运行。降低服务器的压力

C:  开发软件的时候，程序员需要开发2套软件，一个是给用户使用的客户端程序，一个是给服务器运行服务端程序

D:  开发周期短，维护成本低


答案： D

# 题目11
以下描述不正确的是（ ）

A： TCP是面向连接的	 

B： TCP可以保证链接的可靠	 

C： UDP是安全的	 

D： UDP传输速度比TCP快	

答案： C

UDP 是不安全的，

# 题目12

以下描述错误的有(多选)（  ）

A： TCP要求系统资源较多，UDP较少	 

B： TCP保证数据正确性，UDP可能丢包	 

C： TCP和UDP均为面向连接的	 

D： TCP和UDP在传输数据前需要先进行三次握手	 

E： TCP保证链接可靠，UDP不保证	

答案： CD

# 题目12
以下哪个方法是ServerSocket类用于接收来自客户端请求：

A：receive()

B：accept()

C： set()

D： send()

答案： B
accept 用于返回连接的socket对象，