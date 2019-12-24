package com.ming8;

public abstract class Hero {
    private String name;
    private int hp;
    private int mp;
    private int attack;
    private int defenses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefenses() {
        return defenses;
    }

    public void setDefenses(int defenses) {
        this.defenses = defenses;
    }

    public Hero(String name, int hp, int mp, int attack, int defenses) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.attack = attack;
        this.defenses = defenses;
    }

    public abstract void say();

    public void startAnility(Ability ability){
        int consume = ability.getMpConsume();

    }
}
