public class Aircraft {
  private int currentAmmo;
  private int maxAmmo;
  private int baseDamage;
  private int allDamage = currentAmmo * baseDamage;
  private String type;

  public Aircraft(int currentAmmo, int maxAmmo, int baseDamage, String type) {
    this.currentAmmo = currentAmmo;
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
    this.type = type;
  }

  public int getCurrentAmmo() {
    return currentAmmo;
  }

  public void setCurrentAmmo(int currentAmmo) {
    this.currentAmmo = currentAmmo;
  }

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }

  public int getAllDamage() {
    return allDamage;
  }

  public void setAllDamage(int allDamage) {
    this.allDamage = allDamage;
  }

  public Aircraft() {
  }

  public int fight() {
    allDamage = baseDamage * currentAmmo;
    currentAmmo = 0;
    return allDamage;
  }

  public int refill(int tank) {
    if (tank > (maxAmmo - currentAmmo)) {
      return tank - (maxAmmo - currentAmmo);
    } else {
      currentAmmo =+ tank;
      return 0;
    }
  }

  public String getType() {
    return type;
  }

  public String getStatus() {
   return "Type: " + getType() + ", Ammo: " + currentAmmo + ", Base Damage: " + baseDamage + ", All Damage: " + allDamage;
  }
}
