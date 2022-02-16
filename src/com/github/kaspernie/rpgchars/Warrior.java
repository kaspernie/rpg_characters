package com.github.kaspernie.rpgchars;

import java.util.HashMap;

public class Warrior extends Hero {
    // warrior begin: 5,2,1
    // warrior levelup: 3,2,1
    // warrior damage increased by 1% for each strength point
    static int strengthInit = 5, dexterityInit = 2, intelligenceInit = 1;
    static int strengthUp = 3, dexterityUp = 2, intelligenceUp = 1;

    public Warrior(String name) {
        super(name, new primaryAttribute(strengthInit, dexterityInit, intelligenceInit));
    }

    @Override
    public void levelUp() {
        super.levelUp();
        // Simplified upgrade.
        // Rather than retrieving previous attributes and adding upgrade, new values are calculated based on level.
        setBasePrimaryAttribute(new primaryAttribute(
                strengthInit + (level - 1) * strengthUp,
                dexterityInit + (level - 1) * dexterityUp,
                intelligenceInit + (level - 1) * intelligenceUp
        ));
    }

    @Override
    public void setEquipment(Slot slot, Item item) throws Exception {
        // This should throw a custom error if Hero class or level is incompatible with item
        if (false) {
            throw new Exception("oh no");
        }
        this.equipment.put(slot, item);
    }


}

