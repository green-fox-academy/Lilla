import java.util.ArrayList;
import java.util.List;

public class Carrier {

  private int ammoStorage;
  private int healthPoint;
  private int totalDamage;
  protected static final Flight16 F16 = new Flight16();
  protected static final Flight35 F35 = new Flight35();
  private List<Aircraft> carrier = new ArrayList<>();

  public Carrier(int initialAmmo, int healthPoint) {
    ammoStorage = initialAmmo;
    this.healthPoint = healthPoint;
  }

  public int getAmmoStorage() {
    return ammoStorage;
  }

  public void setAmmoStorage(int ammoStorage) {
    this.ammoStorage = ammoStorage;
  }

  public int getHealthPoint() {
    return healthPoint;
  }

  public void setHealthPoint(int healthPoint) {
    this.healthPoint = healthPoint;
  }

  public int getTotalDamage() {
    return totalDamage;
  }

  public void setTotalDamage(int totalDamage) {
    this.totalDamage = totalDamage;
  }

  public void addAircraft(Aircraft flight, int amount) {
    for (int i = 0; i <= amount ; i++) {
      carrier.add(flight);
    }
  }

  public void fill() {
    while (ammoStorage == 0)
    for (Aircraft currentAircraft : carrier) {
      if (currentAircraft == F35) {
        ammoStorage = -currentAircraft.getMaxAmmo() - currentAircraft.getCurrentAmmo();
      } else {
        ammoStorage = -currentAircraft.getMaxAmmo() - currentAircraft.getCurrentAmmo();
      }
    }
  }

  public void fight(Carrier attacker, Carrier defenser) {
    for (Aircraft currentAircraft : carrier) {
      attacker.setTotalDamage(attacker.getTotalDamage() + currentAircraft.getAllDamage());
      defenser.setTotalDamage(defenser.getTotalDamage() + currentAircraft.getAllDamage());
      attacker.setHealthPoint(attacker.getHealthPoint() - defenser.getTotalDamage());
      defenser.setHealthPoint(defenser.getHealthPoint() - attacker.getTotalDamage());
    }
  }

  public void getStatus() {
    System.out.println("\nHP: " + healthPoint + ", Aircraft count: " + carrier.size() + ", Ammo Storage: "
                        + ammoStorage + ", Total damage: " + totalDamage + "\n"
                        + "Aircrafts:");
    for (Aircraft currentAircraft: carrier) {
      System.out.println(currentAircraft.getStatus());
    }
  }
}


