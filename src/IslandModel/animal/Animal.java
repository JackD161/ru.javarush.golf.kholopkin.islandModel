package IslandModel.animal;

import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

// базовый класс животных
public abstract class Animal extends BaseObject implements CanEat, CanMove, Reproduce {
    // каждое животное обладает весом
    protected int weight;
    // каждое животное обладает скоростью передвижения
    protected int speed;
    // каждое животное нуждается в определенном количестве еды
    protected int needFood;
    // количество съеденной еды
    protected int satiety;
    // приздак голода
    protected boolean hungry;
    // пол животного
    protected Sex sex;
    // животное может спать
    protected boolean isSleep;
    protected boolean isAlive;
    // уникальный идентификатор животного
    private static int INDEXanimal = 0;
    protected String name;


    public Animal() {
        sex = 1 == ThreadLocalRandom.current().nextInt(2) ? Sex.FAMILY:Sex.MALE;
        hungry = satiety <= (needFood / 2); // если желудок полупустой - возникает чувство голода
        health = 10;
        name = getSpecies() + ++INDEXanimal;
    }

    /*
    Общий принцип поведения при взаимоотношениях животных
    1. Если ты больше другого животного - нужно попытаться съесть его
    2. Если ты меньше другого животного - нужно попытыться убежать от него
    3. Если вы равные и представители одного вида - попытаться спариться для размножения, если аппонент не против - то всё ОК
     */

    public void birth() {
        isAlive = true;
    }

    public void die() {
        isAlive = false;
    }

    @Override
    public void eat(int howMany) {
        satiety += howMany;
    }

    @Override
    public void move(Direction direction) {
    }

    @Override
    public void reproduce(Animal animal) {
        if(animal.sex != this.sex)
        {
            birth();
        }
    }

    public boolean isHungry() {
        return hungry;
    }

    public int getFood() {
        return (int) weight / 3;
    }

    public int getNeedFood() {
        return needFood - satiety;
    }

    public String getName() {
        return name;
    }

    public Map<String, Integer> diet;

}
