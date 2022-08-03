package IslandModel.animal.herbivore;

import IslandModel.utils.PropertiesIsland;

import java.util.concurrent.ThreadLocalRandom;

// лошадь
public class Horse extends Herbivorous{
    public static String icon = PropertiesIsland.getHorseIcon();
    public Horse() {
        diet = PropertiesIsland.getHorse();
        weight = ThreadLocalRandom.current().nextInt(PropertiesIsland.getWeightHorse());
    }

    @Override
    public String getSpecies() {
        return "horse";
    }
}
