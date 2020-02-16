package com.ming.web.servlet;

import com.ming.domain.Student;
import com.ming.service.StudentService;
import com.ming.util.DataUtil;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

@WebServlet(name = "AddStudent", urlPatterns = "/AddStudent")
public class AddStudent extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取参数
        Map<String, String[]> map = req.getParameterMap();
        // 封装到对象
        Student student = new Student();
        // 进行封装
        try {
            BeanUtils.populate(student, map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        // 创建service
        StudentService studentService = new StudentService();
        // 进行添加
        boolean tmp = studentService.addStudent(student);
        req.setAttribute("isOk", tmp?"添加成功":"添加失败");
        // 进行跳转
        req.getRequestDispatcher("/WEB-INF/result.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
