package com.github.kaspernie.rpgchars;

public class Mage extends Hero {
    // mage begin: 1,1,8
    // mage levelup: 1,1,5
    // mage damage increased by 1% for each strength point
    static int strength1 = 1, dexterity1 = 1, intelligence1 = 8;
    static int strengthUp = 1, dexterityUp = 1, intelligenceUp = 5;

    public Mage(String name) {
        super(name, 1, new primaryAttribute(strength1, dexterity1, intelligence1));
    }

    @Override
    public void levelUp() {
        super.levelUp();
        // Simplified upgrade.
        // Rather than retrieving previous attributes and adding upgrade, new values are calculated based on level.
        setBasePrimaryAttribute(new primaryAttribute(
                strength1 + (level - 1) * strengthUp,
                dexterity1 + (level - 1) * dexterityUp,
                intelligence1 + (level - 1) * intelligenceUp
        ));
    }
}

