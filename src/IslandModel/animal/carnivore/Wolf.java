package IslandModel.animal.carnivore;

import IslandModel.utils.PropertiesIsland;
import java.util.concurrent.ThreadLocalRandom;

// волк
public class Wolf extends Carnivore{
    public static String icon = PropertiesIsland.getWolfIcon();
    public Wolf() {
        weight = ThreadLocalRandom.current().nextInt(PropertiesIsland.getWeightWolf());
    }

    @Override
    public String getSpecies() {
        return "wolf";
    }
}
