package com.ming;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "CheckCodeServlet", urlPatterns = "/checkcode")
public class CheckCodeServlet extends HttpServlet {
    private static final long serialVersionUID = 1l;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 创建画布
        int width = 120;
        int height = 40;
        // 创建图片缓冲区
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_BGR);
        // 获取画笔
        Graphics graphics = bufferedImage.getGraphics();
        // 填充背景色
        graphics.setColor(Color.white);
        graphics.fillRect(0, 0, width, height);
        // 绘制边框
        graphics.setColor(Color.red);
        graphics.drawRect(0, 0, width - 1, height - 1);
        // 生成随机字符
        String data = "ABCDEFIGHIJKLMNOPQRSTUVWXYZabcdefghigklmnopqrstuvwxyz1234567890";
        // 准备随机对象
        Random random = new Random();
        // 声明变量，保存验证码
        String code = "";
        // 设置随机字符
        for(int i = 0; i < 4; i ++){
            // 设置字体
            graphics.setFont(new Font("宋体", Font.BOLD, 28));
            String str = data.charAt(random.nextInt(data.length())) + "";
            graphics.drawString(str, 10 + i * 28, 30);
            // 新的字符，保存验证码
            code = code + str;
        }
        // 绘制干扰线
        for(int i = 0; i < 6; i++){
            // 设置随机颜色
            graphics.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
            graphics.drawLine(random.nextInt(width), random.nextInt(height), random.nextInt(width), random.nextInt(height));
        }
        // 验证进行打印
        System.out.println(code);
        // 画布显示在浏览器中
        ImageIO.write(bufferedImage, "jpg", resp.getOutputStream());

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
