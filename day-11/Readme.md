# 题目1
已知在项目的模块itcast下存在一个文件person.txt，里面的内容如下：

​	王五=南京

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
