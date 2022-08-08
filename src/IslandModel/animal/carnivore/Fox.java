package IslandModel.animal.carnivore;

import IslandModel.utils.PropertiesIsland;
import java.util.concurrent.ThreadLocalRandom;

// лиса
public class Fox extends Carnivore{
    public Fox() {
        weight = ThreadLocalRandom.current().nextInt(PropertiesIsland.getWeightFox());
        maxPopulationToReproduce = PropertiesIsland.getMaxPopulationToReproduceFox();
    }
    public static String icon = PropertiesIsland.getFoxIcon();

    @Override
    public String getSpecies() {
        return "fox";
    }
}
