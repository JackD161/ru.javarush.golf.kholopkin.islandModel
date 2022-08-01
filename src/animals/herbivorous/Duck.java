package animals.herbivorous;
// утка
import animals.CanFly;
import animals.Direction;
import utils.PropertiesIsland;
import utils.UniversalRandomizer;

public class Duck extends Herbivorous implements CanFly {
    {
        icon = PropertiesIsland.getDuckIcon();
        diet = PropertiesIsland.getDuck();
        weight = UniversalRandomizer.getRandomInteger(1) + UniversalRandomizer.getRandomFloat();
    }
    public Duck(int x, int y) {
        super(x, y);
    }

    private float weight;
    @Override
    public String getSpecies() {
        return "duck";
    }

    @Override
    public void fly(Direction direction) {

    }
}
