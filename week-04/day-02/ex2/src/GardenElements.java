import java.util.ArrayList;
import java.util.List;

public class GardenElements {
    List<Plant> gardenElements = new ArrayList<>();
    List<Plant> starvingPlants = new ArrayList<>();

    public void addGardenElements(Plant plants) {
        gardenElements.add(plants);
    }

    public void addStarvingElements() {
        for (Plant currentPlant : gardenElements) {
            if ((currentPlant.getWaterAmount() < 5 && currentPlant.getClass() == Flower.class  )
                    || (currentPlant.getWaterAmount() < 10 && currentPlant.getClass() == Tree.class)) {
                starvingPlants.add(currentPlant);
            }
        }
    }

    public void deleteStarvingElements() {
        for (Plant currentPlant : gardenElements) {
            starvingPlants.remove(currentPlant);
        }
    }

    public void watering(int liter) {
        for (Plant currentPlant : starvingPlants) {
            int currentWatering = liter / starvingPlants.size();
            if (starvingPlants.contains(currentPlant)) {
                if (currentPlant.getClass() == Flower.class) {
                    currentPlant.setWaterAmount(currentPlant.getWaterAmount() + (int) (currentWatering * 0.75));
                } else if (currentPlant.getClass() == Tree.class) {
                    currentPlant.setWaterAmount(currentPlant.getWaterAmount() + (int) (currentWatering * 0.4));
                }
            }
        }
        System.out.println("Watering with " + liter);
    }

    public void status() {
        for (Plant currentPlant : gardenElements) {
            if (currentPlant.getWaterAmount() < 5 && currentPlant.getClass() == Flower.class) {
                System.out.println("The " + currentPlant.getColor() + " " + currentPlant.getClass() + " need water.");
            } else if (currentPlant.getWaterAmount() > 5 && currentPlant.getClass() == Flower.class) {
                System.out.println("The " + currentPlant.getColor() + " " + currentPlant.getClass() + " doesn't need water.");
            } else if ( currentPlant.getWaterAmount() < 10 && currentPlant.getClass() == Tree.class) {
                System.out.println("The " + currentPlant.getColor() + " " + currentPlant.getClass() + " need water.");
            } else if (currentPlant.getWaterAmount() > 10 && currentPlant.getClass() == Tree.class) {
                System.out.println("The " + currentPlant.getColor() + " " + currentPlant.getClass() + " doesn't need water.");
            } else System.out.println("blabla");
        }

    }
}
