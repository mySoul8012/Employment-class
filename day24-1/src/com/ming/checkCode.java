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

@WebServlet(name = "checkCode", urlPatterns = "/checkcode")
public class checkCode extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 创建画布
        int width = 120;
        int height = 40;
        // 创建图片缓存
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_BGR);
        // 获得画笔
        Graphics graphics = bufferedImage.getGraphics();
        // 设置画笔颜色
        graphics.setColor(Color.white);
        //  进行填充
        graphics.fillRect(0, 0, width, height);
        // 绘制边框
        // 再次设置颜色
        graphics.setColor(Color.red);
        // 绘制边框
        graphics.drawRect(0, 0, width - 1, height - 1);
        // 准备数据
        String data = "ABCDEFGHIGKLMNOPQRSTUVWXYZabcdefghigklmnoqprestuvwxyz1234567890";
        // 准备随机对象
        Random random = new Random();
        // 声明变量
        String code = "";
        // 准备4个字符
        for(int i = 0; i < 4; i++){
            // 设置字体
            graphics.setFont(new Font("宋体", Font.BOLD, 28));
            // 设置颜色
            graphics.setColor(new Color(new Random().nextInt(255), new Random().nextInt(255), new Random().nextInt(255)));
            // 获取字符
            String res = data.charAt(new Random().nextInt(data.length())) + "";
            // 绘制字符串
            graphics.drawString(res, 10 + i * 28, 30);
            // 保存到验证码
            code = code + res;
        }
            // 绘制干扰线
            for(int i = 0; i < 6; i++){
                graphics.setColor(new Color(new Random().nextInt(255), new Random().nextInt(255), new Random().nextInt(255)));
                // 绘制线条
                graphics.drawLine(new Random(width).nextInt(), new Random(height).nextInt(), new Random(width).nextInt(), new Random(height).nextInt());

            }
            // 验证码打印控制台
            System.out.println(code);
            // 显示在浏览器
            ImageIO.write(bufferedImage, "jpg", resp.getOutputStream());


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
