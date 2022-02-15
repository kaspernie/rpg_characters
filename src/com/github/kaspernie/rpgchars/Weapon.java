package com.github.kaspernie.rpgchars;

public class Weapon extends Item {
    private weaponType weaponType;
    private int attackSpeed;
    private int damage;

    public Weapon(String name, int requiredLevel, String slot, weaponType weaponType, int attackSpeed, int damage) {
        super(name, requiredLevel, slot);
        this.weaponType = weaponType;
        this.attackSpeed = attackSpeed;
        this.damage = damage;
    }
}
