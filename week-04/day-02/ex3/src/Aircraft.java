public class Aircraft {
    private int ammo;
    private int baseDamage;
    private int allDamage;
    private String type;

    public Aircraft() {
        ammo = 0;
    }

    public Aircraft(int ammo, int baseDamage, String type) {
        this.ammo = ammo;
        this.baseDamage = baseDamage;
        this.type = type;
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

    public void refill() {

    }


    public void getStatus() {
        System.out.println("Type: " + type + ", Ammo: " + ammo + ", Base Damage: " + baseDamage + ", All Damage: " + allDamage);
    }
}
