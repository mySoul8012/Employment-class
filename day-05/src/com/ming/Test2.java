package com.ming;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test2 {
    public static void main(String[] args){
        Collection<String> collectionList = new ArrayList<>();
        collectionList.add("mingxiao");
        collectionList.add("qqqqq");
        collectionList.add("aaaaaaa");
        collectionList.add("erefegreg");
        Iterator<String> iterator = collectionList.iterator();
        while(iterator.hasNext()){
            String s = iterator.next();
            System.out.println(iterator.next());
        }
    }
}
