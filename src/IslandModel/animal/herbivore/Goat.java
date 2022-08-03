package IslandModel.animal.herbivore;

import IslandModel.utils.PropertiesIsland;

import java.util.concurrent.ThreadLocalRandom;

// козел
public class Goat extends Herbivorous{
    public static String icon = PropertiesIsland.getGoatIcon();

    public Goat() {
        diet = PropertiesIsland.getGoat();
        weight = ThreadLocalRandom.current().nextInt(PropertiesIsland.getWeightGoat());
    }

    @Override
    public String getSpecies() {
        return "goat";
    }
}
