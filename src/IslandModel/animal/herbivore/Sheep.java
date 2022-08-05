package IslandModel.animal.herbivore;

import IslandModel.utils.PropertiesIsland;
import java.util.concurrent.ThreadLocalRandom;

// овца
public class Sheep extends Herbivorous{
    public static String icon = PropertiesIsland.getSheepIcon();
    public Sheep() {
        weight = ThreadLocalRandom.current().nextInt(PropertiesIsland.getWeightSheep());
    }

    @Override
    public String getSpecies() {
        return "sheep";
    }
}
