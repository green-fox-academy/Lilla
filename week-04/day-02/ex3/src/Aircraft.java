public class Aircraft {
    private int ammo;
    private int baseDamage;
    private int allDamage;
    private String type;


    public Aircraft(String type) {
        this.ammo = 0;
        this.type = type;
        if (type == "F16") {
            this.baseDamage = 30;
        } else {
            this.baseDamage = 50;
        }
    }

    public String getType() {
        return type;
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public int fight(int ammo) {
        allDamage = ammo * baseDamage;
        this.ammo = 0;
        return allDamage;
    }

    public int refill(int numberToFill) {
        int remaining = numberToFill - ammo;
        if (type == "F16") {
            ammo = 8;
        } else {
            ammo = 12;
        }
        return  remaining;
    }


    public void getStatus() {
       System.out.println("Type: " + type + ", Ammo: " + ammo + ", Base Damage: " + baseDamage + ", All Damage: " + allDamage);
    }
}
