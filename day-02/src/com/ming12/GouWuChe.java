package com.ming12;

import java.util.ArrayList;
import java.util.List;

public class GouWuChe {
    private List<Goods> arrayList;

    public GouWuChe() {
        this.arrayList = new ArrayList<Goods>();
    }

    // 添加商品
    public boolean add(Goods goods){
        return arrayList.add(goods);
    }

    // 移除商品
    public boolean remove(Goods goods){
        return arrayList.remove(goods);
    }

    // 计算总价
    public int sum(){
        int sum = 0;
        // 遍历计算总价
        for(int i = 0; i < arrayList.size(); i++){
            sum += Integer.parseInt(arrayList.get(i).getPrice());
        }
        // 返回总价
        return sum;
    }
}
