# 题目1
以下关于Object类,说法错误的是? （）

A:  任何类都间接或者直接继承Object类

B:  Object是所有类的根类(父类)

C:  任何一个类都可以使用Object类中的方法

D:  Object类中的方法不能被重写

# 题目2
 下面说法错误的是：

A：Object类是Java中最高父类，其它所有类都直接或者间接的继承Object类；

B：Java中，如果一个类没有明确书写继承的类，则默认都继承Object类；

C：Object类型的变量，可以指向Java中任意一个对象；

D：Object类是一个抽象类，所有Java类都具有Object类中定义的方法；

# 题目3
下面对于toString()方法和equals()方法描述正确的是? （）

A:  类重写toString()方法是为了打印对象的地址

B:  类重写equals()方法是为了比较对象的地址

C:  类重写toString()方法是打印对象中的属性,重写equals()是比较对象中的属性

D:  类只能重写Object中的toString()方法和equals()方法


# 题目4
下面说法错误的是：（）

A：toString方法会返回一个字符串，在使用System.out.println()语句输出对象时就是输出的这个方法返回的数据；

B：String类已经重写了toString和equals方法；

C：一般开发中都需要重写toString方法和equals方法

D：equals方法底层使用的是 == 比较的，所以是用来比较两个对象是否是同一个对象的；

答案 D

# 题目5
观察下列代码.日期格式化为字符串是(时间忽略)?  （）

```angular2
public class SimpleDateFormatDemo {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date = new Date();
        String s = sdf.format(date);
        System.out.println(s);
    }
}
```
A:  2018/04/11 22:01:30

B:  2018年04月11日 22:01:30

C:  2018.04.11 22:01:30

D:  2018-04-11 22时01分30秒

答案： B

# 题目6
想得到"2018-04-11 22时12分10秒"(时间忽略),模式正确的是?：

```angular2
public class SimpleDateFormatDemo {

    public static void main(String[] args) throws ParseException {
        //此处代码应填写
        Date date = new Date();
        String s = sdf.format(date);
        System.out.println(s);
    }
}
```

```angular2
A:  SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

B:  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH时mm分ss秒");

C:  SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH时mm分ss秒");

D:  SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
```
答案： B

# 题目7
阅读代码,横线位置应填写的内容是? （）
```angular2
public class SimpleDateFormatTest {

    public static void main(String[] args) throws ParseException {
        String str = "1998-01-01";
        SimpleDateFormat sdf = new SimpleDateFormat(_____);
        Date date = sdf.parse(str);
        System.out.println(date);
    }
}
```

# 题目8
下面说法错误的是：（）

A：Java中表示时间的类是util包中的Date类；

B：Date类的对象表示一个时间段；

C：Date类中从时间中获取年月日的方法过时了，开发中应该使用Calendar类的方法实现；

D：Date类中将时间格式化为字符串的方法过时了，开发中应该使用DateFormat或者SimpleDateFormat类；

答案： B

# 题目9
下面说法错误的是：（）

A：Calendar类是日历类，通过getInstance方法获取的对象表示的是当前时间点的日历信息；

B：因为可以方便的自定义格式，所以开发中处理时间和字符串的转换时，一般使用SimpleDateFormat类，而非DateFormat类；

C：基本类型包装类在开发中一般用来将字符串转换为对应的基本类型数据；

D：要将字符串转换为基本类型数据，字符串的字面值必须表示的是这个基本类型数据的一个值，否则运行时就会出现异常；

答案： D

# 题目10
 读代码,控制台输出的结果为? （）
 
 ```angular2
public class IntegerDemo {
    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + 10);
        int i = Integer.parseInt(str);
        System.out.println(i + 10);
    }
}
```
A:  12310,133

B:  133,13310

C:  12310,13310

D:  133,133
答案： A

# 题目11
阅读代码，控制台输出的结果为？()
```angular2
public class IntegerDemo {
    public static void main(String[] args) {
        String str = "1a3";
        Integer it = new Integer(str);
        int i = it.intValue();
        System.out.println(i);
    }
}
```

A:  1a3

B:  13

C:  运行报错,字符串内容必须是数字字符

D:  1

答案：C

# 题目12

阅读代码，控制台要打印 110 横线处需要填写什么()
```angular2
public class IntegerDemo {
    public static void main(String[] args) {
        int i = 1;
        Integer it = new Integer(i);
        String s = ___;
        System.out.println(s + 10);
    }
}
```
A:  it

B:  it.toString();

C:  i

D:  110

答案: B

# 题目13
阅读代码,控制台打印的结果为? （）

```angular2
public class IntegerDemo {
    public static void main(String[] args) {
        int i = 10;
        String str = i + "";
        System.out.println(str.equals("10"));
    }
}
```
A:  false

B:  true

C:  运行报错

D:  0

答案: B

# 题目14
 面说法错误的是：（）
 
 A：System类提供了数组复制的方法；开发中如果遇到数组复制的需求，使用它更高效；
 
 B：Math类主要提供各种常见的数学运算的方法，而且全部都是静态的方法；
 
 C：自动装箱和自动拆箱是JDK5出现的新技术，主要用来简化包装类对象和基本类型数据之间的转换的；
 
 D：正则表达式是Java中独有的用来匹配字符串的技术;
 
 答案： D
 
# 题目 15
请按从大到小的顺序写出四种访问权限修饰符。

public protected default private

# 题目 16
请问修饰“类”可以使用什么权限修饰符？

public  default 

# 题目 17
请问修饰“成员属性”可以使用什么权限修饰符？
public protected default private

# 题目 18
请问构造方法可以使用什么权限修饰符？
public private protected  什么都不写

# 题目 19
请问修饰“成员属性”、“成员方法”、“构造方法”都可以使用任意一种访问权限修饰符吗？
成员属性，成员方法，构造方法，可以使用任意一种访问权限修饰符。

# 题目 20
请问有几种代码块？它们分别是什么？它们的作用是什么？
分为静态代码块，构造代码块，
静态代码块用static修饰符修饰，构造代码块类中用{}修饰，每创建一次执行
执行顺序：
静态代码块，main函数，构造块，构造方法。

# 题目 21
请分别写出每种代码块的示例
## 静态代码块
```angular2
static {

}
```

## 构造块
```angular2
{


}
```

# 问答题
## 第一题
请写出八种基本类型和它们对应的包装类的名字？
八种基本类型(byte, short, int, long, float, double, char, boolean)

包装类
byte   Byte
short Short
int Integer
long Long
char Character
float Float
double Double
boolean Boolean

## 第二题
请问什么是自动装箱和自动拆箱？
装箱：基本数据类型转换成为包装数据类型
拆箱： 包装数据类型转换成基本数据类型

自动拆装箱，上述过程自动化


