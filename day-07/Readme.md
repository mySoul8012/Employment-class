# 题目1
观察以下代码
```aidl
try{
    String s = "hello";
    String sub = s.substring(0);
    System.out.println(sub);
    s = null;
}catch(NullPointerException e){
    System.out.println("空指针异常");
}
```

以上程序的运行结果是:   (  )

A:  编译会出现错误.

B:  运行结果是控制台输出 "hello".

C:  运行结果是控制台输出 "空指针异常".

D:  运行结果是控制台输出然后输出空指针异常

答案： B

# 题目2
观察以下代码
```aidl
try{
    int[] arr = new int[10];
    System.out.println(arr[10]);
    arr = null;
    System.out.println(arr[0]);
}catch(ArrayIndexOutOfBoundsException e2){
    System.out.println("数组角标越界");
}catch(NullPointerException e){
    System.out.println("空指针异常");
}
```

以上代码运行,控制台会输出什么? (  )

A:  输出 "数组角标越界".

B:   输出 "空指针异常".

C:  输出 "数组角标越界" 和 "空指针异常".

D:   代码编译报错

答案: A

# 题目3
观察以下代码:

```aidl
public static void main(String[] args){
    int[] arr = null;
    printArr(arr);
}

public static void printArr(int[] arr) throws NullPointerException{
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
}
```

运行以上程序,结果是:(   )

A:  编译报错，因为printArr方法声明了异常，在方法调用时必须做异常处理。

B:  编译报错，因为不能将空值null作为参数传递给printArr方法。

C:  运行报错，调用printArr方法时没有异常处理，虚拟机捕获空指针异常后，会报出异常信息并结束运行。

D:  代码正常执行，没有错误，也没有输出数据，因为数组中没有元素。

答案: C

# 题目4
对于以下代码，说法正确的是: (   )

```aidl
public static void main(String[] args) throw ParseException {
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    String s1 = "1989-12-11";
    Date date = format.parse(s1);
}
```

A:   编译错误,第1行,throw 不能用到方法声明上,应该改成throws

B:  运行错误,因为格式化的格式与字符串的格式不匹配

C:  运行没有问题

D:   编译错误第行应该去掉

答案: A

# 题目5
以下关于自定义异常类错误的是: (   )

A:  开发中我们可以根据自己的业务逻辑需要,自定义不同的异常类

B:  java提供的异常类不能完全满足开发的需求,所以要自定义异常类

C:  自定义异常类,通常要调用父类有一个参数的构造函数,因为是为了初始化异常信息

D:  自定义异常类跟提供的异常类没有任何关系

答案: D

# 题目6
观察以下代码

```aidl
public class MyException extends Exception{
    public MyException(){
    }

    public MyException(String message){
        super(message);    
    }
}
```

以下描述正确的是:(   )

A:  如果某个方法抛出了这个异常,那么在使用这个方法的时候必须try-catch处理

B:  如果某个方法抛出了这个异常,那么在使用这个方法的时候必须throws处理

C:  如果某个方法抛出了这个异常,那么在使用这个方法的时候可以不用处理

D:  如果某个方法抛出了这个异常我们可以用方式或者方式处理

答案: D

# 题目7
观察以下代码

```aidl
public class WeightOutOfBoundsException extends Exception{
    public WeightOutOfBoundsException(){
    }
    public WeightOutOfBoundsException(String message){
        super(message);    

    }
}
```
```aidl
public class Person{

    private int weight;
    public Person(int weight)throws WeightOutOfBoundsException{
        if(weight < 0 || weight > 300){
            throw new WeightOutOfBoundsException("体重不符合要求");
        }
        this.weight = weight;
    }
}
```
观察以上代码,如果创建Person对象,下列哪种处理是正确的:(   )

A:  直接 Person person = new Person();

B:  直接 Person person = new Person(70);

C:  只能将 Person person = new Person(70); 只能用 try-catch语句处理一下才可以

D:  可以在创建对象的方法上用关键字将这个异常声明出来

答案: D

# 题目8
以下关于并行和并发说法错误的是:(   )

A:  并行表示同时在运行

B:  并发表示交替在运行

C:  java程序是基于并发的

D:  java程序是基于并行的

答案: D

# 题目9
以下哪种现象是在描述并发的: (   )

A:  火车上大家排队使用一个卫生间

B:  电影院里所有人同时看一个电影

C:  课堂上老师同时给每个学生讲课

D:  以上说法都正确

答案: A

# 题目10
观察以下代码

```aidl
    public static void main(String[] args){
        Thread t = new Thread(){
            public void run(){
                System.out.println("我爱java")；
            }
        };
        ___________________________;
    }
```
请在横线处填入适当代码,使线程开启并运行:(   )

A:  t.run()

B:  t.start()

C:  t.run() 或者 t.start()都行

D:  以上说法都不正确

答案: B

# 题目11
下面关于如何开启线程说法错误的是: (   )

A:  可以使用线程对象调用run()方法开启线程;

B:  只能通过线程对象或者其子类对象,调用start()方法才能开启线程

C:  线程对象调用start()方法,jvm会帮我们开启一条线程,并且帮我们调用线程的run()方法;

D:  创建了线程对象并不代表该线程就开始运行了

答案 : A

# 题目12
下列说法错误的是：（）

A：Java程序，至少有两个线程；一个是垃圾回收线程，一个是执行main函数的线程；

B：所有程序中，都至少存在一个主线程；

C：多线程可以让程序同时执行多个任务，所以一个程序中线程越多越好；

D：多线程只是因为CPU执行速度非常快，可以再不同的任务之间迅速切换；并非同一时间点上执行多个任务；

答案: C

# 题目13
下列说法错误的是：

A：Java中创建一个线程可以通过继承Runnable接口的方式；

B：Java中创建一个线程可以通过继承Thread类的方式；

C：Java中启动一个线程是调用start方法；

D：Java中线程任务应该放在run方法中；


答案: A

# 题目14
下列说法错误的是：（）

A：一个Thread类的子类的对象创建后，就启动了一个新的线程；

B：当一个线程对象调用start函数时，才启动一个新的线程；

C：线程启动后，不会立即执行，而是进入等待状态，等待获取CPU的执行权；

D：线程运行时，如果的执行权被其他线程抢走，这个线程就会进入等待状态，和其他线程一起抢的执行权；

答案: A


