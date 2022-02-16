package com.github.kaspernie.rpgchars;

public class Rogue extends Hero {
    // rogue begin: 2,6,1
    // rogue levelup: 1,4,1
    // rogue damage increased by 1% for each dexterity point
    static int strength1 = 2, dexterity1 = 6, intelligence1 = 1;
    static int strengthUp = 1, dexterityUp = 4, intelligenceUp = 1;

    public Rogue(String name) {
        super(name, new primaryAttribute(strength1, dexterity1, intelligence1));
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

