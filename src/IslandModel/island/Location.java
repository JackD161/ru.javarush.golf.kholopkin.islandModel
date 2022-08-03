package IslandModel.island;

import IslandModel.animal.Animal;
import IslandModel.animal.BaseObject;
import IslandModel.animal.carnivore.*;
import IslandModel.animal.herbivore.*;
import IslandModel.plant.Plant;
import IslandModel.utils.Coordinates;
import IslandModel.utils.PropertiesIsland;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Location {
    private final Coordinates coordinates;
    private int cntWolf;
    private int cntSheep;
    private int cntPlants;
    private int cntBears;
    private int cntBoas;
    private int cntBoars;
    private int cntEagles;
    private int cntFoxs;
    private int cntBuffalos;
    private int cntCaterpilars;
    private int cntDeers;
    private int cntDucks;
    private int cntGoats;
    private int cntHorses;
    private int cntMouses;
    private int cntRabbits;
    // Списки где будут хранитсья находящиеся на локации сущности
    private final Map<String, Animal> animals;
    private final List<Plant> plants;

    public void away(BaseObject object) {
        if (object instanceof Animal)
            animals.remove(((Animal) object).getName());
        else if (object instanceof Plant)
            plants.remove(object);
    }

    public void come(BaseObject object) {
        if (object instanceof Animal)
            animals.put(((Animal) object).getName(), (Animal) object);

    }

    public Location(int x, int y) {
        coordinates = new Coordinates(x, y);
        animals = new HashMap<>();
        plants = new ArrayList<>();
        initizlileLocation();
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

    public int getCntFoxs() {
        return cntFoxs;
    }

    public int getCntBuffalos() {
        return cntBuffalos;
    }

    public int getCntCaterpilars() {
        return cntCaterpilars;
    }

    public int getCntDeers() {
        return cntDeers;
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

    // блок инициализации зверей на локации
    // количество создаваемых зверей рандомно от половины максимального количества до максимума
    private void initWolf(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Wolf animal = new Wolf();
            animals.put(animal.getName(), animal);
            rnd--;
            cntWolf++;
        }
    }

    private void initSheep(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Sheep animal = new Sheep();
            animals.put(animal.getName(), animal);
            rnd--;
            cntSheep++;
        }
    }

    private void initBears(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Bear animal = new Bear();
            animals.put(animal.getName(), animal);
            rnd--;
            cntBears++;
        }
    }
    private void initBoars(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Boar animal = new Boar();
            animals.put(animal.getName(), animal);
            rnd--;
            cntBoars++;
        }
    }
    private void initBuffalo(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Buffalo animal = new Buffalo();
            animals.put(animal.getName(), animal);
            rnd--;
            cntBuffalos++;
        }
    }
    private void initCaterpillars(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Caterpillar animal = new Caterpillar();
            animals.put(animal.getName(), animal);
            rnd--;
            cntCaterpilars++;
        }
    }

    private void initDeer(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Deer animal = new Deer();
            animals.put(animal.getName(), animal);
            rnd--;
            cntDeers++;
        }
    }

    private void initDucks(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Duck animal = new Duck();
            animals.put(animal.getName(), animal);
            rnd--;
            cntDucks++;
        }
    }

    private void initGoats(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Goat animal = new Goat();
            animals.put(animal.getName(), animal);
            rnd--;
            cntGoats++;
        }
    }

    private void initHorses(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Horse animal = new Horse();
            animals.put(animal.getName(), animal);
            rnd--;
            cntHorses++;
        }
    }

    private void initMouses(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Mouse animal = new Mouse();
            animals.put(animal.getName(), animal);
            rnd--;
            cntMouses++;
        }
    }

    private void initRabbits(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Rabbit animal = new Rabbit();
            animals.put(animal.getName(), animal);
            rnd--;
            cntRabbits++;
        }
    }
    private void initFox(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Fox animal = new Fox();
            animals.put(animal.getName(), animal);
            rnd--;
            cntFoxs++;
        }
    }
    private void initEagles(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Eagle animal = new Eagle();
            animals.put(animal.getName(), animal);
            rnd--;
            cntEagles++;
        }
    }
    private void initBoa(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Boa animal = new Boa();
            animals.put(animal.getName(), animal);
            rnd--;
            cntBoas++;
        }
    }

    private void initPlants(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            plants.add(new Plant());
            rnd--;
            cntPlants++;
        }
    }

    private void initizlileLocation() {
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

    public void eatAnimals() {

    }

    // копушать травку
    private int eatGrass(int howMany) {
        if (howMany > plants.size()) {
            howMany = plants.size();
            plants.clear();
            return howMany;
        }
        else {
            for(int i = 0; i < howMany; i++) {
                plants.remove(i);
            }
            return howMany;
        }
    }

    // посадить травку
    public void plantGrass() {
        int plant = 0;
        if (cntPlants > 3) {
            plant = ThreadLocalRandom.current().nextInt(cntPlants / 3);
        }
        else {
            plant = ThreadLocalRandom.current().nextInt(cntPlants + 1);
        }
        while(plant > 0) {
            plants.add(new Plant());
            plant--;
        }
    }

    @Override
    public String toString() {
        return "Локация х:" + coordinates.getX() + " y:" + coordinates.getY() +
                "\n" + Wolf.icon + " " + cntWolf + " | " + Boa.icon + " " + cntBoas + " | " + Buffalo.icon + " " + cntBuffalos + " | " + Goat.icon + " " + cntGoats +
                "\n" + Sheep.icon + " " + cntSheep + " | " + Boar.icon + " " + cntBoars + " | " + Caterpillar.icon + " " + cntCaterpilars + " | " + Horse.icon + " " + cntHorses +
                "\n" + Plant.icon + " " + cntPlants + " | " + Eagle.icon + " " + cntEagles + " | " + Deer.icon + " " + cntDeers + " | " + Mouse.icon + " " + cntMouses +
                "\n" + Bear.icon + " " + cntBears + " | " + Fox.icon + " " + cntFoxs + " | " + Duck.icon + " " + cntDucks + " | " + Rabbit.icon + " " + cntRabbits + "\n";
    }
}
