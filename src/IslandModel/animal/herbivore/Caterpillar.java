package IslandModel.animal.herbivore;

import IslandModel.utils.PropertiesIsland;

import java.util.concurrent.ThreadLocalRandom;

// гусеница
public class Caterpillar extends Herbivorous{
    public static String icon = PropertiesIsland.getCaterpillarIcon();
    private float weight;
    public Caterpillar() {
        diet = PropertiesIsland.getCaterpillar();
        weight = ThreadLocalRandom.current().nextInt(2) + ThreadLocalRandom.current().nextFloat();
    }

    @Override
    public String getSpecies() {
        return "caterpillar";
    }
}
