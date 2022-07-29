package animals.herbivorous;
// базовый класс травоядных
import animals.Animal;

public class Herbivorous extends Animal {
    public Herbivorous(int x, int y) {
        super(x, y);
    }

    public void eat(int howMany) {
        satiety += howMany;
    }
}
