package com.duanrui.object_oriented_practise;

public class Hero {
    String name;
    float hp;
    float armor;
    int speed_move;

    void keng(){
        System.out.println(this.name+"坑队友");
    }

    float armor(){
        return armor;
    }

    void addSpeed(int speed){
        speed_move += speed;
    }

    /*
    * 为英雄类Hero设计几个新的方法：
        1. 超神 legendary(),无参数，无返回类型
        2. 获取当前的血量 getHp(), 无参数，有float类型的返回值
        3. 回血 recovery(float blood)， 有参数 float类型参数 blood表示本次恢复的血量，无返回类型
    * */
    void legendary(){
        System.out.println(this.name+"超神了");
    }

    float getHp(){
        return this.hp;
    }

    void recovery(float blood){
        this.hp += blood;
    }
}
