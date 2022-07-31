package animals.carnivores;
// орел
import animals.CanFly;
import animals.Direction;

public class Eagle extends Carnivore implements CanFly {
    public Eagle(int x, int y) {
        super(x, y);
    }

    @Override
    public String getSpecies() {
        return "eagle";
    }

    @Override
    public void fly(Direction direction) {

    }
}
