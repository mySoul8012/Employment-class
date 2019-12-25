# 题目1
观察下列代码
```angular2
HashMap<Phone, String> map = new HashMap<>();
map.put(new Phone("锤子",1799),"top1" );
map.put(new Phone("小米",1999),"top2");
map.put(new Phone("小米",1999),"top3");
```

下面描述错误的是:
A:  如果Phone类正确重写hashCode和equals方法,会存进去三条数据.

B:  如果Phone类正确重写了hashCode和equals方法,会存进去两条数据.

C:  如果Phone类正确重写了hashCode和equals方法,小米手机的热度值会变成top3.

D:  Phone类如果放在值的位置上则不需要重写hashCode和equals方法.

答案: A

# 题目2
下列说法错误的是：（）

A：Collection集合是单列集合，因为保存的数据都是一个一个的；

B：Map集合是双列集合，因为保存的数据都是一对一对的；

C：Map集合也是Collection集合框架的一部分，用来保存有对应关系的一对对的数据；

D：Map集合不属于Collection集合；

答案: C

分为俩大接口，接口为 Map 和 Collection 接口。

Map 和 Collection 集合属于平行

# 题目3
下列说法错误的是:
A：Map集合中键都是唯一的；

B：Map集合中一个键只能对应一个值；

C：Map集合中值不是唯一的，多个键可以对应到一个值；

D：Map集合不允许使用null作为键和值；

答案 : D

Map 集合允许使用 null 做键值

# 题目4
下列说法错误的是：（）

A：一个Map集合可以返回三个集合，分别是键集、值集和键值对集；

B：因为Map集合中键是唯一的，所以键集和键值对集都是不重复的Set集合；

C：因为Map集合中值不是唯一的，所以值集是可以重复的List集合；

D：Map中的键值对也是一类事物，使用接口Map.Entry描述；

# 题目5
下列说法错误的是：（）

A：HashMap中的键使用哈希表保存，所以键的唯一性依赖于键对象的hashCode和equals方法；

B：LinkedHashMap中的键使用哈希表保存，并且使用链表记录添加数据的顺序，所以LinkedHashMap的键能够唯一并且有序；

C：可变参数本质上就是一个数组；一个函数中可变参数最多只能有一个；

D：Hashtable使用哈希表保存键，所以和HashSet一样，键对象一般要重写equals和hashCode方法；如果为null，就默认放在哈希表的0下标位置；

答案: D

Hashtable 不允许使用null做键和值

# 题目6
下面关于Map集合说法错误的是? （）

A:  Map集合存储的是一些键值对数据;

B:  Map集合也称为双列集合;

C:  Map集合的key只能存放引用数据类型的数据;

D:  Map集合的value能存放基本数据类型的数据也能存放引用数据类型的数据;


答案: D

Java 集合只能存放引用数据类型，和包装数据类型，不能存放基本数据类型，int

# 题目7
下面关于Map集合说法正确的是? （）

A:  Map集合包含Collection集合;

B:  Map集合的常用子类有HashMap和LinkedHashMap;

C:  Map集合的key存放的数据是可以重复的;

D:  Map集合的value存放的数据要求不能重复;

答案: B

Collection 集合 和 Map 集合是各自的
Map 集合常用子类有 HashMap 和 LinkedHashMap
Map 集合的key存放的数据不能重复
Map集合的Value存放的数据可以重复，键不能重复




# 题目8
观察下列代码
```angular2
HashMap<String, String> map = new HashMap<>();
map.put("小米", "红色");
map.put("小米", "蓝色");
System.out.println(map);
```
请问，输出的结果是?  （）

A:  对象的地址值

B:  {小米:红色,小米:蓝色}

C:  {小米=红色,小米=蓝色}

D:  {小米=蓝色}

答案: D

# 题目9
观察下列代码
```angular2
HashMap<String, Integer> map = new HashMap<>();
map.put("张三", 18);
map.put("李四", 20);
map.put("张三", 20);
System.out.println(map.get("张三"));
```
请问输出的结果是:
A:  张三:18

B:  20

C:  18

D:  张三:20 李四:20


答案: B

# 题目10
对Map集合遍历可以根据键找值的方法说法正确的是?（）

A:  键找值的方法遍历map是唯一的Map遍历方法.

B:  键找值的方法遍历map,必须用上keySet()方法

C:  键找值的方法遍历map,可以不用get()方法.

D:  键找值的方法遍历map是更为面向对象的方式.

答案: B

使用 keySet方法获取所有的key值

# 题目11
观察下列代码

```angular2
HashMap<String, Integer> map = new HashMap<>();
map.put(null, 0);
Set<String> keySet = map.keySet();

for (String key : keySet) {
    System.out.println(key+":"+map.get(key));
}
```
请问，输出的结果是? （）

A:  null:0

B:  编译报错

C:  运行报错

D:  不报错,也没输出

答案: A

HashMap 可以保存 null tableMap 不能保存null

# 题目12
关于使用根据键值对找键和值对Map集合遍历的方式说法错误的是? （）

A:  Map集合不能直接使用迭代器或增强for遍历.获取所有的键值对对象以后就可以使用了.

B:  Map集合是通过keySet()方法获取所有的键值对对象的.

C:  Map集合通过entrySet()方法获取所有的键值对对象.返回值是Set集合.

D:  根据键值对找键和值遍历方式遍历Map集合，相对根据键找值的方式更为面向对象

答案： B

Map集合可以使用迭代器进行迭代

Map 集合可以通过keySet方法获取所有键值对对象，进行迭代

# 题目13
下列关于HashMap存储自定义类型键值对数据说法错误的是? (  )

A:  Map集合可以存储自定义类型的数据.

B:  Map集合存储自定义类型数据时.自定义类型数据可以放在键或者值的位置.

C:  自定义类型数据放在键上就必须重写该类的hashCode和equals方法.才能保证元素唯一性.

D:  自定义类型数据放在值上就必须重写该类的hashCode和equals方法.才能保证元素唯一性.

答案： D

Map 集合可以保存自定义数据类型
Map 集合可以保存自定义数据类型，自定义数据类型也可以放在键值对上
自定义数据类型，放在键上就必须重写 hashCode 和 equals 方法，保证元素唯一。

Map 集合可以存储自定义数据类型。
Map 集合自定义数据类型可以放在键上或者值上。
必须重写hashCode 和 equals 方法
放在键上必须重写hashcode和equals方法

# 题目14
下面说法错误的是：（）

A：List集合都具有索引，可以根据下标精确的操作某个元素；

B：Set集合没有下标，所以不能根据索引操作具体某个元素；

C：List集合都是有序的，Set集合都是无序的；

D：List集合可以保存重复元素，Set集合不能保存重复元素；

答案：C

List 集合具有索引，可以根据下标操作某个元素。
Set 集合没有下标，不能根据索引操作具体元素。
List 集合有序，LinkedHashSet集合也我set集合，有序
List 集合可以保存重复元素，Set 集合不能保存重复元素

# 题目15
下面说法错误的是：（）

A：ArrayList集合判断容器中是否包含指定元素，需要遍历集合，使用equals方法判断是否相等；

B：HashSet底层使用哈希表保存数据，通过对象的hashCode方法和equals方法保证对象的唯一性；

C：LinkedHashSet底层使用哈希表保存数据，保证数据的唯一性；使用链表结构保证数据的有序性；

D：哈希表只能保存非null数据；

答案 D

A ArrayList 集合判断容器，需要遍历集合，使用equlash方法判断是否相等。
B HashSet 底层使用哈希表，通过hashCode 方法 以及 equals 方法保证对象的唯一性。
C LinkedHashSet 底层使用哈希表保存数据，保证数据唯一性。
D 哈希表，可以保存 null 数据

# 题目16
下面的代码运行结果是()

```angular2
HashSet<String>  set = new HashSet<String>();
set.add("cba");
set.add("abc");
set.add("bac"); 
set.add("cba");  

for (int i = 0; i < set.size(); i++) {
        System.out.println(set.get(i));
    }
}
```
A:  abc--abc--bac--cba

B:  abc--bac--cba

C:  编译出错

D:  abc

答案: C

set 集合不能使用 get 方法获取

# 题目 17

下列有关哈希表说法正确的是？ （）

A:  jdk8后哈希表存储采用数组+链表+红黑树实现

B:  哈希表存储采用链表+红黑树实现

C:  哈希表存储采用栈+红黑树实现

D:  哈希表存储采用队列+红黑树实现

答案: A

jdk8以后哈希表，采用数组+链表+红黑树实现。

# 题目18
下面关于哈希表特点描述错误的是？（）

A:  在jdk8之后,当链表长度超过阈值（8）时，将链表转换为红黑树

B:  同一hash值的元素都存储在一个链表里

C:  jdk8后哈希表存储采用数组+链表+红黑树实现

D:  哈希表查询数据的效率较慢

答案： D

哈希表由于使用某些算法，查询数据的效率快

# 题目19
观察下列代码

```angular2
HashSet<Student> hs = new HashSet<Student>();

Student s1 = new Student("张三", 18);
Student s2 = new Student("李四", 18);
Student s3 = new Student("张三", 20);
Student s4 = new Student("李四", 18);

hs.add(s1);
hs.add(s2);
hs.add(s3);
hs.add(s4);

for (Student s : hs) {
    System.out.println(s.getName() + "---" + s.getAge());
}
```

Student类中自动生成了hashCode()和equals()方法，输出结果是？ （）

A:  李四---18，张三---20

B:  李四---18，张三---20，张三---18

C:  李四---18，张三---18，李四---18，张三---20

D:  李四---18，张三---18

答案： B

HashSet 集合具有去重作用，所以输出的结果为
A:  李四---18，张三---20

B:  李四---18，张三---20，张三---18

C:  李四---18，张三---18，李四---18，张三---20

D:  李四---18，张三---18

# 题目20
```angular2
HashSet<User>  set = new HashSet<User>();
set.add(new User("杰克", 18));
set.add(new User("肉丝", 17));
set.add(new User("杰克", 19));
set.add(new User("肉丝", 16));

int sum=0;
for (User u : set) {
   sum+=u.getAge();
}
System.out.println(sum/set.size());
……
```
User类中自动生成了hashCode()和equals()方法，输出结果是？（）

A:  16

B:  17

C:  18

D:  19

答案 B

计算平均值为 17

# 题目21
观察下列代码
```angular2
ArrayList<Student> arr = new ArrayList<Student>();
Student s1 = new Student("张三", 16);
Student s2 = new Student("李四", 13);
Student s3 = new Student("王五", 29);
arr.add(s1);
arr.add(s2);
arr.add(s3);

MyComparator my = new MyComparator();
Collections.sort(arr, my);

for (Student s : arr) {
    System.out.println(s.getName());
}
```

和

```angular2
public class MyComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s2.getAge() - s1.getAge();   // 倒序
    }
}
```

标准的Student类也给出，请问第一个代码的输出结果是();

A:  张三，李四，王五

B:  王五，李四，张三

C:  王五，张三，李四

D:  李四，王五，张三

答案: C

# 题目22
一个方法的形参中是否可以定义两个可变参数，它们数据类型不同？例如：
```
		public static void show(String ... arr1,int[] arr2){
		}

```
一个方法中的形参不可以定义两个可变参数。

# 题目23
一个方法的形参中是否可以同时定义普通参数和可变参数？例如：
```
		public static void show(String str,int[] arr){
		}
```

可以同时定义普通参数和可变参数

# 题目24
以下定义是否正确
```angular2
public static void show(int[] arr , String str){
		}
```
以下定义正确





