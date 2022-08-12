package IslandModel.island;

import IslandModel.animal.Animal;
import IslandModel.animal.BaseObject;
import IslandModel.animal.CanMove;
import IslandModel.animal.Direction;
import IslandModel.animal.carnivore.*;
import IslandModel.animal.herbivore.*;
import IslandModel.utils.PropertiesIsland;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

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
                moveAnimalsOnLocation(location);
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
    public void moveAnimalsOnLocation(Location location) {
        Set<String> items = new HashSet<>(location.getItems());
        for (String item : items) {
            if (location.getItemByKey(item) instanceof CanMove) {
                List<Direction> generateDirections = searchingDirectionToMove(location, location.getItemByKey(item));
                move(location, location.getItemByKey(item), generateDirections.get(ThreadLocalRandom.current().nextInt(generateDirections.size())));
            }
        }
    }

    private void move(Location location, BaseObject object, Direction direction) {
        int x = location.getCoordinates().getX();
        int y = location.getCoordinates().getY();
        switch (direction) {
            case UP -> {
                locations[x][y].comeOrAway(object, false);
                locations[x][y - 1].comeOrAway(object, true);
            }
            case DOWN -> {
                locations[x][y].comeOrAway(object, false);
                locations[x][y + 1].comeOrAway(object, true);
            }
            case LEFT -> {
                locations[x][y].comeOrAway(object, false);
                locations[x - 1][y].comeOrAway(object, true);
            }
            case RIGHT -> {
                locations[x][y].comeOrAway(object, false);
                locations[x + 1][y].comeOrAway(object, true);
            }
            case HOLD -> {

            }
        }
        Animal animal = (Animal) object;
        animal.move(direction);
    }
    private List<Direction> searchingDirectionToMove(Location location, BaseObject object) {
        List<Direction> directions = new ArrayList<>();
        directions.add(Direction.HOLD);
        int x = location.getCoordinates().getX();
        int y = location.getCoordinates().getY();
        if (x > 0 && x < PropertiesIsland.getSizeHorizontal()) {
            if (canMoveHere(object, locations[x - 1][y]))
                directions.add(Direction.LEFT);
        }
        if (x >=0 && x < PropertiesIsland.getSizeHorizontal() - 1) {
            if (canMoveHere(object, locations[x + 1][y]))
                directions.add(Direction.RIGHT);
        }
        // система координат перевернута и начинается с левого верхнего угла,
        // так что когда координата y увеличивается - это движение вниз, когда y уменьшается - вверх
        if (y >= 0 && y < PropertiesIsland.getSizeVertical() - 1) {
            if (canMoveHere(object, locations[x][y + 1]))
                directions.add(Direction.DOWN);
        }
        if (y > 0 && y < PropertiesIsland.getSizeVertical()) {
            if (canMoveHere(object, locations[x][y - 1]))
                directions.add(Direction.UP);
        }
        return directions;
    }

    private boolean canMoveHere(BaseObject object, Location location) {
        if (object instanceof Wolf) {
            return location.getCntWolf() < PropertiesIsland.getMaxCntWolf();
        }
        else if (object instanceof Sheep) {
            return location.getCntSheep() < PropertiesIsland.getMaxCntSheep();
        }
        else if (object instanceof Bear) {
            return location.getCntBears() < PropertiesIsland.getMaxCntBear();
        }
        else if (object instanceof Boa) {
            return location.getCntBoas() < PropertiesIsland.getMaxCntBoa();
        }
        else if (object instanceof Boar) {
            return location.getCntBoars() < PropertiesIsland.getMaxCntBoar();
        }
        else if (object instanceof Eagle) {
            return location.getCntEagles() < PropertiesIsland.getMaxCntEagle();
        }
        else if (object instanceof Fox) {
            return location.getCntFoxes() < PropertiesIsland.getMaxCntFox();
        }
        else if (object instanceof Buffalo) {
            return location.getCntBuffaloes() < PropertiesIsland.getMaxCntBuffalo();
        }
        else if (object instanceof Caterpillar) {
            return location.getCntCaterpillars() < PropertiesIsland.getMaxCntCaterpillar();
        }
        else if (object instanceof Deer) {
            return location.getCntDeer() < PropertiesIsland.getMaxCntDeer();
        }
        else if (object instanceof Duck) {
            return location.getCntDucks() < PropertiesIsland.getMaxCntDuck();
        }
        else if (object instanceof Goat) {
            return location.getCntGoats() < PropertiesIsland.getMaxCntGoat();
        }
        else if (object instanceof Horse) {
            return location.getCntHorses() < PropertiesIsland.getMaxCntHorse();
        }
        else if (object instanceof Mouse) {
            return location.getCntMouses() < PropertiesIsland.getMaxCntMouse();
        }
        else if (object instanceof Rabbit) {
            return location.getCntRabbits() < PropertiesIsland.getMaxCntRabbit();
        }
        else {
            return false;
        }
    }
}
