# 多表联合查询
```
create table dept(
    id int primary key auto_increment,
    name varchar(20)
)
insert into dept(name) values('开发部'),('市场部'),('财务部');
-- 创建员工表
create table emp(
    id int primary key auto_increment,
    name varchar(10),
    gender char(1), --性别
    salary double, -- 工资
    join_date DATE, -- 入职日期
    dept_id int -- 外键字段
)
```

# 连接查询
```
select * from 左表，右表
```
```angular2html
隐式内连接： select * from 左表，右表  where 条件
显示内连接： select * from 左表 inner join 右表 on 连接条件
```

```angular2html
select * from 左边 left outer join 右表 on 连接条件
```

# 创建用户
```angular2html
create user '用户名'@'主机名' identified by '密码';
```
```angular2html
-- 创建一个在本机才能访问的admin账户，密码设为admin
create user 'admin'@localhost identified by 'admin';
```
```angular2html
-- 授予 admin 账户 mysql1——1 数据库中 student 表的查询权限
grant select on student.student 'admin'@localhost;
```

```angular2html
-- 查看权限
show grants for 'root'@localhost
```

```angular2html
-- 回收权限
revoke select on account from 'mysql1_1'@localhost
```

```angular2html
-- 删除用户
drop user 'root'@'localhost'
```


```angular2html
-- 修改密码
set password for 'root'@'localhost'=password('12345');
set password = password('123456');
```

```angular2html
-- 备份
mysqldump -u root -p student < c:/back.sql
```

```angular2html
-- 还原
mysqldump -u root -p student > c:/back.sql
```


# 题目1
SQL 语句中的条件用以下哪一项来表达 ( )

 A ． THEN

 B ． WHILE

 C ． WHERE

 D ． IF
 答案： C
 
 # 题目2
 SELECT 语句的完整语法较复杂，但至少包括的部分是 ( )
 
  A ．仅 SELECT
 
  B ． SELECT ， FROM
 
  C ． SELECT ， GROUP
 
  D ． SELECT ， INTO
  答案： B
  
  # 题目3
  以下能够删除一列的是 ( )
  
   A ． alter table emp remove addcolumn
  
   B ． alter table emp drop column addcolumn
  
   C ． alter table emp delete column addcolumn
  
   D ． alter table emp delete addcolumn
   
   答案： B
   
   # 题目4
      查找表结构用以下哪一项 ( )
      
       A ． FIND
      
       B ． SELETE
      
       C ． ALTER
      
       D ． DESC
       
       答案： D
# 题目5

       
       


