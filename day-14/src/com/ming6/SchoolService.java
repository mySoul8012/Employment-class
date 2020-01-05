package com.ming6;

public interface SchoolService {
    String login(String longinName, String password) throws InterruptedException;
    String getAllClazzs();
}
