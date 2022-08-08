package IslandModel.animal.herbivore;

import IslandModel.utils.PropertiesIsland;
import java.util.concurrent.ThreadLocalRandom;

// гусеница
public class Caterpillar extends Herbivorous{
    public static String icon = PropertiesIsland.getCaterpillarIcon();
    private float weight;
    public Caterpillar() {
        weight = ThreadLocalRandom.current().nextInt(2) + ThreadLocalRandom.current().nextFloat();
        maxPopulationToReproduce = PropertiesIsland.getMaxPopulationToReproduceCaterpillar();
    }

    @Override
    public String getSpecies() {
        return "caterpillar";
    }
}
