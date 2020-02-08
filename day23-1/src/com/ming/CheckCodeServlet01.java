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
import java.nio.Buffer;
import java.util.Random;

@WebServlet(name = "CheckCodeServlet01", urlPatterns = "/CheckCodeServlet01")
public class CheckCodeServlet01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 创建画布
        int height = 40;
        int width = 120;
        // 创建图片缓冲区
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_BGR);
        // 获得画笔
        Graphics graphics = bufferedImage.getGraphics();
        // 填充背景色
        graphics.setColor(Color.white);
        graphics.fillRect(0, 0, width, height);
        // 生成随机字符
        String randomStr = "ABCDEFGHIGKLMNOPQRSTUVWXYZabcdefghigklmnopqrstuvwxyz1234567890";
        // 创建随机对象
        Random random = new Random();
        // 生成变量，保存验证码
        String code  = "";
        for(int i = 0; i < 4; i++){
            // 设置字体
            graphics.setFont(new Font("宋体", Font.BOLD, 28));
            String str = randomStr.charAt(random.nextInt(randomStr.length())) + "";
            // 绘制字体
            graphics.drawString(str, 10 + i * 28, 30);
            // 新的保存验证码
            code = code + str;
        }
        // 绘制干扰
        for(int i = 0; i < 6; i++){
            // 设置随机颜色
            graphics.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
            graphics.drawLine(random.nextInt(width), random.nextInt(height), random.nextInt(width), random.nextInt(height));
        }
        // 验证码打印
        System.out.println(code);
        // 显示在浏览器中
        ImageIO.write(bufferedImage, "jpg", resp.getOutputStream());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
