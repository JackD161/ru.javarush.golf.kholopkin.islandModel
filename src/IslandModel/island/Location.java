package IslandModel.island;

import IslandModel.animal.Animal;
import IslandModel.animal.BaseObject;
import IslandModel.animal.CanEat;
import IslandModel.animal.carnivore.*;
import IslandModel.animal.herbivore.*;
import IslandModel.plant.Plant;
import IslandModel.utils.Coordinates;
import IslandModel.utils.PropertiesIsland;
import java.util.*;
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
    private final Map<String, BaseObject> items;

    public int getCntPlants() {
        return cntPlants;
    }

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
            cntFoxs += value;
        else if (object instanceof Wolf)
            cntWolf += value;
        else if (object instanceof Buffalo)
            cntBuffalos += value;
        else if (object instanceof Caterpillar)
            cntCaterpilars += value;
        else if (object instanceof Deer)
            cntDeers += value;
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
        }
        else {
            if (object instanceof Animal)
                items.remove((object).getName());
            else if (object instanceof Plant)
                items.remove((object).getName());
        }
    }

    public Location(int x, int y) {
        coordinates = new Coordinates(x, y);
        items = new HashMap<>();
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
            cntBuffalos++;
        }
    }
    private void initCaterpillars(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Caterpillar animal = new Caterpillar();
            items.put(animal.getName(), animal);
            rnd--;
            cntCaterpilars++;
        }
    }

    private void initDeer(int maxCnt) {
        int rnd = ThreadLocalRandom.current().nextInt(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            Deer animal = new Deer();
            items.put(animal.getName(), animal);
            rnd--;
            cntDeers++;
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
            cntFoxs++;
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
        Set<String> eatedAmimals = new HashSet<>();
        for (Map.Entry<String, BaseObject> item : items.entrySet()) {
            if (item.getValue() instanceof CanEat) {
                Animal hunter = (Animal) item.getValue();
                for (Map.Entry<String, BaseObject> prey : items.entrySet()) {
                    String species = hunter.getSpecies();
                    String spec2 = prey.getValue().getSpecies();
                    int diet = PropertiesIsland.getDietByAnimal(species, spec2);
                    int random = ThreadLocalRandom.current().nextInt(101);
                    if (diet >= random) {
                        hunter.eat(prey.getValue().getFood(), prey.getValue().getSpecies());
                        eatedAmimals.add(prey.getKey());
                        break;
                    }
                }
            }
        }
        for (String away : eatedAmimals) {
            comeOrAway(items.get(away), false);
        }
    }

    // копушать травку
    private int eatGrass(int howMany) {
        if (howMany > cntPlants) {
            howMany = cntPlants;
            cntPlants = 0;
            return howMany;
        }
        else {
            int cnt = howMany;
            Iterator<Map.Entry<String, BaseObject>> iterator = items.entrySet().iterator();
            while (cnt > 0) {
                BaseObject object = iterator.next().getValue();
                if (object instanceof Plant)
                    iterator.remove();
                cnt--;
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
            plant = ThreadLocalRandom.current().nextInt(cntPlants + 2);
        }
        while(plant > 0) {
            Plant plant1 = new Plant();
            items.put(plant1.getName(), plant1);
            plant--;
        }
    }

    public void reproduceAnimals() {
        Iterator<Map.Entry<String, BaseObject>> iterator = items.entrySet().iterator();

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