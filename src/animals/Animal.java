package animals;

import utils.UniversalRandomizer;

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
    protected boolean hungry = satiety <= (needFood / 2); // если желудок полупустой - возникает чувство голода
    // пол животного
    protected Sex sex;
    // животное может спать
    protected boolean isSleep;
    protected boolean isAlive;

    public Animal(int x, int y) {
        super(x, y);
        sex = 1 == UniversalRandomizer.getRandomInteger(1) ? Sex.FAMILY:Sex.MALE;
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
    public void eat(BaseObject object, int howMany) {

    }

    @Override
    public void move(Direction direction) {

    }

    @Override
    public void reproduce(Animal animal) {

    }
}
