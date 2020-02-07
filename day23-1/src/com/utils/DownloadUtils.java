package com.utils;

import java.util.Base64;
import java.util.Base64.Encoder;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * 根据浏览器的内核,对下载的文件名称进行处理 火狐浏览器使用base64编码 其他都使用url编码
 */
public class DownloadUtils {
    public static String getName(String agent, String filename) throws UnsupportedEncodingException {
        if (agent.contains("Firefox")) {
            // 火狐浏览器
            Encoder base64Encoder = Base64.getEncoder();
            filename = "=?utf-8?B?" + base64Encoder.encode(filename.getBytes("utf-8")) + "?=";
        } else {
            // 其它浏览器
            filename = URLEncoder.encode(filename, "utf-8");
        }
        return filename;
    }
}