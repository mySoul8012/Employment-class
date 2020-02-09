package com.ming;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "AddProductToCartSewrvlet", urlPatterns = "/addproductToCartServlet")
public class AddProductToCartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置相应体
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        // 从请求中获取参数
        String name = req.getParameter("name");
        // 商品添加到session
        HttpSession session = req.getSession();
        // 从session中取出商品
        Object names = session.getAttribute("names");
        // 进行判断
        if(names == null){
            List<String> products = new ArrayList<>();
            // 进添加
            products.add(name);
            session.setAttribute("names", products);
        }else{
            List<String> products = (List<String>)names;
            // 进行添加商品
            products.add(name);
            session.setAttribute("names", products);
        }
        resp.getWriter().println("商品" + name + "添加成功..");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
