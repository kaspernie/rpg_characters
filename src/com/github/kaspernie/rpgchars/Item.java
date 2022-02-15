package com.github.kaspernie.rpgchars;

public abstract class Item {
    protected String name;
    protected int requiredLevel;
    protected String slot;

    public Item(String name, int requiredLevel, String slot) {
        this.name = name;
        this.requiredLevel = requiredLevel;
        this.slot = slot;
    }


    // getters and setters for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // getters and setters requiredLevel
    public int getRequiredLevel() {
        return requiredLevel;
    }
    public void setRequiredLevel(int requiredLevel) {
        this.requiredLevel = requiredLevel;
    }

    // getters and setters for slot
    public String getSlot() {
        return slot;
    }
    public void setSlot(String slot) {
        this.slot = slot;
    }
}
