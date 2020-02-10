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
        // 设置相应体和编码
        resp.setContentType("text/html;charset=UTF-8");
        req.setCharacterEncoding("UTF-8");
        // 调用service层获取联系人数据
        ContactService service = new ContactService();
        List<Contact> contacts = service.findAllContacts();
        // 保存到域中
        req.setAttribute("contacts", contacts);
        // 进行请求转发
        req.getRequestDispatcher("/WEB-INF/contacts.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
