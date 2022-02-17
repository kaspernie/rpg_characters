package com.github.kaspernie.rpgchars;

import java.util.HashMap;
import java.util.Map;

public abstract class Hero {
    // todo: Hero: private or protected?
    protected String name;
    protected int level;
    protected primaryAttribute basePrimaryAttribute;
    protected HashMap<Slot, Item> equipment;

    // Constructor for creating heroes
    public Hero(String name, primaryAttribute basePrimaryAttribute) {
        this.name = name;
        this.level = 1;
        this.basePrimaryAttribute = basePrimaryAttribute;
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

    public abstract void setEquipment(Slot slot, Item item) throws Exception;

    // Get and set primary attributes
    public primaryAttribute getBasePrimaryAttribute() {
        return basePrimaryAttribute;
    }

    public void setBasePrimaryAttribute(primaryAttribute basePrimaryAttribute) {
        this.basePrimaryAttribute = basePrimaryAttribute;
    }

    // On-the-fly totalPrimaryAttribute calculation
    public primaryAttribute getTotalPrimaryAttribute() {
        //this.totalPrimaryAttribute = basePrimaryAttribute;
        int totalStrength = basePrimaryAttribute.getStrength();
        int totalDexterity = basePrimaryAttribute.getDexterity();
        int totalIntelligence = basePrimaryAttribute.getIntelligence();

        // Items that are not in a WEAPON slot must be armor
        for (Map.Entry<Slot, Item> entry : equipment.entrySet()) {
            if (!entry.getKey().equals(Slot.WEAPON)) {
                totalStrength += entry.getValue().getArmorAttribute().getStrength();
                totalDexterity += entry.getValue().getArmorAttribute().getDexterity();
                totalIntelligence += entry.getValue().getArmorAttribute().getIntelligence();
            }
        }
        return new primaryAttribute(totalStrength, totalDexterity, totalIntelligence);
    }
    
    @Override
    public String toString() {
        return "Hero {"
                + "name: '" + name + '\''
                + ", level: " + level
                + ", Strength: " + getTotalPrimaryAttribute().getStrength()
                + ", Dexterity: " + getTotalPrimaryAttribute().getDexterity()
                + ", Intelligence: " + getTotalPrimaryAttribute().getIntelligence()
                + ",\n      equipment=" + equipment.toString()
                + "\n}";
    }
}
