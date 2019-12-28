package com.ming3;

public class Test {
    public static void main(String[] args){
        Phone p = (message -> System.out.println(message)); p.call("hello");
        Phone p1 = message -> System.out.println(message); p.call("Java");
        //Phone p2 = message -> {return "Hello"}; p.call(message);
        Phone p3 = (message -> {System.out.println(message);});  p.call("HeiMa");

    }
}
