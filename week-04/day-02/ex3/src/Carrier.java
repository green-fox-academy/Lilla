import java.util.ArrayList;

public class Carrier {

    private ArrayList <Aircraft> aircrafts = new ArrayList<>();
    private int ammoStorage;
    private int healthPoint;
    private int totalDamage;

    public ArrayList<Aircraft> getAircrafts() {
        return aircrafts;
    }

    public Carrier(int initialAmmo, int healthPoint) {
        this.ammoStorage = initialAmmo;
        this.healthPoint = healthPoint;
    }

    public void addAircraft(Aircraft type){
        aircrafts.add(type);
    }

    public void fill() {
        //todo solve the problem, that ammoStorage can't be less, than 0 and fill with existing volume
        for (Aircraft currentAircraft: aircrafts) {
            if (currentAircraft.getType() == "F35") {
                ammoStorage = ammoStorage - (12 - currentAircraft.getAmmo());
                currentAircraft.setAmmo(12);
            } else {
                ammoStorage = ammoStorage - (8 - currentAircraft.getAmmo());
                currentAircraft.setAmmo(8);
            }
        }
    }

    public void fight(Carrier defender, Carrier attacker) {
        defender.healthPoint = defender.healthPoint - attacker.ammoStorage;
    }

    public void getStatus() {
        System.out.println("\n" + "HP: " + healthPoint + " Aircraft count: " + aircrafts.size() + " Ammo Storage: " + ammoStorage + " Total damage: " + totalDamage
                + "\n"  + " Aircrafts: " + "\n");
    }
}
