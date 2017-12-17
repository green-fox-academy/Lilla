import java.util.ArrayList;

public class Carrier {

    private ArrayList <Aircraft> aircrafts = new ArrayList<>();
    private int ammoStorage;
    private int healthPoint;

    public Carrier(int initialAmmo, int healthPoint) {
        this.ammoStorage = initialAmmo;
        this.healthPoint = healthPoint;
    }


    public void addAircraft(Aircraft type){
        aircrafts.add(type);
    }

    public void fill() {
        for (Aircraft currentAircraft: aircrafts) {
            currentAircraft.setAmmo(currentAircraft.getAmmo() + ammoStorage / aircrafts.size());
        }
    }

    public void fight(Carrier defender, Carrier attacker) {
        defender.healthPoint = defender.healthPoint - attacker.ammoStorage;
    }

    public void getStatus() {
        System.out.println("HP: " + healthPoint + "Aircraftcount: " + aircrafts.size() + "Ammor Storage: " + ammoStorage + "Total damage: " + );
    }
}
