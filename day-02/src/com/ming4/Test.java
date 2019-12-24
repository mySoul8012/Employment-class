package com.ming4;

public class Test {
    public static void main(String[] args){
        Animal dog = new Dog();
        dog.eat();
        dog.show();
        Animal.demo();
        System.out.println(Animal.AGE);
    }
}
