package animals.herbivorous;
// утка
import animals.CanFly;
import animals.Direction;

public class Duck extends Herbivorous implements CanFly {
    public Duck(int x, int y) {
        super(x, y);
    }

    @Override
    public String getSpecies() {
        return "duck";
    }

    @Override
    public void fly(Direction direction) {

    }
}
