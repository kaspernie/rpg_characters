package com.github.kaspernie.rpgchars;

public class primaryAttribute {
    // todo: primaryAttribute: private or protected?
    private int strength;
    private int dexterity;
    private int intelligence;

    // Constructor for creating attributes
    public primaryAttribute(int strength, int dexterity, int intelligence) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
    }

    // Get and set strength
    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }

    // Get and set dexterity
    public int getDexterity() {
        return dexterity;
    }
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    // Get and set intelligence
    public int getIntelligence() {
        return intelligence;
    }
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
}
