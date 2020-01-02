# 题目1
已知在项目的模块itcast下存在一个文件person.txt，里面的内容如下：

​	王五=南京
.
​	张三=上海

​	李四=北京


观察下列代码，最终结果是：(   )

```
Properties prop = new Properties();
prop.load(new FileReader("itcast\\person.txt"));
Set<String> keys = prop.stringPropertyNames();
for (Iterator<String> it = keys.iterator(); it.hasNext();) {
	String key = it.next();
	String value = prop.getProperty(key);
	System.out.println(key+"---"+value);
}
```

A:  没有任何结果

B:  报异常

C:  李四---北京 张三---海 王五---南京

D:  李四---北京 张三---上海

答案： C
读取的顺序为 王五，到李四，输出的时候，为李四到王五

# 题目2
已知存在一个文件：D:\user.txt，里面的内容如下：

username=zhangsan

password=123

观察下列代码，最终结果是：(   )

```aidl
Properties prop = new Properties();
prop.load(new FileReader("D:\\user.txt"));
String username = prop.getProperty("username");
String password = prop.getProperty("password");
if("zhangsan".equals(username)&&"123".equals(password)){
    System.out.println("登录成功");
}else{
    System.out.println("用户名或者密码错误");
}
```

A:  登录成功

B:  用户名或者密码错误

C:  不打印任何内容

D:  程序无法正常运行

答案： A

# 题目3
下列说法错误的是：

A：打印流不会抛出IO异常；

B：Properties主要被用来操作内容是键值对的配置文件；

C：Properties本质上是一个Map集合；所以一般都通过Map接口中定义的方法来操作Properties对象；

D：Properties不能直接读写文件，所以使用Properties时需要提供相应的IO流；

答案： C
由于历史遗漏原因，导致Properties 内部为HashTable

# 题目4
下列说法错误的是：（）

A：缓冲字节流底层也是使用普通的字节流读写数据的；

B：缓冲字节流底层有一个数组，用于缓存要读写的数据；

C：缓冲字节流读写数据时不是直接操作硬盘的，而是操作缓存数组的，因为直接操作内存，所以速度快；

D：缓冲字节流写数据时，先将数据写到缓存数组中；只有到关闭流时才将数据写出到硬盘上；


答案： D
只有关闭流，调用flussh函数，数组满了，这三种情况之一，才会把数据写出到硬盘上。

# 题目5
已知在项目的模块itcast下存在123.txt文件，文件中具有如下数据：

abc你好

观察下列代码，求最终结果：(   )

```aidl
BufferedInputStream bufin = new BufferedInputStream(new FileInputStream("itcast\\123.txt"));//itcast表示模块名
byte[] b = new byte[4];
int len = 0;
while ((len = bufin.read(b)) != -1) {System.out.println(new String(b));}
bufin.close();
```

A:  abc你好

B:  abc你

C:  报异常

D:  在控制台会看到乱码

答案 D

解析： 由于使用windwos 进行文本编辑，前三个为bom，所以为空，再次读取一个字符为a，所以第一行输出a
由于第二次读取，读取bc，外加两个字符，由于中文三个字符，你进行拆开读取，导致出现乱码，乱码的是你。

# 题目6
已知在项目的模块itcast下存在123.txt文件，文件中具有如下数据：

ab

观察下列代码

```aidl
BufferedInputStream buf = new BufferedInputStream(new FileInputStream("itcast\\123.txt"));//itcast表示模块名
int b1 = buf.read();System.out.println(b1);
int b2 = buf.read();System.out.println(b2);
int b3 = buf.read();System.out.println(b3);
buf.close();
```

请问，在控制台得到的结果是什么?  (   )

A:  a b -1

B:  97 98 -1

C:  a b a

D:  97 98

答案： B

由于有没类型转换，强制输出 acciss码值。

# 题目7
已知在项目目录下有“itcast”文件夹，观察下列代码，执行后产生的结果是：

```aidl
FileOutputStream fo = new FileOutputStream("itcast\\out.txt");
fo.write("hello 黑马程序员".getBytes());
fo.close();
fo.write("hello 传智播客".getBytes());
```

A:  不会生成任何文件，代码报出异常，因为在项目的模块itcast下找不到相应的"out.txt"

B:  在项目的模块itcast下会生成一个out.txt文件，里面的内容是：hello 黑马程序员hello 传智播客

C:  在项目的模块itcast下会生成一个out.txt文件，里面的内容是：hello 黑马程序员。但是会报异常：Stream Closed

D:  在项目的模块itcast下会生成一个out.txt文件，里面的内容是：hello 传智播客。但是会报异常：Stream Closed

答案： C
由于流发生了提前关闭，所以答案为C

# 题目8
已知在项目的模块itcast下存在copy.txt文件，文件中具有如下数据：

黑马程序员

观察下列代码，求最终结果：(   )

```aidl
BufferedReader br = new BufferedReader(new FileReader("itcast\\copy.txt"));
BufferedWriter bw = new BufferedWriter(new FileWriter("itcast\\copy.txt"));
String line=null;
while((line=br.readLine())!=null){bw.write(line);}
bw.close();
br.close();
```

A:  黑马程序员

B:  报异常

C:  项目的模块itcast下的copy.txt文件没有任何内容

D:  黑马程序员黑马程序员

答案 C

由于读取自身，导致没有任何内容，内容为空。


# 题目9
当前项目路径下存在一个itcast目录，观察下列代码，求最终结果：(   )

```java
BufferedWriter bw = new BufferedWriter(new FileWriter("itcast\\bw.txt"));
bw.write("传智学院");
bw.write("传智播客");
bw.newLine();
bw.write("黑马程序员");
bw.close();
```
A:  报找不到文件异常，因为bw.txt文件不存在

B:  在项目的模块itcast下创建一个bw.txt文件，但是文件中没有任何内容

C:  在项目的模块itcast下创建一个bw.txt文件，文件中内容是：

D:  在项目的模块itcast下创建一个bw.txt文件，文件中内容是：传智学院传智播客[这里换行]黑马程序员


答案： D

# 题目10
假设当前项目根目录下test.txt文件内容为www.itcast.cn；以下代码运行后test.txt文件中的内容是（   ）。

```aidl
public class TestBuffered {
	public static void main(String[] args) throws IOException {
		BufferedReader br =  new BufferedReader(new FileReader("test.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
        String str = br.readLine();
        if(str !=null){
			bw.write(“官网：”+str);
			bw.flush();
        }
        br.close();
        bw.close();     
	}
}
```

A： www.itcast.cn	 

B： 文件内容为空	 

C： 官网：www.itcast.cn	 

D： 代码报错；


答案 B

# 题目11
下列说法错误的是：（）

A：转换流是字节流和字符流之间转换的桥梁；

B：输入转换流可以将输入字节流转换为输入字符流；

C：输出转换流可以将输出字符流转换为输出字节流；
D：转换流可以直接读写文件；

答案： D

# 题目12
以下关于编码表阐述错误的是：(   )

A:  编码表可以将计算机所熟知的二进制和我们所熟悉的字符之间进行转换

B:  无论什么编码表都兼容ASCII码表

C:  ISO-8859-1编码表适用于欧美国家

D:  ASCII码表支持中文

答案： D

ASCII 仅支持中文字符
# 题目13
以下关于编码表阐述错误的是：(   )

A:  在UTF-8编码表中中文占2个字节

B:  乱码产生的原因是编码和解码使用的编码表不一致导致的

C:  在ASCII码表中b的编码值是98

D:  将存储在计算机中的二进制数按照某种规则解析显示出来，称为解码

答案： A
UTF-8编码中，中文占用3个字节

# 题目14
( )是转换流，可以将字节流转换成字符流，是字节流通往字符流之间的桥梁

A：  InputStreamReader	 

B： FileWriter	 

C： BufferedWriter	 

D： OutputStreamWriter	

答案： A
字节流，没有编码，属于二进制数据，字符流有编码，有UTF-8，GBK编码等。
InputStreamReader 属于转换流，输入没有编码的字节流，通过转换流，转换为有编码的字符流。

OutStreamWriter 属于转换流，输入有编码的字符流，通过转换流，转换成为有编码的字符流。

# 题目15
已知在硬盘: F:\\4.txt  文件中保存字符串数据："你好"  。

注意：

1)该文件以GBK编码保存的。

2)idea工作环境默认编码方式是UTF-8。

观察下列代码，求最终结果：(   )

```aidl
InputStreamReader isr = new InputStreamReader(new FileInputStream("F:\\4.txt"));
int read;
while ((read = isr.read()) != -1) {System.out.print((char)read);}
isr.close();
```

A:  你好

B:  没有结果

C:  报异常

D:  乱码

答案： D

因为默认编码为UTF-8，没有指定编码，会出现乱码情况，需要使用转换流，需要指定编码为 UTF-8

# 题目16
已知在硬盘: D:\\123.txt  文件中保存字符串数据："传智学院"  。

注意：

1)该文件以GBK编码保存的。

2)idea工作环境默认编码方式是UTF-8。

观察下列代码，求最终结果：(  )

```aidl
InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\123.txt"),"GBK");
int read;
while ((read = isr.read()) != -1) { System.out.print((char)read);}
isr.close();
```
A:  传智学院

B:  乱码

C:  报异常

D:  没有结果

答案： A

# 题目17
已知idea工作环境默认编码方式是UTF-8。

观察下列代码，以下说法正确的是：(   )

```aidl
OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:\\out.txt"));
osw.write("你好"); 
osw.close();
```

A:  会在E盘位置生成一个out.txt文件，文件中的内容是乱码

B:  不会在E盘位置生成一个out.txt文件

C:  会在E盘位置生成一个out.txt文件，文件中的内容是你好，并且文件大小是4个字节

D:  会在E盘位置生成一个out.txt文件，文件中的内容是你好，并且文件大小是6个字节

答案： D

中文的UTF-8编码为3个字符，3 * 2 =  6 为六个字节

# 题目18
已知在硬盘: F:\\4.txt  文件中保存字符串数据：

传智播客

黑马程序员

酷丁鱼

传智学院

注意：

​	1)该文件以GBK编码保存的。

​	2)idea工作环境默认编码方式是UTF-8。

观察下列代码，以下说法正确的是：(   )

```aidl
InputStreamReader isr = new InputStreamReader(new FileInputStream("F:\\4.txt"),"GBK");
OutputStreamWriter w = new OutputStreamWriter(new FileOutputStream("F:\\3.txt"),"utf8");
char[] buffer = new char[1024];
int len = -1;
while((len = isr.read(buffer)) != -1){w.write(buffer, 0, len);}
isr.close();
w.close();
```

A:  当运行程序后，会在F盘位置生成一个3.txt文件，文件中的内容是乱码

B:  当运行程序后，会在F盘位置生成一个3.txt文件，文件中的内容是:  

​	传智播客
​	黑马程序员
​	酷丁鱼
​	传智学院

C:  当运行程序后，会在F盘位置生成一个3.txt文件,该文件编码方式是gbk

D:  当运行程序后，会报找不到文件异常

答案： B

# 题目19
下列说法错误的是：（）

A：序列化是将复杂的数据（如对象）转换为二进制数据输出；

B：反序列化是将经过序列化得到的二进制数据再转换回复杂数据（如对象）；

C：序列化保存对象时，静态成员变量的值不能被序列化保存；

D：反序列化时，类必须提供无参构造函数；

答案： D

# 题目20

关于序列化流的描述正确的是?（ )

A： 一个类只要实现了java.io.Serializable接口，该类对应的对象就可以实现序列化

B：  ObjectOutputStream流是将内容写入到Object对象中	 

C：  ObjectInputStream流是读取Object对象里的内容	 	 

D： ObjectInputStream是从文件中读取一个对象出来，读出来是Object类型的，需要进行强制类型转换

​	

答案： AD
一个类只要实现了 Serializable 接口，该类对应的对象就可以实现序列化。

# 题目21

