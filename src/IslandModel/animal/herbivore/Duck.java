package IslandModel.animal.herbivore;
// утка
import IslandModel.animal.CanFly;
import IslandModel.animal.Direction;
import IslandModel.utils.PropertiesIsland;
import java.util.concurrent.ThreadLocalRandom;

public class Duck extends Herbivorous implements CanFly {
    public static String icon = PropertiesIsland.getDuckIcon();

    public Duck() {
        weight = ThreadLocalRandom.current().nextInt(2) + ThreadLocalRandom.current().nextFloat();
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
