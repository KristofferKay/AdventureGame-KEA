package items.weapons;

import items.Item;

public abstract class Weapon extends Item {
    private int numberOfUses;
    private int damagePoints;

    public Weapon(String shortName, String longName) {
        super(shortName, longName);
    }

    public Weapon(String shortName, String longName, int numberOfUses) {
        super(shortName, longName);
        this.numberOfUses = numberOfUses;
    }
     public Weapon(String shortName, String longName,int damagePoints){
         super(shortName, longName);
         this.damagePoints =damagePoints;
     }

    public abstract String canUse();

    public abstract String useWeapon();

    public int getNumberOfUses() {
        return numberOfUses;
    }

    public void setNumberOfUses(int numberOfUses) {
        this.numberOfUses = numberOfUses;
    }

    public int getDamagePoints(){
        return damagePoints;
    }
}
