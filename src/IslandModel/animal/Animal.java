package IslandModel.animal;

import java.util.concurrent.ThreadLocalRandom;

// базовый класс животных
public abstract class Animal extends BaseObject implements CanEat, CanMove, Reproduce {

    // каждое животное нуждается в определенном количестве еды
    protected int needFood;
    // количество съеденной еды
    protected int satiety;
    // признак голода
    protected boolean hungry;
    // пол животного
    protected Sex sex;
    private int maxPopulationToReproduce = 6;
    protected boolean readyToReproduce;

    public boolean isReadyToReproduce() {
        return readyToReproduce;
    }

    public int getMaxPopulationToReproduce() {
        return maxPopulationToReproduce;
    }

    public Animal() {
        sex = 1 == ThreadLocalRandom.current().nextInt(2) ? Sex.FAMILY:Sex.MALE;
        hungry = satiety <= (needFood / 2); // если желудок полупустой - возникает чувство голода
        health = 10;
        isAlive = true;
        readyToReproduce = true;
    }

    @Override
    public void eat(int howMany, String animal) {
        satiety += howMany;
        if (satiety >= needFood)
            satiety = needFood;
        System.out.println(this.getName() + " сожрал " + animal);
    }

    @Override
    public void move(Direction direction) {
        System.out.println(this.name + " совершил движение " + direction.toString());
    }

    @Override
    public boolean reproduce(int howMany, Animal animal) {
        if (animal.getClass().equals(this.getClass())) {
            if (this.sex != animal.sex) {
                readyToReproduce = false;
                System.out.println(this.name + " спирился с " + animal.getName() + " и произвел " + howMany + " потомства");
                return true;
            }
        }
        else
            return false;
        return false;
    }

    public boolean isHungry() {
        return hungry;
    }





}
