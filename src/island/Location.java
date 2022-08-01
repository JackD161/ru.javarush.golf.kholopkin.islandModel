package island;

import animals.Animal;
import animals.BaseObject;
import animals.carnivores.*;
import animals.herbivorous.*;
import plants.Plant;
import utils.PropertiesIsland;
import utils.UniversalRandomizer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Location {
    private int x;
    private int y;
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
    private String bearIcon = PropertiesIsland.getBearIcon();
    private String boaIcon = PropertiesIsland.getBoaIcon();
    private String boarIcon = PropertiesIsland.getBoarIcon();
    private String eagleIcon = PropertiesIsland.getEagleIcon();
    private String foxIcon = PropertiesIsland.getFoxIcon();
    private String wolfIcon = PropertiesIsland.getWolfIcon();
    private String buffaloIcon = PropertiesIsland.getBuffaloIcon();
    private String caterpillarIcon = PropertiesIsland.getCaterpillarIcon();
    private String deerIcon = PropertiesIsland.getDeerIcon();
    private String duckIcon = PropertiesIsland.getDuckIcon();
    private String goatIcon = PropertiesIsland.getGoatIcon();
    private String horseIcon = PropertiesIsland.getHorseIcon();
    private String mouseIcon = PropertiesIsland.getMouseIcon();
    private String rabbitIcon = PropertiesIsland.getRabbitIcon();
    private String sheepIcon = PropertiesIsland.getSheepIcon();
    private String plantIcon = PropertiesIsland.getPlantIcon();
    // Списки где будут хранитсья находящиеся на локации сущности
    private List<Herbivorous> herbivorous = new ArrayList<>();
    private List<Carnivore> carnivores = new ArrayList<>();
    private List<Plant> plants = new ArrayList<>();

    public void away(BaseObject object) {
        if (object instanceof Herbivorous) {
            herbivorous.remove(object);
        }
        else if (object instanceof Carnivore) {
            carnivores.remove(object);
        }
        else if (object instanceof Plant) {
            plants.remove(object);
        }
        calculateAnimals();
    }

    public void come(BaseObject object) {
        if (object instanceof Herbivorous) {
            herbivorous.add((Herbivorous) object);
        }
        else if (object instanceof Carnivore) {
            carnivores.add((Carnivore) object);
        } else if (object instanceof Plant) {
            plants.add((Plant) object);
        }
        calculateAnimals();
    }

    private void calculateAnimals() {
        int wolfs = 0;
        int sheeps = 0;
        int buffalos = 0;
        int bears = 0;
        int boas = 0;
        int boars = 0;
        int eagles = 0;
        int foxs = 0;
        int caterpillars = 0;
        int deers = 0;
        int ducks = 0;
        int goats = 0;
        int horses = 0;
        int mouses = 0;
        int rabbits = 0;
        for (Animal animal : herbivorous) {
            if (animal instanceof Sheep)
                sheeps++;
            else if (animal instanceof Buffalo)
                buffalos++;
            else if (animal instanceof Caterpillar)
                caterpillars++;
            else if (animal instanceof Deer)
                deers++;
            else if (animal instanceof Duck)
                ducks++;
            else if (animal instanceof Goat)
                goats++;
            else if (animal instanceof Horse)
                horses++;
            else if (animal instanceof Mouse)
                mouses++;
            else if (animal instanceof Rabbit)
                rabbits++;
        }
        for (Animal animal : carnivores) {
            if (animal instanceof Wolf)
                wolfs++;
            else if (animal instanceof Bear)
                bears++;
            else if (animal instanceof Boa)
                boas++;
            else if (animal instanceof Boar)
                boars++;
            else if (animal instanceof Eagle)
                eagles++;
            else if (animal instanceof Fox)
                foxs++;

        }
        this.cntSheep = sheeps;
        this.cntWolf = wolfs;
        this.cntBuffalos = buffalos;
        this.cntCaterpilars = caterpillars;
        this.cntDeers = deers;
        this.cntDucks = ducks;
        this.cntGoats = goats;
        this.cntHorses = horses;
        this.cntMouses = mouses;
        this.cntRabbits = rabbits;
        this.cntBears = bears;
        this.cntBoas = boas;
        this.cntBoars = boars;
        this.cntEagles = eagles;
        this.cntFoxs = foxs;
    }

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public ArrayList<Animal> getAllAnimals() {
        ArrayList<Animal> allAnimals = new ArrayList<>();
        allAnimals.addAll(carnivores);
        allAnimals.addAll(herbivorous);
        return allAnimals;
    }

    // метод возвращает координаты локации
    public int[] getCoordinates() {
        return new int[]{x, y};
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

    public List<Herbivorous> getHerbivorous() {
        return herbivorous;
    }

    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public int getCntPlants() {
        return cntPlants;
    }

    // блок инициализации зверей на локации
    // количество создаваемых зверей рандомно от половины максимального количества до максимума
    public void initWolf(int maxCnt) {
        int rnd = UniversalRandomizer.getRandomIntegerFromRange(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            carnivores.add(new Wolf(x, y));
            rnd--;
            cntWolf++;
        }
    }

    public void initSheep(int maxCnt) {
        int rnd = UniversalRandomizer.getRandomIntegerFromRange(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            herbivorous.add(new Sheep(x, y));
            rnd--;
            cntSheep++;
        }
    }

    public void initBears(int maxCnt) {
        int rnd = UniversalRandomizer.getRandomIntegerFromRange(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            carnivores.add(new Bear(x, y));
            rnd--;
            cntBears++;
        }
    }
    public void initBoars(int maxCnt) {
        int rnd = UniversalRandomizer.getRandomIntegerFromRange(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            carnivores.add(new Boar(x, y));
            rnd--;
            cntBoars++;
        }
    }
    public void initBuffalo(int maxCnt) {
        int rnd = UniversalRandomizer.getRandomIntegerFromRange(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            herbivorous.add(new Buffalo(x, y));
            rnd--;
            cntBuffalos++;
        }
    }
    public void initCaterpillars(int maxCnt) {
        int rnd = UniversalRandomizer.getRandomIntegerFromRange(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            herbivorous.add(new Caterpillar(x, y));
            rnd--;
            cntCaterpilars++;
        }
    }

    public void initDeer(int maxCnt) {
        int rnd = UniversalRandomizer.getRandomIntegerFromRange(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            herbivorous.add(new Deer(x, y));
            rnd--;
            cntDeers++;
        }
    }

    public void initDucks(int maxCnt) {
        int rnd = UniversalRandomizer.getRandomIntegerFromRange(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            herbivorous.add(new Duck(x, y));
            rnd--;
            cntDucks++;
        }
    }

    public void initGoats(int maxCnt) {
        int rnd = UniversalRandomizer.getRandomIntegerFromRange(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            herbivorous.add(new Goat(x, y));
            rnd--;
            cntGoats++;
        }
    }

    public void initHorses(int maxCnt) {
        int rnd = UniversalRandomizer.getRandomIntegerFromRange(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            herbivorous.add(new Horse(x, y));
            rnd--;
            cntHorses++;
        }
    }

    public void initMouses(int maxCnt) {
        int rnd = UniversalRandomizer.getRandomIntegerFromRange(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            herbivorous.add(new Mouse(x, y));
            rnd--;
            cntMouses++;
        }
    }

    public void initRabbits(int maxCnt) {
        int rnd = UniversalRandomizer.getRandomIntegerFromRange(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            herbivorous.add(new Rabbit(x, y));
            rnd--;
            cntRabbits++;
        }
    }
    public void initFox(int maxCnt) {
        int rnd = UniversalRandomizer.getRandomIntegerFromRange(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            carnivores.add(new Fox(x, y));
            rnd--;
            cntFoxs++;
        }
    }
    public void initEagles(int maxCnt) {
        int rnd = UniversalRandomizer.getRandomIntegerFromRange(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            carnivores.add(new Eagle(x, y));
            rnd--;
            cntEagles++;
        }
    }
    public void initBoa(int maxCnt) {
        int rnd = UniversalRandomizer.getRandomIntegerFromRange(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            carnivores.add(new Boa(x, y));
            rnd--;
            cntBoas++;
        }
    }

    public void initPlants(int maxCnt) {
        int rnd = UniversalRandomizer.getRandomIntegerFromRange(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            plants.add(new Plant(x, y));
            rnd--;
            cntPlants++;
        }
    }

    public void eatAnimals() {
        /* ПЕРВАЯ ВЕРСИЯ
         //кормим плотоядных
        for(Carnivore hunter : carnivores) {
             //перебираем всех хищников и если он голодный он охотится
            if (hunter.isHungry()) {
                Herbivorous prey = herbivorous.get(UniversalRandomizer.getRandomInteger(herbivorous.size()));
                if (UniversalRandomizer.getRandomInteger(hunter.diet.get(prey.getSpecies())) < 100) {
                    hunter.eat(prey.getFood());
                    prey.die();
                    herbivorous.remove(prey);
                }
            }
        }
        //кормим травоядных
        for(Herbivorous cattle : herbivorous) {
             если растительность на локации есто то кормим
            if (plants.size() > 0) {
                cattle.eat(eatGrass(cattle.getNeedFood()));
            }
        }
         */
        List<Animal> allAnimals = getAllAnimals();
        List<Animal> dieAnimal = new ArrayList<>();
        Iterator<Animal> animalHunter = allAnimals.iterator();
        while (animalHunter.hasNext()) {
            Animal hunter = animalHunter.next();
            for (Animal prey : allAnimals) {
                if (hunter.isHungry()) {
                    int randomChance = UniversalRandomizer.getRandomInteger(hunter.diet.get(prey.getSpecies()));
                    if (randomChance + 1 < 100) {
                        hunter.eat(prey.getFood());
                        prey.die();
                        dieAnimal.add(prey);
                        break;
                    }
                }
            }
        }
        for (Animal died : dieAnimal) {
            away(died);
        }
        //кормим травоядных которые остались после охоты
        for (Herbivorous cattle : herbivorous) {
            // если растительность на локации есть и скотина голодная то кормим
            if (cattle.isHungry()) {
                if (plants.size() > 0) {
                    cattle.eat(eatGrass(cattle.getNeedFood()));
                }
            }
        }
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
            plant = UniversalRandomizer.getRandomInteger(cntPlants / 3);
        }
        else {
            plant = UniversalRandomizer.getRandomInteger(cntPlants + 1);
        }
        while(plant > 0) {
            plants.add(new Plant(x, y));
            plant--;
        }
    }

    @Override
    public String toString() {
        return "Локация х:" + x + " y:" + y +
                "\n" + wolfIcon + " " + cntWolf + " | " + boaIcon + " " + cntBoas + " | " + buffaloIcon + " " + cntBuffalos + " | " + goatIcon + " " + cntGoats +
                "\n" + sheepIcon + " " + cntSheep + " | " + boarIcon + " " + cntBoars + " | " + caterpillarIcon + " " + cntCaterpilars + " | " + horseIcon + " " + cntHorses +
                "\n" + plantIcon + " " + cntPlants + " | " + eagleIcon + " " + cntEagles + " | " + deerIcon + " " + cntDeers + " | " + mouseIcon + " " + cntMouses +
                "\n" + boarIcon + " " + cntBears + " | " + foxIcon + " " + cntFoxs + " | " + duckIcon + " " + cntDucks + " | " + rabbitIcon + " " + cntRabbits + "\n";
    }
}
