# 题目1
假定Tester 类有如下test方法：
public int test(int p1, Integer p2){}
以下哪段代码能正确地动态调用一个Tester 对象的test方法？（）
```aidl
A．
Class classType=Tester.class;
Object tester=classType.newInstance();
Method addMethod=classType.getMethod("test",new Class[]{int.class,int.class});
Object result=addMethod.invoke(tester,new Object[]{new Integer(100),new Integer(200)});
B．
Class classType=Tester.class;
Object tester=classType.newInstance();
Method addMethod=classType.getMethod("test",new Class[]{int.class,int.class});
int result=addMethod.invoke(tester,new Object[]{new Integer(100),new Integer(200)});
C．
Class classType=Tester.class;
Object tester=classType.newInstance();
Method addMethod=classType.getMethod("test",new Class[]{int.class,Integer.class});
Object result=addMethod.invoke(tester,new Object[]{new Integer(100),new Integer(200)});
D．
Class classType=Tester.class;
Object tester=classType.newInstance();
Method addMethod=classType.getMethod("test",new Class[]{int.class,Integer.class});
Integer result=addMethod.invoke(tester,new Object[]{new Integer(100),new Integer(200)});
```
答案： C

# 题目2
下列关于通过反射方式获取方法并执行的过程说法错误的是（）

A、通过Class.getMethod(方法名，参数类型列表)的方式获取该类的公开方法

B、通过Class.getDeclaredMethod(方法名，参数类型列表)获取该类的非公开方法

C、通过对象名.方法名(参数列表)的方式调用该方法
D、通过invoke(对象名,参数列表)方法来执行一个方法

答案： C

# 题目3
使用反射获取一个类的成员变量，下列说法正确的是：（）

A、获取一个成员变量，需要知道变量名；

B、只能获取类中的私有成员变量

C、只能获取类中公开的成员变量
D、要获取类中私有成员变量，必须先调用这个类的setAccessible(true)；

答案： A
可以获取类中的私有成员变量，和公开成员变量，要获取类中
的私有成员变量，使用d。。。的某个方法

# 题目4
执行如下代码控制台输出的是(  )
```aidl
package cn.he.day13;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student yang = new Student("yangyang");
        Class<? extends Student> aClass = yang.getClass();
        System.out.println(aClass.getName());
    }
}
```

A:  yqw

B:  Student

C:  cn.he.day13.Student

D:  null

答案： C

# 题目5
下面获取String类的字节码对象正确的是(多选)（  ）

A:  Class c = String.class;

B:  Class c = new String().getClass();

C:  Class c = Class.forName("java.lang.String");

D:  Class c = Class.forName("String");

答案： ABC
D 选项应该导入相关的包

# 题目6
下面说法正确的是(多选)（   ）

A:  Constructor getConstructor() 只能获得public修饰的构造方法，没有对应方法会抛异常

B:  Constructor getConstructor() 只能获得public修饰的构造方法，没有对应方法不会抛异常

C:  Constructor[] getDeclaredConstructors()只能获得public修饰的构造方法，没有对应方法会抛异常

D:  Constructor getDeclaredConstructor()包括private修饰的构造方法造方法，没有对应方法会抛异常

答案： AD

# 题目7
关于 Method的 Object invoke(Object obj, Object... args)方法说法正确的是(多选)()

A:  此方法不可以执行private修饰的方法

B:  此方法可以执行私有方法,但是要先调用void setAccessible(true)

C:  参数一是被执行方法的对象,参数二是方法参数值

D:  参数一是方法名,参数二是方法参数值

答案： BC

# 题目8
关于自定义注解的说法正确的是()

A:  当注解中只有一个属性且名称是value，在使用注解时给value属性赋值不能直接给属性值

B:  如果注解中除了value属性还有其他属性，且至少有一个属性没有默认值，则在使用注解给属性赋值时，value属性名可以省略

C:  如果属性有默认值，则使用注解的时候，这个属性可以不用赋值

D:  属性可以是任意数据类型,和一维数组

答案： C

# 题目9
下面说法正确的是(多选)()

A:  @Target 指明此注解用在哪个位置 可选参数值在枚举类ElemenetType

B:  @Target 指明此注解用在哪个位置 可选参数值在枚举类RetentionPolicy

C:  @Retention 定义该注解的生命周期可选的参数值在枚举类型RetentionPolicy

D:  @Retention 定义该注解的生命周期可选的参数值在枚举类型ElemenetType

答案： AC

# 题目10
请问定义注解的关键字是什么？
@interface

# 题目11
请例举我们使用过的一些注解，以及它们都有什么作用？
@Overrive
重载运算符，用于判断是否已经重载

# 题目12
请问我们学过哪些元注解？它们都有什么作用？
@Target 元注解，规定普通注解使用的目标
@Retension 元注解，修饰普通的注释，规定注解的生命周期

# 题目13
请问“注解”中定义“属性”时可以使用的数据类型都有哪些？
1. 八大基本类型
2. 引用类型只能写String 美剧，其他注解，Class
3. 以上12种的一维数组。

# 题目14
请问在什么情况下，使用“注解的属性”时，可以省略“属性名”？
只有一个的时候。

# 题目15
