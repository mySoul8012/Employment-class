package com.ming13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test01 {
    public static void main(String[] args){
        Map<String, Map<String, List<String>>> map = new HashMap<String, Map<String, List<String>>>();
        // 河北省
        // 秦皇岛
        List<String> qinhuangdao = new ArrayList<>();
        qinhuangdao.add("海港区");
        qinhuangdao.add("山海关区");
        qinhuangdao.add("北戴河区");
        qinhuangdao.add("昌黎县");
        List<String> tanshang = new ArrayList<>();
        tanshang.add("路北区");
        tanshang.add("路南区");
        tanshang.add("古治区");
        tanshang.add("开平区");
        List<String> shijiazhuang = new ArrayList<>();
        shijiazhuang.add("石家庄市");
        shijiazhuang.add("长安区");
        shijiazhuang.add("桥东区");
        shijiazhuang.add("桥西区");
        shijiazhuang.add("新华区");
        Map<String, List<String>> map1 = new HashMap<>();
        map1.put("河北省", qinhuangdao);
        map1.put("唐山", tanshang);
        map1.put("石家庄", shijiazhuang);
        Map<String, List<String>> hebeisheng = new HashMap<String, List<String>>();
        hebeisheng.put("秦皇岛市", qinhuangdao);
        hebeisheng.put("唐山市", tanshang);
        hebeisheng.put("石家庄市", shijiazhuang);
        // 河南省
        // 郑州
        List<String> zhenzouqu = new ArrayList<>();
        zhenzouqu.add("中原区");
        zhenzouqu.add("金水区");
        zhenzouqu.add("二七区");
        zhenzouqu.add("管城回族区");
        // 洛阳
        List<String> nuoyan = new ArrayList<>();
        nuoyan.add("西工区");
        nuoyan.add("老城区");
        nuoyan.add("涧西区");
        nuoyan.add("洛龙区");
        // 开封区
        List<String> kaifenqu = new ArrayList<>();
        kaifenqu.add("鼓楼区");
        kaifenqu.add("龙亭区");
        kaifenqu.add("顺河回族区");
        kaifenqu.add("禹王台区");
        Map<String, List<String>> henansheng = new HashMap<String, List<String>>();
        hebeisheng.put("郑州市", zhenzouqu);
        hebeisheng.put("洛阳市", nuoyan);
        hebeisheng.put("开封市", kaifenqu);
        // 加入进入集合中
        map.put("河北省", hebeisheng);
        map.put("河南省", henansheng);
        System.out.println(map);
    }
}
