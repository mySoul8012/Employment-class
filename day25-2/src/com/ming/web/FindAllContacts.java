package com.ming.web;

import com.ming.domain.Contact;
import com.ming.service.ContactService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet(name = "FindAllContacts", urlPatterns = "/findAllContacts")
public class FindAllContacts extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置编码
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        // 设置编码
        // 生成servuce层
        ContactService contactService = new ContactService();
        // 获取数据
        List<Contact> contacts = contactService.findByContact();
        // 传递给下一个连接
        req.setAttribute("contacts", contacts);
        // 进行页面跳转
        req.getRequestDispatcher("/WEB-INF/contacts.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
