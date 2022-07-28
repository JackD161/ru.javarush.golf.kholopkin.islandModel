package island;

import animals.Animal;
import animals.BaseObject;
import animals.carnivores.Carnivore;
import animals.carnivores.Wolf;
import animals.herbivorous.Herbivorous;
import animals.herbivorous.Sheep;
import plants.Plant;
import utils.PropertiesIsland;
import utils.UniversalRandomizer;

import java.util.ArrayList;
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

/*
    // ОПИСЫВАЕМ СОБЫТИЯ НА ЛОКАЦИИ
    public void calculate() {

        // В ЦИКЛЕ ПЕРЕБИРАЕМ ХИЩНИКОВ ИЗ ЛИСТА
        // И КАЖДОМУ ПО ОЧЕРЕДИ СУЕМ СПИСОК ТРАВОЯДНЫХ
        for (int i = 0; i < carnivores.size(); i++) {
            Carnivore carnivore = carnivores.get(i);
            carnivore.eat(herbivorous);

            // РАЗМНОЖАЕМСЯ
            carnivore.reproduce();

            // ДВИГАЕМСЯ
            carnivore.chooseDirection();
        }

        // ТО ЖЕ САМОЕ ДЕЛАЕМ ДЛЯ ТРАВОЯДНЫХ

        for (int i = 0; i < herbivores.size(); i++) {
            // ... //
        }

    }
*/
    @Override
    public String toString() {
        return "Волков на локации " + cntWolf + "\n" +
                "Овец на локации " + cntSheep + "\n";
    }
}
