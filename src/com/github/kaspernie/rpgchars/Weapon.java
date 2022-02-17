package com.github.kaspernie.rpgchars;

public class Weapon extends Item {
    private weaponType weaponType;
    private double attackSpeed;
    private double damage;

    public Weapon(String name, int requiredLevel, weaponType weaponType, double attackSpeed, double damage) {
        super(name, requiredLevel, Slot.WEAPON);
        this.weaponType = weaponType;
        this.attackSpeed = attackSpeed;
        this.damage = damage;
    }

    public weaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(weaponType weaponType) {
        this.weaponType = weaponType;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public double getDamage() {
        return damage;
    }

    public double getWeaponDPS() {
        return getDamage() * getAttackSpeed();
    }

    @Override
    public primaryAttribute getArmorAttribute() {
        return null;
    }

    @Override
    public String toString() {
        return "\n          {Slot: " + getSlot() + ", WeaponType: " + getWeaponType() + ", Name: "
                + getName() + ", Required Level: " + getRequiredLevel() + ", Damage: " + getDamage() + ", Attack Speed: " + getAttackSpeed() +
                ", DPS: " + getWeaponDPS() + "}";
    }
}
