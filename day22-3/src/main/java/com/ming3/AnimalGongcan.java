package com.ming3;

public class AnimalGongcan {
    public static Animal getAnimal(int number){
        if(number == 0){
            return new Cat();
        }else if(number == 1){
            return new Dog();
        }else if(number == 2){
            return new Pig();
        }
        return null;
    }
}
