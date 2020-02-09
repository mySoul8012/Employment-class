package com.ming;

import com.sun.nio.sctp.PeerAddressChangeNotification;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "CheckCode01", urlPatterns = "/CheckCode01")
public class CheckCode01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 创建图片
        // 定义宽‘
        int width = 120;
        int height = 40;
        // 创建图片缓存
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_BGR);
        // 创建画笔
        Graphics graphics = bufferedImage.getGraphics();
        // 设置背景色
        graphics.setColor(Color.red);
        // 设置填充
        graphics.fillRect(0, 0, width, height);
        // 绘制边框
        graphics.setColor(Color.white);
        // 绘制边框
        graphics.drawRect(0, 0, width - 1, height - 1);
        // 准备数据
        String data = "ABCDEFGHIGKLMNOQPRSTUVWXYZ1234567890abcdefghigklmnoqprstuvwxyz";
        // 准备随机数据
        Random random = new Random();
        // 验证码
        String code = "";
        // 创建数据
        for(int i = 0; i < 4; i++){
            // 获取数据
            String tmp = data.charAt(random.nextInt(data.length())) + "";
            // 设置字体
            graphics.setFont(new Font("宋体", Font.BOLD, 28));
            graphics.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
            graphics.drawString(tmp, 10 + i * 28, 30);
            // 保存到验证码
            code = code + tmp;
        }
        // 获取session
        HttpSession httpSession = req.getSession();
        // 保存进入验证码
        httpSession.setAttribute("code", code);
        // 获取code值
        Object code1 = httpSession.getAttribute("code");
        // 输出
        System.out.println(code1);
        // 绘制干扰线
        for(int i = 0; i < 6; i++){
            graphics.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
            // 绘制线条
            graphics.drawLine(new Random().nextInt(width), new Random().nextInt(height), new Random().nextInt(width), new Random().nextInt(height));

        }
        // 验证码打印到控制台
        System.out.println(code);
        // 显示在浏览器
        ImageIO.write(bufferedImage, "jpg", resp.getOutputStream());

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
