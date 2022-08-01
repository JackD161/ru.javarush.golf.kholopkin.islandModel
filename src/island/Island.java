package island;

import animals.Animal;
import animals.Direction;
import animals.carnivores.*;
import animals.herbivorous.*;
import utils.PropertiesIsland;
import utils.UniversalRandomizer;
import java.util.ArrayList;
import java.util.List;

public class Island {
    Location[][] locations = new Location[PropertiesIsland.getSizeHorizontal()][PropertiesIsland.getSizeVertical()];

    public Island() {
        initialize();
    }

    public void initialize(){
        for (int x = 0; x < locations.length; x++) {
            for (int y = 0; y < locations[x].length; y++) {
                Location location = new Location(x, y);
                location.initWolf(PropertiesIsland.getMaxCntWolf());
                location.initSheep(PropertiesIsland.getMaxCntSheep());
                location.initBears(PropertiesIsland.getMaxCntBear());
                location.initBoa(PropertiesIsland.getMaxCntBoa());
                location.initBoars(PropertiesIsland.getMaxCntBoar());
                location.initEagles(PropertiesIsland.getMaxCntEagle());
                location.initBuffalo(PropertiesIsland.getMaxCntBuffalo());
                location.initCaterpillars(PropertiesIsland.getMaxCntCaterpillar());
                location.initDeer(PropertiesIsland.getMaxCntDeer());
                location.initDucks(PropertiesIsland.getMaxCntDuck());
                location.initGoats(PropertiesIsland.getMaxCntGoat());
                location.initHorses(PropertiesIsland.getMaxCntHorse());
                location.initMouses(PropertiesIsland.getMaxCntMouse());
                location.initRabbits(PropertiesIsland.getMaxCntRabbit());
                location.initFox(PropertiesIsland.getMaxCntFox());
                location.initPlants(PropertiesIsland.getCntPlants());
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
            List<Direction> generateDirections = searchingDirectionToMove(animal);
            move(animal, generateDirections.get(UniversalRandomizer.getRandomInteger(generateDirections.size())));
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

    public void eatAnimals() {
        for (int x = 0; x < locations.length; x++) {
            for (int y = 0; y < locations[0].length; y++) {
                locations[x][y].eatAnimals();
            }
        }
    }

    private List<Direction> searchingDirectionToMove(Animal animal) {
        List<Direction> directions = new ArrayList<>();
        directions.add(Direction.HOLD);
        int[] coordinates = animal.getCoordinates();
        int x = coordinates[0];
        int y = coordinates[1];
        if (x > 0 && x < locations.length) {
            if (canMoveHere(animal, locations[x - 1][y]))
                directions.add(Direction.LEFT);
        }
        if (x >=0 && x < locations.length - 1) {
            if (canMoveHere(animal, locations[x + 1][y]))
                directions.add(Direction.RIGHT);
        }
        // система координат перевернута и начинается с левого верхнего угла,
        // так что когда координата y увеличивается - это движение вниз, когда y уменьшается - вверх
        if (y >= 0 && y < locations[0].length - 1) {
            if (canMoveHere(animal, locations[x][y + 1]))
                directions.add(Direction.DOWN);
        }
        if (y > 0 && y < locations[0].length) {
            if (canMoveHere(animal, locations[x][y - 1]))
                directions.add(Direction.UP);
        }
        return directions;
    }

    private boolean canMoveHere(Animal animal, Location location) {
        if (animal instanceof Wolf) {
            return location.getCntWolf() < PropertiesIsland.getMaxCntWolf();
        }
        else if (animal instanceof Sheep) {
            return location.getCntSheep() < PropertiesIsland.getMaxCntSheep();
        }
        else if (animal instanceof Bear) {
            return location.getCntBears() < PropertiesIsland.getMaxCntBear();
        }
        else if (animal instanceof Boa) {
            return location.getCntBoas() < PropertiesIsland.getMaxCntBoa();
        }
        else if (animal instanceof Boar) {
            return location.getCntBoars() < PropertiesIsland.getMaxCntBoar();
        }
        else if (animal instanceof Eagle) {
            return location.getCntEagles() < PropertiesIsland.getMaxCntEagle();
        }
        else if (animal instanceof Fox) {
            return location.getCntFoxs() < PropertiesIsland.getMaxCntFox();
        }
        else if (animal instanceof Buffalo) {
            return location.getCntBuffalos() < PropertiesIsland.getMaxCntBuffalo();
        }
        else if (animal instanceof Caterpillar) {
            return location.getCntCaterpilars() < PropertiesIsland.getMaxCntCaterpillar();
        }
        else if (animal instanceof Deer) {
            return location.getCntDeers() < PropertiesIsland.getMaxCntDeer();
        }
        else if (animal instanceof Duck) {
            return location.getCntDucks() < PropertiesIsland.getMaxCntDuck();
        }
        else if (animal instanceof Goat) {
            return location.getCntGoats() < PropertiesIsland.getMaxCntGoat();
        }
        else if (animal instanceof Horse) {
            return location.getCntHorses() < PropertiesIsland.getMaxCntHorse();
        }
        else if (animal instanceof Mouse) {
            return location.getCntMouses() < PropertiesIsland.getMaxCntMouse();
        }
        else if (animal instanceof Rabbit) {
            return location.getCntRabbits() < PropertiesIsland.getMaxCntRabbit();
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
    }

}
