package IslandModel.animal.carnivore;

import IslandModel.utils.PropertiesIsland;

import java.util.concurrent.ThreadLocalRandom;

// удав
public class Boa extends Carnivore{

    public Boa() {
        diet = PropertiesIsland.getBoa();
        weight = ThreadLocalRandom.current().nextInt(PropertiesIsland.getWeightBoa());
    }
    public static String icon = PropertiesIsland.getBoaIcon();
    @Override
    public String getSpecies() {
        return "boa";
    }
}
