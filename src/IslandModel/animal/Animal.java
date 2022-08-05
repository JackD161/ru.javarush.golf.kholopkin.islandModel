package IslandModel.animal;

import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

// базовый класс животных
public abstract class Animal extends BaseObject implements CanEat, CanMove, Reproduce {

    // каждое животное нуждается в определенном количестве еды
    protected int needFood;
    // количество съеденной еды
    protected int satiety;
    // приздак голода
    protected boolean hungry;
    // пол животного
    protected Sex sex;
    // уникальный идентификатор животного



    public Animal() {
        sex = 1 == ThreadLocalRandom.current().nextInt(2) ? Sex.FAMILY:Sex.MALE;
        hungry = satiety <= (needFood / 2); // если желудок полупустой - возникает чувство голода
        health = 10;
    }

    /*
    Общий принцип поведения при взаимоотношениях животных
    1. Если ты больше другого животного - нужно попытаться съесть его
    2. Если ты меньше другого животного - нужно попытыться убежать от него
    3. Если вы равные и представители одного вида - попытаться спариться для размножения, если аппонент не против - то всё ОК
     */

    @Override
    public void eat(int howMany, String animal) {
        satiety += howMany;
        System.out.println(this.getName() + " сожрал " + animal);
    }

    @Override
    public void move(Direction direction) {
    }

    @Override
    public void reproduce(Animal animal) {
        if(animal.sex != this.sex)
        {

        }
    }

    public boolean isHungry() {
        return hungry;
    }





}
