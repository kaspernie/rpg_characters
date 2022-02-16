package com.github.kaspernie.rpgchars;

public class Ranger extends Hero {
    // ranger begin: 1,7,1
    // ranger levelup: 1,5,1
    // ranger damage increased by 1% for each dexterity point
    static int strengthInit = 1, dexterityInit = 7, intelligenceInit = 1;
    static int strengthUp = 1, dexterityUp = 5, intelligenceUp = 1;

    public Ranger(String name) {
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


