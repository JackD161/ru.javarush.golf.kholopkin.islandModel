package island;

import animals.Animal;
import animals.BaseObject;
import animals.Direction;
import animals.carnivores.Carnivore;
import animals.carnivores.Wolf;
import animals.herbivorous.Herbivorous;
import animals.herbivorous.Sheep;
import plants.Plant;
import utils.PropertiesIsland;
import utils.UniversalRandomizer;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Location {
    private int x;
    private int y;
    private int cntWolf;
    private int cntSheep;
    private int cntPlants;
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

    public void initPlants(int maxCnt) {
        int rnd = UniversalRandomizer.getRandomIntegerFromRange(maxCnt / 2, maxCnt);
        while(rnd > 0) {
            plants.add(new Plant(x, y));
            rnd--;
            cntPlants++;
        }
    }

    public void eatAnimals() {
        // кормим плотоядных
        for(Carnivore hunter : carnivores) {
            // перебираем всех хищников и если он голодный он охотится
            if (hunter.isHungry()) {
                Herbivorous prey = herbivorous.get(UniversalRandomizer.getRandomInteger(herbivorous.size()));
                hunter.eat(prey.getFood());
                prey.die();
                herbivorous.remove(prey);
            }
        }
        // кормим травоядных
        for(Herbivorous cattle : herbivorous) {
            // если растительность на локации есто то кормим
            if (plants.size() > 0) {
                cattle.eat(eatGrass(cattle.getNeedFood()));
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
                "\n\uD83D\uDC3A " + cntWolf +
                "\n\uD83D\uDC11 " + cntSheep +
                "\n\uD83C\uDF3F " + cntPlants;
    }
}
