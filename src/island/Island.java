package island;

import animals.Animal;
import animals.Direction;
import animals.carnivores.Wolf;
import animals.herbivorous.Sheep;
import utils.PropertiesIsland;
import utils.UniversalRandomizer;

public class Island {

    PropertiesIsland propertiesIsland = new PropertiesIsland();
    Location[][] locations = new Location[propertiesIsland.getSizeHorizontal()][propertiesIsland.getSizeVertical()];

    public Island() {
        initialize();
    }

    public void initialize(){
        for (int x = 0; x < locations.length; x++) {
            for (int y = 0; y < locations[x].length; y++) {
                Location location = new Location(x, y);
                location.initWolf(propertiesIsland.getMaxCntWolf());
                location.initSheep(propertiesIsland.getMaxCntSheep());
                location.initPlants(propertiesIsland.getCntPlants());
                locations[x][y] = location;
            }
        }
    }

    public void moveAnimalsOnIsland() {
        for (int x = 0; x < locations.length; x++) {
            for (int y = 0; y < locations[0].length; y++) {
                moveAnimalsOnLocation(locations[x][y]);
            }
        }
    }

    public void moveAnimalsOnLocation(Location currentLocation) {
        for (Animal animal : currentLocation.getAllAnimals()) {
            Direction[] generateDirections = searchingDirectionToMove(animal);
            move(animal, generateDirections[UniversalRandomizer.getRandomInteger(generateDirections.length)]);
        }
    }

    private void move(Animal animal, Direction direction) {
        int[] coordinates = animal.getCoordinates();
        int x = coordinates[0];
        int y = coordinates[1];
        switch (direction) {
            case UP -> {
                locations[x][y].away(animal);
                locations[x][y - 1].come(animal);
                animal.move(Direction.UP);
            }
            case DOWN -> {
                locations[x][y].away(animal);
                locations[x][y + 1].come(animal);
                animal.move(Direction.DOWN);
            }
            case LEFT -> {
                locations[x][y].away(animal);
                locations[x - 1][y].come(animal);
                animal.move(Direction.LEFT);
            }
            case RIGHT -> {
                locations[x][y].away(animal);
                locations[x + 1][y].come(animal);
                animal.move(Direction.RIGHT);
            }
            case HOLD -> {

            }
        }
    }

    private Direction[] searchingDirectionToMove(Animal animal) {
        Direction[] directions = new Direction[]{Direction.HOLD, Direction.HOLD, Direction.HOLD, Direction.HOLD, Direction.HOLD};
        int[] coordinates = animal.getCoordinates();
        int x = coordinates[0];
        int y = coordinates[1];
        if (x > 0 && x <= locations.length - 1) {
            if (canMoveHere(animal, locations[x - 1][y]))
                directions[0] = Direction.LEFT;
        }
        if (x < locations.length - 1 && x >= 0) {
            if (canMoveHere(animal, locations[x + 1][y]))
                directions[1] = Direction.RIGHT;
        }
        // система координат перевернута и начинается с левого верхнего угла,
        // так что когда координата y увеличивается - это движение вниз, когда y уменьшается - вверх
        if (y > 0 && y <= locations[0].length - 2) {
            if (canMoveHere(animal, locations[x][y + 1]))
                directions[2] = Direction.DOWN;
        }
        if (y <= locations[0].length - 1 && y > 0) {
            if (canMoveHere(animal, locations[x][y - 1]))
                directions[3] = Direction.UP;
        }

        return directions;
    }

    private boolean canMoveHere(Animal animal, Location location) {
        if (animal instanceof Wolf) {
            return location.getCntWolf() < propertiesIsland.getMaxCntWolf();
        }
        else if (animal instanceof Sheep) {
            return location.getCntSheep() < propertiesIsland.getMaxCntSheep();
        }
        else {
            return false;
        }
    }

    public void print(){
        for (int x = 0; x < locations.length; x++) {
            for (int y = 0; y < locations[x].length; y++) {
                System.out.println(locations[x][y].toString());
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Island island = new Island();
        island.print();
        island.moveAnimalsOnIsland();
        island.print();
//        for (int i = 0; i < 5; i++) {
//            island.print();
//            island.moveAnimalsOnIsland();
//        }
    }

}
