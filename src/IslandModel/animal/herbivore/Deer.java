package IslandModel.animal.herbivore;

import IslandModel.utils.PropertiesIsland;

import java.util.concurrent.ThreadLocalRandom;

// олень
public class Deer extends Herbivorous{
    public static String icon = PropertiesIsland.getDeerIcon();
    public Deer() {
        diet = PropertiesIsland.getDeer();
        weight = ThreadLocalRandom.current().nextInt(PropertiesIsland.getWeightDeer());
    }

    @Override
    public String getSpecies() {
        return "deer";
    }
}
