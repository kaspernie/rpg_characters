package com.github.kaspernie.rpgchars;

import java.util.HashMap;

public class Warrior extends Hero {
    // warrior begin: 5,2,1
    // warrior levelup: 3,2,1
    // warrior damage increased by 1% for each strength point
    static int strength1 = 5, dexterity1 = 2, intelligence1 = 1;
    static int strengthUp = 3, dexterityUp = 2, intelligenceUp = 1;

    public Warrior(String name) {
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

