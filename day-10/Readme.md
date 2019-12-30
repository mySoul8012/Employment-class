
# 题目1
下列说法错误的是：（）

A：File类可以根据表示文件路径的字符串创建一个File类对象；

B：File类对象表示的文件或文件夹可能存在也可能不存在；

C：File类可以使用绝对路径或者相对路径创建文件；

D：对象new File(“F:\\1.txt”)表示的一定是F盘根目录下的一个文本文件；

答案： D


# 题目2
下列说法错误的是：（）

A：File类提供了创建文件和创建文件夹的方法；

B：不管路径名有没有后缀，使用createNewFile方法都是创建文件；

C：使用File类创建文件的时候，父目录必须存在，否则就会报错；

D：使用File类创建文件夹的时候，父目录必须存在，否则就会报错；

答案： D

# 题目3
下列说法错误的是：（）

A． 一个File 对象代表了操作系统中的一个文件或者文件夹
B． 可以使用File 对象创建和删除一个文件
C． 可以使用File 对象创建和删除一个文件夹
D． 当一个File 对象被垃圾回收时，系统上对应的文件或文件夹也被删除

答案： D

# 题目4
下列说法错误的是：（）

A：使用File类可以获取硬盘上的所有磁盘盘符；

B：使用File类可以获取文件中的数据；

C：使用File类可以获取一个文件的字节数；

D：使用File类的高级获取方法（listFiles）方法可以获取一个文件夹中的所有直接子文件，包括隐藏文件；

答案： B

# 题目5
请问File类中获取文件或者文件夹名字的方法是？ 最终结果：(  )

A:  getName

B:  getFiles

C:  getDirectory

D:  isFile

答案： A

# 题目6
请问File类中判断一个路径指向的是文件的方法是？最终结果：(  )

A:  isDirectory

B:  isHidden

C:  getAbsoluteFile

D:  isFile

答案： D

# 题目7
请问File类中判断一个路径指向的是文件夹的方法是？最终结果：(   )

A:  isAbsolute

B:  getPath

C:  getParentFile

D:  isDirectory

答案： D

# 题目8
请问以下哪个选项是相对路径？最终结果：(   )

A:  C:\itheima\Demo1.java

B:  day01\com\itheima\day09\FileDemo.java

C:  D:\musics\x.mp3

D:  E:\movies



答案： B

# 题目9
关于File对象创建错误的是（ ）

A： File file1 = new File("D:\\test.txt");	 

B： File file2 = new File("D:\\test");	 

C： File file3 = new File("D:\\test", "test.txt");	 

D：  File file4 = new File(new Object());

答案： D

# 题目10
下列File类的方法应用说明正确的是（ ） 

A： getPath() ：将此File转换为绝对路径名 字符串。	 

B： exists() ：此File表示的文件或目录是否实际存在，如果不存在则创建。

C： length() ：返回由此File表示的文件的字节长度。	 

D： isDirectory() ：判断此File表示的是否为文件。

答案： C
A 返回的是定义时的路径
B isFile 表示此File的文件是否存在
D 判断是否是文件夹

# 题目11
File类型中定义了什么方法来判断一个文件是否存在？（  ）

A： createNewFile	 

B：  renameTo	 

C： delete	 

D： exists	

答案： D

# 题目12
下列说法错误的是：（）

A：抽象路径是不带磁盘盘符的路径；

B：绝对路径是带磁盘盘符的路径；

C：要获取一个文件夹及其所有子文件夹中的内容，可以使用递归实现；

D：递归就是函数中直接或间接的调用函数自身；递归效率比循环更高；

答案： D

# 题目13
递归是什么含义？(   )

A:  就是调用方法

B:  递归就是方法中调用自身

C:  通过对象调用方法

D:  无限递归次数不限

答案： B

# 题目14

关于递归的描述正确的是(多选)   

A： 是一种直接或间接地调用自身的算法	 

B： 使程序变得简洁	 

C： 递归的次数对程序的运行没有任何影响	 

D：  必须要有一个出口

答案： ABD

# 题目15
下列说法错误的是：（）

A：IO流是用来将数据从计算机内存和内存之外进行交换的；

B：输入流是将数据从内存外读进内存的；

C：输出流是将数据从内存里写出去的；

D：IO流只能读写文件数据；

答案： D

# 题目16
下列说法错误的是：（）

A：按照数据流动方向，IO可分为输入流和输出流；

B：按照数据读写单位，IO可分为字节流和字符流；

C：字节流可以读写任意类型的文件，因为所有文件底层都是0101这样的字节数据；

D：字符流可以读写文本文件和图片文件；

答案： D
因为字符流不能读取图片文件，会进行转码

# 题目17
下列说法错误的是：（）

A：InputStream是所有字节输入流的最高父类；

B：InputStream类的对象可以从文件中读取字节数据；

C：FileInputstream类是用来从文件中读取字节数据的；

D：OutputStream类是所有字节输出流的最高父类；

答案： B

# 题目18
观察下列代码
```aidl
public static void main(String[] args) throws Exception {
    FileOutputStream fos = new FileOutputStream("测试.txt");
    fos.write(97);
    fos.close();
}
```
请问,文件当中显示的结果是什么?  (  )

A:  97

B:  9

C:  A

D:  a

答案： D
97对应的asicc值为a

# 题目19
观察下列代码
```aidl
public static void main(String[] args) throws Exception {
    FileOutputStream fos = new FileOutputStream("测试.txt");
    fos.write('g');
    fos.close();
    fos.write('d');
    fos.close();
}
```
请问,文件当中显示的结果是什么?(   )

A:  出现异常,文件无内容

B:  出现异常，输出流已关闭不能写入数据，但文件里的内容是g

C:  gd

D:  d

答案： B

# 题目20
观察下列代码
```aidl
public static void main(String[] args) throws Exception {
    FileInputStream fis = new FileInputStream("测试.txt");
    int temp;
    while(需要补充的代码){
        System.out.println(temp);
    }
    fis.close();
}
```

请选择需要填补的代码 (  )

A:  (temp=fis.read(temp))!=-1

B:   (fis.read(temp))!=-1

C:  (temp=fis.read())!=-1

D:  fis.read()!=-1

答案： C

# 题目21
"测试.txt"当中内容如下:

abc

观察下面代码

```aidl
public static void main(String[] args) throws Exception {
    FileInputStream fis = new FileInputStream("测试.txt");
    int temp;
    while((temp=fis.read())!=-1){
        System.out.print(temp);
    }
    fis.close();
}
```
运行代码后,控制台显示结果是?(   )

A:  abc

B:  a

C:  656667

D:  979899

答案： D

# 题目22
在“测试文件.txt”中，有如下数据：

abc

请分析，以下代码执行后，文件中的数据为： (   )

```
public static void main(String[] args) throws Exception {
    FileInputStream fis = new FileInputStream("测试文件.txt");
    FileOutputStream fos = new FileOutputStream("测试文件.txt");
    int temp = 0;
     while((temp = fis.read()) != -1){
        fos.write(temp);
    }
    fis.close();
    fos.close();
}
```
A:   abcabc

B:  abc

C:  没有数据

D:  979899

答案： B

# 题目23
在Java的IO操作中，（ ）方法可以用来刷新流的缓冲(多选)。

A： void release( )	 

B： void close( )	 

C： void remove( )	 

D： void flush( )

答案： BD

# 题目24
使用Java IO流实现对文本文件的读写过程中，需要处理下列（   ）异常。 

A： NullPointerException	 

B： IOException	 

C： SQLException	 

D： RemoteException

答案： B

# 题目25
想要在 测试文件 当中显示数据是 97 

请问在 下面代码 fw.write() 的括号当中,应该选择哪一项? (   )


```aidl
public static void main(String[] args) throws Exception {
    FileWriter fw = new FileWriter("测试文件.txt");
    fw.write(需要填写代码);
    fw.close();
}
```

A:   97

B:  'a'

C:  'A'

D:  "97"
答案： D

# 题目27
想要在 测试文件 当中显示数据是 helloworld 其中hello是第一行,world是第二行。在Windows操作系统中有效

代码如下:

```aidl
public static void main(String[] args) throws Exception {
    FileWriter fw = new FileWriter("测试文件.txt");
    fw.write("需要填写代码");
    fw.close();
}
```
请问：在需要填写代码处，应该如下填写代码? (   )

A:  hello\n\rworld

B:  hello\dworld

C:  hello\rworld

D:  hello\r\nworld

答案： D

# 题目28
在Java中，下列关于读写文件的描述错误的是（    ）。 

A： Reader类的read()方法用来从源中读取一个字符的数据	 

B： Reader类的read(int n )方法用来从源中读取一个字符的数据	 

C： Writer类的write(int n)方法用来向输出流写入单个字符	 

D： Writer类的write(String str)方法用来向输出流写入一个字符串

答案： B

# 题目29
在测试文件当中，数据如下：

ABC

下面代码执行之后

```aidl
public static void main(String[] args) throws Exception {
    FileReader fr = new FileReader("测试文件.txt");
    int temp;
    while((temp=fr.read())!=-1){
        System.out.print(temp);
    }
    fr.close();
}
```

请问控制台显示结果是?(   )

A:  ABC

B:  abc

C:  656667

D:  979899

答案； C

# 题目30
在测试文件当中，ABC在一行，数据如下： 

ABC

下面代码执行之后
```aidl
public static void main(String[] args) throws Exception {

    FileReader fr = new FileReader("测试文件.txt");
    int ch;
    while(true){
        ch=fr.read();
        if(ch==-1){
            break;
        }
        System.out.print((char)ch);
    }
    fr.close();
}
```

请问控制台显示结果是? (  )

A:  ABC

B:  ab

C:  979899

D:  666768


答案： A

# 题目31
在测试文件当中，数据如下：

abcdefgh

完成文件一次读取一个字符数组的操作

```aidl
public static void main(String[] args) throws Exception {
    FileReader fr = new FileReader("测试文件.txt");
    int len;
    char[] chArr = new char[3];
    while((len = fr.read(chArr))!=-1){
        System.out.print(new String(chArr,len,0));
    }
    fr.close();
}
```
请选择运行的结果? (   )

A:  abcdefgh

B:   abc

C:  无结果

D:  979899100101102103104

答案： C

因为反过来了

