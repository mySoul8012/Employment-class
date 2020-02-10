package com.ming.service;

import com.ming.dao.ContactDao;
import com.ming.domain.Contact;

import java.util.List;

public class ContactService {
    public List<Contact> findByContact(){
        // 创建Dao
        ContactDao contactDao = new ContactDao();
        // 获取List
        List<Contact> list = contactDao.findAllContact();
        // 进行返回
        return list;
    }
}
