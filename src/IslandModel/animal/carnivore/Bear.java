package IslandModel.animal.carnivore;

import IslandModel.utils.PropertiesIsland;
import java.util.concurrent.ThreadLocalRandom;

// медведь
public class Bear extends Carnivore{
    public Bear() {
        weight = ThreadLocalRandom.current().nextInt(PropertiesIsland.getWeightBear());
        maxPopulationToReproduce = PropertiesIsland.getMaxPopulationToReproduceBear();
    }

    public static String icon = PropertiesIsland.getBearIcon();

    @Override
    public String getSpecies() {
        return "bear";
    }
}
