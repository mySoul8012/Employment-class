package com.ming;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "CheckCodeServlet02", urlPatterns = "/CheckCodeServlet02")
public class CheckCodeServlet02 extends HttpServlet {
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
        graphics.setColor(Color.WHITE);
        // 设置边框
        graphics.setClip(0 , 0, width, height);
        // 设置准备的随机字符
        String str = "ABCDEFGHIGKLMNOQPRSTUVWXYZABCDEFGHIGKLMNOQPRSTUVWXYZ1234567890";
        // 进行循环
        Random random = new Random();
        String code = null;
        for(int i = 0 ; i < 4;i++){
            //设置字体
            graphics.setFont(new Font("宋体", Font.BOLD, 28));
            String tmp = str.charAt(random.nextInt(str.length())) + "";
            graphics.drawString(tmp, 10 + i * 10, 30);
            // 新的字符保存验证码
            code = code + tmp;
        }
        // 设置干扰线
        for(int i = 0; i < 6; i++){
            // 设置随机颜色
            graphics.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
            graphics.drawLine(random.nextInt(width), random.nextInt(height), random.nextInt(width), random.nextInt(height));
        }
        System.out.println(code);
        // 显示在浏览器中
        ImageIO.write(bufferedImage,"jpg", resp.getOutputStream());

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
