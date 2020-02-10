package com.ming.service;

import com.ming.dao.ContactDao;
import com.ming.domain.Contact;

import java.util.List;

public class ContactService {
    // 查询所有联系人方法
    public List<Contact> findAllContacts(){
        // 调用Dao层，从dao层获取数据
        ContactDao contactDao = new ContactDao();
        //获取数据
        List<Contact> contacts = contactDao.findAllContacts();
        // 进行返回
        return contacts;
    }
}
