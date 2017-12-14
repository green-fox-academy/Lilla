public class Plant {
    private String color;
    private int waterAmount;
    private String type;

    public void setColor(String color) {
        this.color = color;
    }

    public void setWaterAmount(int waterAmount) {
        this.waterAmount = waterAmount;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public int getWaterAmount() {
        return waterAmount;
    }

    public String getType() {
        return type;
    }

    public Plant(String color) {
        this.color = color;
        type = "plant";
        waterAmount = 0;
    }

    public void status() {
        if (waterAmount < 5 && type == "flower") {
            System.out.println("The " + color + type + " need water.");
        } else if (waterAmount > 5 && type == "flower") {
            System.out.println("The " + color + type + " doesn't need water.");
        } else if (waterAmount < 10 && type == "tree") {
            System.out.println("The " + color + type + " need water.");
        } else if (waterAmount > 10 && type == "tree") {
            System.out.println("The " + color + type + " doesn't need water.");
        }
    }
}