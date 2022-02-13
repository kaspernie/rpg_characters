package com.github.kaspernie.rpgchars;

public class Main {

    public static void main(String[] args) {
        // test new warrior
        Warrior warrior = new Warrior("Arnold");
        System.out.println(warrior);
        // test level-up warrior
        warrior.levelUp();
        System.out.println(warrior);
        // test level-up warrior again
        warrior.levelUp();
        System.out.println(warrior);


        Ranger ranger = new Ranger("Lee");
        System.out.println(ranger);
        // test level-up ranger
        ranger.levelUp();
        System.out.println(ranger);


        Rogue rogue = new Rogue("Jason");
        System.out.println(rogue);
        // test level-up rogue
        rogue.levelUp();
        System.out.println(rogue);


        Mage mage = new Mage("Dangalf");
        System.out.println(mage);
        // test level-up Mage
        mage.levelUp();
        System.out.println(mage);

    }
}
