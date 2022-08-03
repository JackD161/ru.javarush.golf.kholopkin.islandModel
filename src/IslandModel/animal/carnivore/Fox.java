package IslandModel.animal.carnivore;

import IslandModel.utils.PropertiesIsland;

import java.util.concurrent.ThreadLocalRandom;

// лиса
public class Fox extends Carnivore{
    public Fox() {
        diet = PropertiesIsland.getFox();
        weight = ThreadLocalRandom.current().nextInt(PropertiesIsland.getWeightFox());
    }
    public static String icon = PropertiesIsland.getFoxIcon();

    @Override
    public String getSpecies() {
        return "fox";
    }
}
