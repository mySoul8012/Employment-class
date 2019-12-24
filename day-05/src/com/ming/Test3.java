package com.ming;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test3 {
    public static void main(String[] args){
        Collection<String> collectionList = new ArrayList<>();
        collectionList.add("xiaominge");
        collectionList.add("llleofef");
        collectionList.add("weefregegr");
        collectionList.add("wepfiwfef");
        Iterator<String> iterator = collectionList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
