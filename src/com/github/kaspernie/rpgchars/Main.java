package com.github.kaspernie.rpgchars;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws Exception {
        // test new warrior
        Warrior warrior = new Warrior("Arnold Warrior");
        System.out.println(warrior);
        // test level-up warrior
        warrior.levelUp();
        System.out.println(warrior);
        // test level-up warrior again
        warrior.levelUp();
        System.out.println(warrior);
        warrior.levelUp();
        System.out.println(warrior);
        // test equip weapon
        Weapon mySword = new Weapon("Needle", 1, weaponType.SWORD, 0.9, 5.0);
        warrior.setEquipment(Slot.WEAPON, mySword);
        System.out.println(warrior);
        // test equip armor
        Armor myMail = new Armor("Shiny mail", 1, Slot.HEAD, armorType.MAIL, new primaryAttribute(1, -1, 0));
        warrior.setEquipment(Slot.HEAD, myMail);
        System.out.println(warrior);
        // test equip more armor
        Armor myPlate = new Armor("Heavy plate", 1, Slot.BODY, armorType.PLATE, new primaryAttribute(10, -2, 0));
        warrior.setEquipment(Slot.BODY, myPlate);
        System.out.println(warrior);
        // test equip another weapon
        Weapon myAxe = new Weapon("Tomahawk", 1, weaponType.AXE, 2, 2.0);
        warrior.setEquipment(Slot.WEAPON, myAxe);
        System.out.println(warrior);



/*
        Ranger ranger = new Ranger("Cordell W. T. Ranger");
        System.out.println(ranger);
        // test level-up ranger
        ranger.levelUp();
        System.out.println(ranger);


        Rogue rogue = new Rogue("Jason Rogue");
        System.out.println(rogue);
        // test level-up rogue
        rogue.levelUp();
        System.out.println(rogue);


        Mage mage = new Mage("Merlin Mage");
        System.out.println(mage);
        // test level-up Mage
        mage.levelUp();
        System.out.println(mage);
*/
    }
}
