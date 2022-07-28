package animals;
// базовый класс животных
public abstract class Animal extends BaseObject implements CanEat, CanMove, Reproduce {
    // каждое животное обладает весом
    private int weight;
    // каждое животное обладает скоростью передвижения
    private int speed;
    // каждое животное нуждается в определенном количестве еды
    private int needFood;
    // количество съеденной еды
    private int satiety;
    // приздак голода
    private boolean hungry = satiety <= (needFood / 2); // если желудок полупустой - возникает чувство голода
    // пол животного
    private Sex sex;
    // животное может спать
    private boolean isSleep;
    private boolean isAlive;

    public Animal(int x, int y) {
        super(x, y);
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
