# 题目1
关于this关键字，下面说法正确的是：（）

A：this关键字可以区分成员变量和局部变量；

B：this关键字可以用来在构造函数中调用其它构造函数；

C：this关键字可以用在函数中，表示对调用这个函数的对象的引用；

D：以上说法都是正确的；

答案： D

解析： this关键字可以用在函数中，表示对调用这个函数对象的引用

# 题目2
关于Java的继承，下面说法正确的是：（）

A：子类继承父类，可以继承父类所有成员；

B：子类继承父类，可以继承父类一般函数和构造函数；

C：子类继承父类，可以继承父类非私有成员；

D：子类继承父类，不能继承父类构造函数；


答案： D

# 题目3
关于Java的继承，下面说法正确的是：（）

A：一个类只能同时继承一个父类；

B：一个类可以同时继承多个父类；

C：一个类只能有一个子类；

D：一个类可以继承任何一个其他类；

答案： A
Java支持当继承

# 题目4
下面说法正确的是：（）

A：方法重写就是指，在同一个类中允许存在多个名称相同，但参数列表不同的函数；

B：方法重写与方法返回值类型无关

C：方法重写时，子类重写的方法是否使用static关键字修饰，应该根据具体需求确定；

D：方法重写时，子类重写的方法的访问权限，不能比父类被重写方法的访问权限低；

答案： D

# 题目5
下面说法正确的是：（）

A：一般开发中，子类应该重写父类所有方法；

B：一般开发中，子类应该重写父类不满足子类需要的方法；

C：一般开发中，子类很少重写父类方法；

D：上面说法都不正确；

答案： B

# 题目6
下面说法正确的是：（）

A：子类实例化时，要先创建父类对象，然后再创建子类对象；

B：子类实例化时，先创建子类对象，再创建父类对象；

C：子类实例化时，先调用子类构造函数进栈，然后再子类构造函数中通过super语句调用父类构造函数，执行完父类构造函数再执行子类构造函数；

D：子类实例化时，先调用父类构造函数进栈，执行完毕再执行子类构造函数；

答案： C

# 题目7
下面说法正确的是：（）

A：因为抽象类不能创建对象，所以抽象类没有构造函数；

B：抽象类就是有抽象方法的类；

C：抽象类中只能书写抽象方法；

D：子类继承抽象父类，应该实现父类中所有抽象函数，否则这个子类也应该是抽象类；

答案： D

# 题目8
A：修饰方法时，abstract关键字不能和final、static关键字一起使用，但可以和private一起使用；

B：非静态成员内部类中可以书写任意成员；

C：final修饰引用类型的变量，变量中保存的引用地址不能改，但是引用指向的对象中的数据可以改；

D：抽象类的构造函数不能是私有的；

答案： C

# 题目9
下面说法正确的是：（）

A：修饰方法时，abstract关键字不能和final、static关键字一起使用，但可以和private一起使用；

B：非静态成员内部类中可以书写任意成员；

C：final修饰引用类型的变量，变量中保存的引用地址不能改，但是引用指向的对象中的数据可以改；

D：抽象类的构造函数不能是私有的；

# 题目10
下面说法正确的是：（）

A：多态就是父类型引用操作子类对象，或者接口类型引用操作实现类对象；

B：多态可以提高程序的复用性和耦合性；

C：多态中父类型引用不能操作子类特有成员，因为运行时发现父类中没有子类的特有成员；

D：多态的好处是不需要使用子类特有成员，降低程序的复杂度；

答案： A

# 题目11
下面说法正确的是：（）

A：Java中的接口使用interface关键字声明，在接口中只能书写抽象函数和使用public	static 	final修饰的成员变量；

B：Java中的抽象类可以继承多个接口；

C：Java中的接口里面没有构造函数；

D：Java中的类可以同时实现多个接口，一个接口也可以继承多个接口，没有任何限制；

答案： C

# 题目12
下面说法正确的是：（）

A：抽象类和接口都一定有抽象方法，不能直接创建对象，需要由子类继承或者实现；

B：抽象类和接口中都没有构造方法，不能直接创建对象；

C：抽象类是用来描述一个继承体系中所有子类的共有属性和行为的；接口更多的用来描述功能的集合，用来定义规则的；

D：接口和抽象类都只能是单一继承；

答案： C

# 题目13
A：抽象类和接口都一定有抽象方法，不能直接创建对象，需要由子类继承或者实现；

B：抽象类和接口中都没有构造方法，不能直接创建对象；

C：抽象类是用来描述一个继承体系中所有子类的共有属性和行为的；接口更多的用来描述功能的集合，用来定义规则的；

D：接口和抽象类都只能是单一继承；

答案： B

# 题目14
下列说法错误的是：（）

A：Java中，一般使用static和final关键字共同修饰的成员变量表示常量；

B：Java中，使用private关键字修饰的成员，只能在本类中使用，不能在其他类中使用；
C：Java中，要想避免一个方法被子类重写，应该使用final关键字修饰；

D：Java中，protected修饰符修饰的成员，可以被不同包中的子类继承；

答案： B

# 题目15
下面说法正确的是：（）

A：static关键字可以修饰类中所有成员；

B：static关键字不能用来修饰构造方法；

C：static关键字不能修饰类；

D：static关键字修饰的方法中可以使用this关键字；

# 题目17
下面说法正确的是：（）

A：static关键字可以修饰类中所有成员；

B：static关键字不能用来修饰构造方法；

C：static关键字不能修饰类；

D：static关键字修饰的方法中可以使用this关键字；
答案： B

# 题目18
以下关于Object类,说法错误的是? （）

A:  任何类都间接或者直接继承Object类

B:  Object是所有类的根类(父类)

C:  任何一个类都可以使用Object类中的方法

D:  Object类中的方法不能被重写

# 题目19
 下面说法错误的是：

A：Object类是Java中最高父类，其它所有类都直接或者间接的继承Object类；

B：Java中，如果一个类没有明确书写继承的类，则默认都继承Object类；

C：Object类型的变量，可以指向Java中任意一个对象；

D：Object类是一个抽象类，所有Java类都具有Object类中定义的方法；

答案： D

# 题目20
下面对于toString()方法和equals()方法描述正确的是? （）

A:  类重写toString()方法是为了打印对象的地址

B:  类重写equals()方法是为了比较对象的地址

C:  类重写toString()方法是打印对象中的属性,重写equals()是比较对象中的属性

D:  类只能重写Object中的toString()方法和equals()方法

答案： C

# 题目21
下面说法错误的是：（）

A：toString方法会返回一个字符串，在使用System.out.println()语句输出对象时就是输出的这个方法返回的数据；

B：String类已经重写了toString和equals方法；

C：一般开发中都需要重写toString方法和equals方法

D：equals方法底层使用的是 == 比较的，所以是用来比较两个对象是否是同一个对象的；
答案： D

# 题目22
观察下列代码.日期格式化为字符串是(时间忽略)?  （）
```angular2html
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

# 题目23
想得到"2018-04-11 22时12分10秒"(时间忽略),模式正确的是?：
```angular2html
public class SimpleDateFormatDemo {

    public static void main(String[] args) throws ParseException {
        //此处代码应填写
        Date date = new Date();
        String s = sdf.format(date);
        System.out.println(s);
    }
}
```

```angular2html
A:  SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

B:  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH时mm分ss秒");

C:  SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH时mm分ss秒");

D:  SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
```

答案：B

# 题目24
 阅读代码,横线位置应填写的内容是? （）
 ```angular2html
public class SimpleDateFormatTest {

    public static void main(String[] args) throws ParseException {
        String str = "1998-01-01";
        SimpleDateFormat sdf = new SimpleDateFormat(_____);
        Date date = sdf.parse(str);
        System.out.println(date);
    }
}
```

A:  "yyyy-MM-dd"

B:  "yyyy年MM月dd"

C:  "yyyy/MM/dd"

D:  "yyyy.MM.dd"



答案： A

# 题目25
下面说法错误的是：（）

A：Java中表示时间的类是util包中的Date类；

B：Date类的对象表示一个时间段；

C：Date类中从时间中获取年月日的方法过时了，开发中应该使用Calendar类的方法实现；

D：Date类中将时间格式化为字符串的方法过时了，开发中应该使用DateFormat或者SimpleDateFormat类；

答案 B

# 题目26
下面说法错误的是：（）

A：Calendar类是日历类，通过getInstance方法获取的对象表示的是当前时间点的日历信息；

B：因为可以方便的自定义格式，所以开发中处理时间和字符串的转换时，一般使用SimpleDateFormat类，而非DateFormat类；

C：基本类型包装类在开发中一般用来将字符串转换为对应的基本类型数据；

D：要将字符串转换为基本类型数据，字符串的字面值必须表示的是这个基本类型数据的一个值，否则运行时就会出现异常；

答案： D

# 题目27
 读代码,控制台输出的结果为? （）
 ```angular2html
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

# 题目28
阅读代码,控制台输出的结果为? （）
```angular2html
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

答案： C

# 题目29
