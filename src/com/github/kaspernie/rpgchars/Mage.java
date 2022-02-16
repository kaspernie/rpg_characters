package com.github.kaspernie.rpgchars;


public class Mage extends Hero {
    // mage begin: 1,1,8
    // mage levelup: 1,1,5
    // mage damage increased by 1% for each strength point
    static int strengthInit = 1, dexterityInit = 1, intelligenceInit = 8;
    static int strengthUp = 1, dexterityUp = 1, intelligenceUp = 5;

    public Mage(String name) {
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


