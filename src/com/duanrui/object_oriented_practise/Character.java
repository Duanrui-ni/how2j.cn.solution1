package com.duanrui.object_oriented_practise;

import com.sun.org.apache.bcel.internal.generic.NEW;
import java.util.Scanner;
import java.time.Year;

public class Character {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Hero garen = new Hero();
        garen.name = "盖伦";
        garen.hp = 616f;
        garen.armor = 27f;
        garen.speed_move = 350;
        garen.addSpeed(50);
        garen.keng();

        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 383;
        teemo.armor = 14;
        teemo.speed_move = 330;
        System.out.println(teemo.name +"血量增加多少： ");
        int addBlood = scan.nextInt();
        teemo.recovery(addBlood);
        teemo.legendary();


        Item bloodBottle = new Item();
        bloodBottle.name = "血瓶";
        bloodBottle.price = 50;

        Item strawSandals = new Item();
        strawSandals.name = "草鞋";
        strawSandals.price = 300;

        Item yataghan = new Item();
        yataghan.name = "长剑";
        yataghan.price = 350;

        Laptop legionLaptop = new Laptop();
        legionLaptop.brand = "lenovo";
        legionLaptop.price = 6000;
        legionLaptop.length = 30f;
        legionLaptop.weight = 50f;

        System.out.println(teemo.name +"的血量为 "+ teemo.getHp());
        System.out.println("盖伦血量为 "+ garen.hp+" 盖伦护甲为 "+garen.armor+" 盖伦移动速度为 "+garen.speed_move);
        System.out.println("草鞋价格为 "+ strawSandals.price);
    }
}
