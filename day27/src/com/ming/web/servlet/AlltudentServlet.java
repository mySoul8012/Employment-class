package com.ming.web.servlet;

import com.ming.domain.Student;
import com.ming.service.StudentService;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet(name = "AllStudentServlet", urlPatterns = "/addStudent")
public class AlltudentServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取请求参数
        Map<String, String[]> map = req.getParameterMap();
        // 获取学生对象
        Student student = new Student();
        try{
            BeanUtils.populate(student, map);

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        // 调用Service
        StudentService studentService = new StudentService();
        // 进行添加
        boolean b = studentService.addStudent(student);
        // 保存到域对象
        req.setAttribute("isOK", b?"添加成功":"添加失败");
        // 进行转发
        req.getRequestDispatcher("/findAllStudents").forward(req, resp);
    }
}
