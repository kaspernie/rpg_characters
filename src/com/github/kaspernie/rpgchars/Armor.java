package com.github.kaspernie.rpgchars;

public class Armor extends Item {
    private armorType armorType;
    private primaryAttribute armorAttribute;

    public Armor(String name, int requiredLevel, Slot slot, armorType armorType, primaryAttribute armorAttribute) {
        super(name, requiredLevel, slot);
        this.armorType = armorType;
        this.armorAttribute = armorAttribute;
    }
}
