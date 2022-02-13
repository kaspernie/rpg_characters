package com.github.kaspernie.rpgchars;

public abstract class Hero {
    // todo: Hero: private or protected?
    protected String name;
    protected int level;
    protected primaryAttribute basePrimaryAttribute;
    protected primaryAttribute totalPrimaryAttribute;

    public Hero(String name, int level, primaryAttribute basePrimaryAttribute) {
        this.name = name;
        this.level = level;
        this.basePrimaryAttribute = basePrimaryAttribute;
        this.totalPrimaryAttribute = basePrimaryAttribute; // todo: handle initial totalPrimaryAttribute
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


    // Get and set primary attributes
    public primaryAttribute getBasePrimaryAttribute() {
        return basePrimaryAttribute;
    }

    public void setBasePrimaryAttribute(primaryAttribute basePrimaryAttribute) {
        this.basePrimaryAttribute = basePrimaryAttribute;
    }

    public primaryAttribute getTotalPrimaryAttribute() {
        return totalPrimaryAttribute;
    }

    public void setTotalPrimaryAttribute(primaryAttribute totalPrimaryAttribute) {
        this.totalPrimaryAttribute = totalPrimaryAttribute;
    }

    @Override
    public String toString() {
        return "Hero {"
                + "name: '" + name + '\''
                + ", level: " + level
                + ", base-Strength: " + getBasePrimaryAttribute().getStrength()
                + ", base-Dexterity: " + getBasePrimaryAttribute().getDexterity()
                + ", base-Intelligence: " + getBasePrimaryAttribute().getIntelligence()
                + '}';
    }
}
