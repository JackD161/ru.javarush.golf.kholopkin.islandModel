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
    protected int maxPopulationToReproduce;
    protected boolean readyToReproduce;
//    LogToFile logger;

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
//        System.out.println(this.getName() + " родился");
    }

    @Override
    public void eat(int howMany, String animal) {
        satiety += howMany;
        if (satiety >= needFood)
            satiety = needFood;
//        System.out.println(this.getName() + " сожрал " + animal);
    }

    @Override
    public void move(Direction direction) {
//        if (direction == Direction.HOLD)
//            System.out.println(this.getName() + " остался стоять на месте");
//        else
//            System.out.println(this.name + " совершил движение " + direction.toString());
    }

    public void lostEnergy() {
        if (satiety < needFood / 3) {
            satiety -= 2;
        }
        else if (satiety < 1) {
            health--;
        }
        else {
            satiety--;
        }
    }

    @Override
    public boolean reproduce(int howMany, Animal animal) {
        if (animal.getClass().equals(this.getClass())) {
            if (this.sex != animal.sex) {
                readyToReproduce = false;
//                String mess = howMany < 1 ? " и не произвел потомства":" и произвел " + howMany + " потомства";
//                System.out.println((this.name + " спарился с " + animal.getName() + mess));
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

    public int getHealth() {
        return health;
    }





}
