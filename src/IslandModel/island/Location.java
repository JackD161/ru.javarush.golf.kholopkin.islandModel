package IslandModel.island;

import IslandModel.animal.*;
import IslandModel.animal.carnivore.*;
import IslandModel.animal.herbivore.*;
import IslandModel.plant.Plant;
import IslandModel.utils.Coordinates;
import IslandModel.utils.PropertiesIsland;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Location {
    private final Coordinates coordinates;
    private int cntWolf;
    private int cntSheep;
    private int cntPlants;
    private int cntBears;
    private int cntBoas;
    private int cntBoars;
    private int cntEagles;
    private int cntFoxes;
    private int cntBuffaloes;
    private int cntCaterpillars;
    private int cntDeer;
    private int cntDucks;
    private int cntGoats;
    private int cntHorses;
    private int cntMouses;
    private int cntRabbits;
    // Списки где будут хранитсья находящиеся на локации сущности
    private final Map<String, BaseObject> items;

    private final Lock lock = new ReentrantLock(true);

    public Set<String> getItems() {
        return items.keySet();
    }

    public BaseObject getItemByKey(String key) {
        return items.get(key);
    }

    public void comeOrAway(BaseObject object, boolean come) {
        int value;
        if (come)
            value = 1;
        else
            value = -1;
        if (object instanceof Bear)
            cntBears += value;
        else if (object instanceof Boa)
            cntBoas += value;
        else if (object instanceof Boar)
            cntBoars += value;
        else if (object instanceof Eagle)
            cntEagles += value;
        else if (object instanceof Fox)
            cntFoxes += value;
        else if (object instanceof Wolf)
            cntWolf += value;
        else if (object instanceof Buffalo)
            cntBuffaloes += value;
        else if (object instanceof Caterpillar)
            cntCaterpillars += value;
        else if (object instanceof Deer)
            cntDeer += value;
        else if (object instanceof Duck)
            cntDucks += value;
        else if (object instanceof Goat)
            cntGoats += value;
        else if (object instanceof Horse)
            cntHorses += value;
        else if (object instanceof Mouse)
            cntMouses += value;
        else if (object instanceof Rabbit)
            cntRabbits += value;
        else if (object instanceof Sheep)
            cntSheep += value;
        else if (object instanceof Plant)
            cntPlants += value;
        if (come) {
            if (object instanceof Animal)
                items.put((object).getName(), object);
            else if (object instanceof Plant)
                items.put((object).getName(), object);
//            System.out.println("На локацию пришел " + object.getName());
        }
        else {
            if (object instanceof Animal)
                items.remove((object).getName());
            else if (object instanceof Plant)
                items.remove((object).getName());
//            System.out.println("С локации ушел " + object.getName());
        }
    }

    public Location(int x, int y) {
        coordinates = new Coordinates(x, y);
        items = new HashMap<>();
        initializeLocation();
    }

    // метод возвращает координаты локации
    public Coordinates getCoordinates() {
        return coordinates;
    }

    public int getCntWolf() {
        return cntWolf;
    }

    public int getCntSheep() {
        return cntSheep;
    }

    public int getCntBears() {
        return cntBears;
    }

    public int getCntBoas() {
        return cntBoas;
    }

    public int getCntBoars() {
        return cntBoars;
    }

    public int getCntEagles() {
        return cntEagles;
    }

    public int getCntFoxes() {
        return cntFoxes;
    }

    public int getCntBuffaloes() {
        return cntBuffaloes;
    }

    public int getCntCaterpillars() {
        return cntCaterpillars;
    }

    public int getCntDeer() {
        return cntDeer;
    }

    public int getCntDucks() {
        return cntDucks;
    }

    public int getCntGoats() {
        return cntGoats;
    }

    public int getCntHorses() {
        return cntHorses;
    }

    public int getCntMouses() {
        return cntMouses;
    }

    public int getCntRabbits() {
        return cntRabbits;
    }

    public Lock getLock() {
        return lock;
    }

    // блок инициализации зверей на локации
    // количество создаваемых зверей рандомно от половины максимального количества до максимума
    private void initWolf(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Wolf animal = new Wolf();
            items.put(animal.getName(), animal);
            rnd--;
            cntWolf++;
        }
    }

    private void initSheep(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Sheep animal = new Sheep();
            items.put(animal.getName(), animal);
            rnd--;
            cntSheep++;
        }
    }

    private void initBears(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Bear animal = new Bear();
            items.put(animal.getName(), animal);
            rnd--;
            cntBears++;
        }
    }
    private void initBoars(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Boar animal = new Boar();
            items.put(animal.getName(), animal);
            rnd--;
            cntBoars++;
        }
    }
    private void initBuffalo(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Buffalo animal = new Buffalo();
            items.put(animal.getName(), animal);
            rnd--;
            cntBuffaloes++;
        }
    }
    private void initCaterpillars(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Caterpillar animal = new Caterpillar();
            items.put(animal.getName(), animal);
            rnd--;
            cntCaterpillars++;
        }
    }

    private void initDeer(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Deer animal = new Deer();
            items.put(animal.getName(), animal);
            rnd--;
            cntDeer++;
        }
    }

    private void initDucks(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Duck animal = new Duck();
            items.put(animal.getName(), animal);
            rnd--;
            cntDucks++;
        }
    }

    private void initGoats(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Goat animal = new Goat();
            items.put(animal.getName(), animal);
            rnd--;
            cntGoats++;
        }
    }

    private void initHorses(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Horse animal = new Horse();
            items.put(animal.getName(), animal);
            rnd--;
            cntHorses++;
        }
    }

    private void initMouses(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Mouse animal = new Mouse();
            items.put(animal.getName(), animal);
            rnd--;
            cntMouses++;
        }
    }

    private void initRabbits(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Rabbit animal = new Rabbit();
            items.put(animal.getName(), animal);
            rnd--;
            cntRabbits++;
        }
    }
    private void initFox(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Fox animal = new Fox();
            items.put(animal.getName(), animal);
            rnd--;
            cntFoxes++;
        }
    }
    private void initEagles(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Eagle animal = new Eagle();
            items.put(animal.getName(), animal);
            rnd--;
            cntEagles++;
        }
    }
    private void initBoa(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Boa animal = new Boa();
            items.put(animal.getName(), animal);
            rnd--;
            cntBoas++;
        }
    }

    private void initPlants(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Plant plant = new Plant();
            items.put(plant.getName(), plant);
            rnd--;
            cntPlants++;
        }
    }

    private void initializeLocation() {
        initWolf(PropertiesIsland.getMaxCntWolf());
        initSheep(PropertiesIsland.getMaxCntSheep());
        initBears(PropertiesIsland.getMaxCntBear());
        initBoa(PropertiesIsland.getMaxCntBoa());
        initBoars(PropertiesIsland.getMaxCntBoar());
        initEagles(PropertiesIsland.getMaxCntEagle());
        initBuffalo(PropertiesIsland.getMaxCntBuffalo());
        initCaterpillars(PropertiesIsland.getMaxCntCaterpillar());
        initDeer(PropertiesIsland.getMaxCntDeer());
        initDucks(PropertiesIsland.getMaxCntDuck());
        initGoats(PropertiesIsland.getMaxCntGoat());
        initHorses(PropertiesIsland.getMaxCntHorse());
        initMouses(PropertiesIsland.getMaxCntMouse());
        initRabbits(PropertiesIsland.getMaxCntRabbit());
        initFox(PropertiesIsland.getMaxCntFox());
        initPlants(PropertiesIsland.getCntPlants());
    }

    public boolean eatAnimals() {
        for (Map.Entry<String, BaseObject> item : items.entrySet()) {
            if (item.getValue() instanceof CanEat) {
                Animal hunter = (Animal) item.getValue();
                if (hunter.isHungry()) {
                    for (Map.Entry<String, BaseObject> prey : items.entrySet()) {
                        BaseObject food = prey.getValue();
                        if (food.isAlive()) {
                            if (PropertiesIsland.getDietByAnimal(hunter.getSpecies(), food.getSpecies()) >= ThreadLocalRandom.current().nextInt(1, 101)) {
                                hunter.eat(prey.getValue().getFood(), prey.getValue().getName());
                                prey.getValue().die();
                                break;
                            }
                        }
                    }
                }
            }
        }
        Map<String, BaseObject> copyItems = new HashMap<>(items);
        for (Map.Entry<String, BaseObject> object : copyItems.entrySet()) {
            if (!object.getValue().isAlive())
                comeOrAway(object.getValue(), false);
        }
        return true;
    }
    public boolean reproduceAnimals() {
        Map<String, BaseObject> copyItems = new HashMap<>(items);
        for (Map.Entry<String, BaseObject> item : copyItems.entrySet()) {
            if (item.getValue() instanceof Reproduce) {
                Animal parent1 = (Animal) item.getValue();
                if (parent1.isReadyToReproduce()) {
                    for (Map.Entry<String, BaseObject> item2 : copyItems.entrySet()) {
                        Animal parent2 = (Animal) item2.getValue();
                        if (parent2.isReadyToReproduce()) {
                            int population = ThreadLocalRandom.current().nextInt(parent1.getMaxPopulationToReproduce());
                            if (checkPopulation(parent1) < population) {
                                population = checkPopulation(parent1);
                            }
                            if (parent1.reproduce(population, parent2)) {
                                while (population > 0) {
                                    birthOrDieAnimalOnLocation(parent1, true);
                                    population--;
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    private int checkPopulation(Animal animal) {
        if (animal instanceof Bear)
            return PropertiesIsland.getMaxCntBear() - cntBears;
        else if (animal instanceof Boa)
            return PropertiesIsland.getMaxCntBoa() - cntBoas;
        else if (animal instanceof Eagle)
            return PropertiesIsland.getMaxCntEagle() - cntEagles;
        else if (animal instanceof Fox)
            return PropertiesIsland.getMaxCntFox() - cntFoxes;
        else if (animal instanceof Wolf)
            return PropertiesIsland.getMaxCntWolf() - cntWolf;
        else if (animal instanceof Boar)
            return PropertiesIsland.getMaxCntBoar() - cntBoars;
        else if (animal instanceof Buffalo)
            return PropertiesIsland.getMaxCntBuffalo() - cntBuffaloes;
        else if (animal instanceof Caterpillar)
            return PropertiesIsland.getMaxCntCaterpillar() - cntCaterpillars;
        else if (animal instanceof Deer)
            return PropertiesIsland.getMaxCntDeer() - cntDeer;
        else if (animal instanceof Duck)
            return PropertiesIsland.getMaxCntDuck() - cntDucks;
        else if (animal instanceof Goat)
            return PropertiesIsland.getMaxCntGoat() - cntGoats;
        else if (animal instanceof Horse)
            return PropertiesIsland.getMaxCntHorse() - cntHorses;
        else if (animal instanceof Mouse)
            return PropertiesIsland.getMaxCntMouse() - cntMouses;
        else if (animal instanceof Rabbit)
            return PropertiesIsland.getMaxCntRabbit() - cntRabbits;
        else if (animal instanceof Sheep)
            return PropertiesIsland.getMaxCntSheep() - cntSheep;
        else
            return 0;
    }

    private void birthOrDieAnimalOnLocation(Animal animal, boolean isAlive) {
        if (animal instanceof Bear)
            comeOrAway(new Bear(), isAlive);
        else if (animal instanceof Boa)
            comeOrAway(new Boa(), isAlive);
        else if (animal instanceof Boar)
            comeOrAway(new Boar(), isAlive);
        else if (animal instanceof Eagle)
            comeOrAway(new Eagle(), isAlive);
        else if (animal instanceof Fox)
            comeOrAway(new Fox(), isAlive);
        else if (animal instanceof Wolf)
            comeOrAway(new Wolf(), isAlive);
        else if (animal instanceof Buffalo)
            comeOrAway(new Buffalo(), isAlive);
        else if (animal instanceof Caterpillar)
            comeOrAway(new Caterpillar(), isAlive);
        else if (animal instanceof Deer)
            comeOrAway(new Deer(), isAlive);
        else if (animal instanceof Duck)
            comeOrAway(new Duck(), isAlive);
        else if (animal instanceof Goat)
            comeOrAway(new Goat(), isAlive);
        else if (animal instanceof Horse)
            comeOrAway(new Horse(), isAlive);
        else if (animal instanceof Mouse)
            comeOrAway(new Mouse(), isAlive);
        else if (animal instanceof Rabbit)
            comeOrAway(new Rabbit(), isAlive);
        else if (animal instanceof Sheep)
            comeOrAway(new Sheep(), isAlive);
    }

    public boolean lifeCycleAnimals() {
        for (Map.Entry<String, BaseObject> item : items.entrySet()) {
            Animal animal;
            if (item.getValue() instanceof Animal) {
                animal = (Animal) item.getValue();
                animal.lostEnergy();
                if (animal.getHealth() < 1) {
                    comeOrAway(animal, false);
                    animal.die();
                }
            }
        }
        return true;
    }

    // посадить травку
    public void plantGrass() {
        int plant = 0;
        if (cntPlants > 50) {
            plant = ThreadLocalRandom.current().nextInt(PropertiesIsland.getCntPlants() / 2);
        }
        else {
            plant = ThreadLocalRandom.current().nextInt(PropertiesIsland.getCntPlants());
        }
        if (plant > PropertiesIsland.getCntPlants())
            plant = PropertiesIsland.getCntPlants();
        while(plant > 0) {
            comeOrAway(new Plant(), true);
            plant--;
        }
    }

    @Override
    public String toString() {
        return "Локация х:" + coordinates.getX() + " y:" + coordinates.getY() +
                "\n" + Wolf.icon + " " + cntWolf + " | " + Boa.icon + " " + cntBoas + " | " + Buffalo.icon + " " + cntBuffaloes + " | " + Goat.icon + " " + cntGoats +
                "\n" + Sheep.icon + " " + cntSheep + " | " + Boar.icon + " " + cntBoars + " | " + Caterpillar.icon + " " + cntCaterpillars + " | " + Horse.icon + " " + cntHorses +
                "\n" + Plant.icon + " " + cntPlants + " | " + Eagle.icon + " " + cntEagles + " | " + Deer.icon + " " + cntDeer + " | " + Mouse.icon + " " + cntMouses +
                "\n" + Bear.icon + " " + cntBears + " | " + Fox.icon + " " + cntFoxes + " | " + Duck.icon + " " + cntDucks + " | " + Rabbit.icon + " " + cntRabbits + "\n";
    }
}
