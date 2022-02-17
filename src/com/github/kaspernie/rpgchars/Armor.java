package com.github.kaspernie.rpgchars;

public class Armor extends Item {
    private armorType armorType;
    private primaryAttribute armorAttribute;

    public Armor(String name, int requiredLevel, Slot slot, armorType armorType, primaryAttribute armorAttribute) {
        super(name, requiredLevel, slot);
        this.armorType = armorType;
        this.armorAttribute = armorAttribute;
    }

    public armorType getArmorType() {
        return armorType;
    }

    public void setArmorType(armorType armorType) {
        this.armorType = armorType;
    }

    @Override
    public primaryAttribute getArmorAttribute() {
        return armorAttribute;
    }

    @Override
    public String toString() {
        return "\n          {Slot: " + getSlot() + ", armorType: " + getArmorType() + ", Name: "
                + getName() + ", Required Level: " + getRequiredLevel() + "} ";
    }
}
