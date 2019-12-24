package com.ming8;

public class HouYi extends Hero {
    public HouYi(String name, int hp, int mp, int attack, int defenses) {
        super(name, hp, mp, attack, defenses);
    }

    @Override
    public void say(){
        System.out.println(this.getName() + "说：周日 被我射熄火了，所以今天是周一");
    }

    public void startFirstAbility(){

    }

}
