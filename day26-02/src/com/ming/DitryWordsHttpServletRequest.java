package com.ming;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.util.List;

public class DitryWordsHttpServletRequest extends HttpServletRequestWrapper {
    private List<String> dicts;

    public DitryWordsHttpServletRequest(HttpServletRequest request, List<String> dicts) {
        super(request);
        this.dicts = dicts;
    }

    @Override
    public String getParameter(String name) {
        // 获取原先的值
        String param = super.getParameter(name);
        // 进行判断
        if(param == null){
            return null;
        }

        // 再次判断
        if(dicts != null && dicts.size() > 0){
            // 遍历 dicts
            for (String dict : dicts) {
                // 进行判断是否存在
                if(param.contains(dict)){
                    // 获取StringBugffer
                    StringBuffer stringBuffer = new StringBuffer();
                    // 进行循环遍历
                    for(int i = 0; i < dict.length(); i++){
                        // 进行判断
                        stringBuffer.append("*");
                    }
                    // 进行字符串替换
                    param = param.replace(param, stringBuffer.toString());
                }
            }

        }
        // 返回
        return param;
    }
}
