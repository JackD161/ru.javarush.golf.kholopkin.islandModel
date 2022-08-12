package IslandModel.island;

import IslandModel.utils.PropertiesIsland;

public class Island {
    private final Location[][] locations = new Location[PropertiesIsland.getSizeHorizontal()][PropertiesIsland.getSizeVertical()];

    public Island() {
        initialize();
    }

    public void initialize(){
        for (int x = 0; x < locations.length; x++) {
            for (int y = 0; y < locations[x].length; y++) {
                locations[x][y] = new Location(x, y);
            }
        }
    }

    public void moveAnimalsOnIsland() {
        for (int x = 0; x < locations.length; x++) {
            for (int y = 0; y < locations[0].length; y++) {
                Location location = locations[x][y];
                location.moveAnimalsOnLocation(this, location);
            }
        }
    }



    public void eatAnimals() {
        for (int x = 0; x < locations.length; x++) {
            for (int y = 0; y < locations[0].length; y++) {
                locations[x][y].eatAnimals();
            }
        }
    }

    public void reproduceAnimals() {
        for (int x = 0; x < locations.length; x++) {
            for (int y = 0; y < locations[0].length; y++) {
                locations[x][y].reproduceAnimals();
            }
        }
    }

    public Location getLocationByCoordinates(int x, int y) {
        return locations[x][y];
    }

    public void print(){
        for (int x = 0; x < locations.length; x++) {
            for (int y = 0; y < locations[x].length; y++) {
                System.out.println(locations[x][y].toString());
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Создали остров и отрисовали остров");
        Island island = new Island();
        island.print();
        System.out.println("подвигали животных и отрисовали остров");
        island.moveAnimalsOnIsland();
        island.print();
        System.out.println("пожрали животные и отрисовали остров");
        island.eatAnimals();
        island.print();
        System.out.println("Животные размножаются и отрисовываем остров");
        island.reproduceAnimals();
        island.print();
    }

}
