package com.ming.dao;

import com.ming.domain.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactDao {
    public List<Contact> findAllContact(){
        List<Contact> list = new ArrayList<>();
        // 进行添加
        list.add(new Contact("1","张三","男","18","北京海淀","111111@qq.com"));
        list.add(new Contact("2","李四","女","19","北京顺义","123123@qq.com"));
        list.add(new Contact("3","王五","女","20","北京东城","321321@qq.com"));
        list.add(new Contact("4","赵六","男","21","上海沙滩","456456@qq.com"));
        list.add(new Contact("5","前妻","女","15","广东东莞","654654@qq.com"));
        list.add(new Contact("6","王八","男","100","湖北武汉","789789@qq.com"));
        list.add(new Contact("7","老酒","妖","200","福建厦门","987987@qq.com"));
        list.add(new Contact("8","老八","女","10","xxxx","444444@qq.com"));
        return list;
    }
}
