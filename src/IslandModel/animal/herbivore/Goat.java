package IslandModel.animal.herbivore;

import IslandModel.utils.PropertiesIsland;
import java.util.concurrent.ThreadLocalRandom;

// козел
public class Goat extends Herbivorous{
    public static String icon = PropertiesIsland.getGoatIcon();

    public Goat() {
        weight = ThreadLocalRandom.current().nextInt(PropertiesIsland.getWeightGoat());
        maxPopulationToReproduce = PropertiesIsland.getMaxPopulationToReproduceGoat();
    }

    @Override
    public String getSpecies() {
        return "goat";
    }
}
