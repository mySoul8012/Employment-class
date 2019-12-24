package com.ming11;

public class Test {
    public static void main(String[] args){
        Animal dog = new Dog();
        Animal cat = new Cat();
        // 进行转型
        if(dog instanceof Dog){
            ((Dog) dog).catchMouse();
        }

        if(cat instanceof Cat){
            ((Cat)cat).catchMouse();
        }
    }
}
