# 题目1
以下有关Lambda表达式说法错误的是?  （）

A:  Lambda表达式的可以简化代码书写

B:  Lambda表达式免去了使用匿名内部类的麻烦

C:  Lambda表达式要求接口只能有一个抽象方法

D:  Lambda表达式适用于任何接口

答案： D

Lambda 表达式适用于函数式接口，即只有一个方法的接口

# 题目2
有一个Student类，代码如下
```aidl
public class Student{

    private int age;
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}
```

有一个测试类，代码如下

```aidl
public class Test{

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList();
        list.add(new Student(22));
        list.add(new Student(32));
        list.add(new Student(28));
        list.add(new Student(25));
    }
}
```

对ArrayList<Student>集合中的Student对象按照年龄进行排序，下面代码正确的是?  （）

A:  Collections.sort(list,(Student a,Student b)->{return a.getAge()-b.getAge();});

B:  Collections.sort(list,(Student a,Student b)->return a.getAge()-b.getAge(););

C:  Collections.sort(list,(Student a,Student b)->{return a.age-b.age;});

D:  Collections.sort(list,(Student a,Student b)->{a.getAge()-b.getAge();});

答案： A

# 题目3
使用Lambda表达式创建线程，下面选项错误的是? （）

```aidl
A:  Runnable r=()->{System.out.println("HelloWorld");};   new Thread(r).start();

B:  new Thread(()->System.out.println("HelloWold")).start();

C:  new Thread(()->{System.out.println("HelloWorld");}).start();

D:  Runnable r=()->{System.out.println("HelloWorld");};     r.start();
```

答案： D

# 题目4
有一个数组Integer[] arr={9,1,5,2,3,8,6,7,9};下面选项可以对数组进行降序排列的是? （）

```aidl
A:  Arrays.sort(arr, (Integer a,Integer b)->b-a);

B:  Arrays.sort(arr, (Integer a,Integer b)->a-b);

C:  Arrays.sort(arr, (a,b)->a-b);

D:  Arrays.sort(arr, (a,b)->{return a-b;});
```

答案： A

# 题目5
有一个接口如下
```aidl
public interface Phone {
      void call(String message);
}
```
调用call(String message)方法，以下代码错误的是?  （）
```aidl
A:  Phone p=(message) -> System.out.println(message); p.call("Hello");

B:  Phone p=message -> System.out.println(message);  p.call("Java");

C:  Phone p=message->{return "Hello"}; p.call(message);

D:  Phone p=(message)->{System.out.println(message);}; p.call("HeiMa");
```

答案： C

# 题目6

观察以下代码
```aidl
public interface Animal {
    public abstract void eat(String some);
}

public class Feeder {
    public static void feed(Animal a,String some){
        a.eat(some);
    }
}
```

下面那个选项能输出猫吃鱼

```aidl
A:  Feeder.feed(new Animal("猫吃鱼"));

B:  Feeder.feed(Animal()-->"猫吃鱼");

C:  Feeder.feed((some)->System.out.println("猫吃鱼"));

D:  Feeder.feed(some->System.out.println(some),"猫吃鱼");
```
答案： D

# 题目7
下列说法错误的是 : (   )

A:  Lambda表达式能够延迟执行

B:  使用Lambda表达式作为方法参数，其实就是使用函数式接口作为方法参数

C:   对于非函数式接口作为方法参数, 也可以用Lambda表达式进行参数传递

D:  Lambda表达式可以简化某些特定匿名内部类的写法

答案： C

# 题目8
下列哪种方式的转换是正确的 : (   ）

```aidl
A:  int[] arr = Stream.of("90","80","70","60").map(Integer::parseInt).toArray(Integer[]::new);

B:  Integer[] arr = Stream.of("90","80","70","60").toArray(Integer[]::new);

C:  String[] arr = Stream.of("90","80","70","60").map(Integer::parseInt).toArray(String[]::new);

D:  Integer[] arr = Stream.of("90","80","70","60").map(Integer::parseInt).toArray(Integer[]::new);
```
# 题目9
下列哪种方式的转换是正确的 : (   ）
```aidl
A:  int[] arr = Stream.of("90","80","70","60").map(Integer::parseInt).toArray(Integer[]::new);

B:  Integer[] arr = Stream.of("90","80","70","60").toArray(Integer[]::new);

C:  String[] arr = Stream.of("90","80","70","60").map(Integer::parseInt).toArray(String[]::new);

D:  Integer[] arr = Stream.of("90","80","70","60").map(Integer::parseInt).toArray(Integer[]::new);
```
答案： D

答案A 对于答案A来说，应该使用包装数据类型
答案B 对于答案B来说，应该使用map集合进行选择过滤。
答案C 对于答案C来说，map中应该是String，或者使用filter 

# 题目10
观察下列代码，求最终结果：(   )

```aidl
Stream<String> original = Stream.of("Hello.java", "java编程思想.pdf", "IOS开发快速入门.pdf", "stream.java","小葵花宝典.txt","如何学好java.txt");

Stream<String> result = original.filter(s -> s.contains("java")).skip(1);

System.out.println(result.count());
```

A:  3

B:  4

C:  2

D:  1

答案： A

# 题目11
观察下列代码

```aidl
Integer[] sixNums = {1, 2, 3, 4, 5, 6};

Integer[] evens = Stream.of(sixNums).filter(n -> n%2 == 0).toArray(Integer[]::new);
```

请问，得到数组evens中的结果是什么?  (   )

A:  {1,3,5}

B:  {2,4,6}

C:  {1,2,3}

D:  {3,4,5,6}

答案： B

# 题目12
下列获取流的方式, 错误的是: (   )

```aidl
A:  Map<String, String> map = new HashMap<>(); Stream<String> keyStream = map.keySet().stream();

B:  Map<String, String> map = new HashMap<>(); Stream<String, String> mapStream = map.stream();

C:  Map<String, String> map = new HashMap<>(); Stream<Map.Entry<String, String>> entryStream = map.entrySet().stream();

D:  Map<String, String> map = new HashMap<>(); Stream<String> valueStream = map.values().stream();
```

答案： B
