package com.github.kaspernie.rpgchars;

import java.util.HashMap;

public abstract class Hero {
    // todo: Hero: private or protected?
    protected String name;
    protected int level;
    protected primaryAttribute basePrimaryAttribute;
    protected primaryAttribute totalPrimaryAttribute;
    protected HashMap<Slot, Item> equipment;

    // Constructor for creating heroes
    public Hero(String name, primaryAttribute basePrimaryAttribute) {
        this.name = name;
        this.level = 1;
        this.basePrimaryAttribute = basePrimaryAttribute;
        this.totalPrimaryAttribute = basePrimaryAttribute; // todo: handle initial totalPrimaryAttribute
        this.equipment = new HashMap<Slot, Item>(); // begin with empty equipment
    }

    // Get and set name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Get and set level, level up
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void levelUp() {
        this.level++;
    }

    public HashMap<Slot, Item> getEquipment() {
        return equipment;
    }

    public void setEquipment(HashMap<Slot, Item> equipment) {
        this.equipment = equipment;
    }

    // Get and set primary attributes
    public primaryAttribute getBasePrimaryAttribute() {
        return basePrimaryAttribute;
    }

    public void setBasePrimaryAttribute(primaryAttribute basePrimaryAttribute) {
        this.basePrimaryAttribute = basePrimaryAttribute;
    }

    // todo: handle updated totalPrimaryAttribute and calculation
    public primaryAttribute getTotalPrimaryAttribute() {
        return basePrimaryAttribute;
    }

    public void setTotalPrimaryAttribute(primaryAttribute totalPrimaryAttribute) {
        this.totalPrimaryAttribute = totalPrimaryAttribute;
    }

    @Override
    public String toString() {
        return "Hero {"
                + "name: '" + name + '\''
                + ", level: " + level
                + ", total-Strength: " + getTotalPrimaryAttribute().getStrength()
                + ", total-Dexterity: " + getTotalPrimaryAttribute().getDexterity()
                + ", total-Intelligence: " + getTotalPrimaryAttribute().getIntelligence()
                + ", equipment=" + equipment
                + '}';
    }
}
