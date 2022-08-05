package IslandModel.animal.carnivore;
// орел
import IslandModel.animal.CanFly;
import IslandModel.animal.Direction;
import IslandModel.utils.PropertiesIsland;
import java.util.concurrent.ThreadLocalRandom;

public class Eagle extends Carnivore implements CanFly {
    public Eagle() {
        weight = ThreadLocalRandom.current().nextInt(PropertiesIsland.getWeightEagle());
    }
    public static String icon = PropertiesIsland.getEagleIcon();
    @Override
    public String getSpecies() {
        return "eagle";
    }

    @Override
    public void fly(Direction direction) {

    }
}
