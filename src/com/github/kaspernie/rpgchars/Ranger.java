package com.github.kaspernie.rpgchars;

public class Ranger extends Hero {
    // ranger begin: 1,7,1
    // ranger levelup: 1,5,1
    // ranger damage increased by 1% for each dexterity point
    static int strength1 = 1, dexterity1 = 7, intelligence1 = 1;
    static int strengthUp = 1, dexterityUp = 5, intelligenceUp = 1;

    public Ranger(String name) {
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

