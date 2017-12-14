

public class Garden {
    public static void main(String[] args) {
        Plant pitypang = new Flower("yellow");
        Plant nefelejcs = new Flower("blue");
        Plant citrus = new Tree("orange");
        Plant magnolia = new Tree("purple");

        GardenElements kert = new GardenElements();
        kert.addGardenElements(pitypang);
        kert.addGardenElements(nefelejcs);
        kert.addGardenElements(citrus);
        kert.addGardenElements(magnolia);

        kert.addStarvingElements();
        kert.status();
        kert.watering(40);
        kert.deleteStarvingElements();
        kert.addStarvingElements();
        kert.status();
        kert.watering(70);
        kert.deleteStarvingElements();
        kert.addStarvingElements();
        kert.status();
    }

}
