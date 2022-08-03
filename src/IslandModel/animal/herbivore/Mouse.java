package IslandModel.animal.herbivore;

import IslandModel.utils.PropertiesIsland;

import java.util.concurrent.ThreadLocalRandom;

// мышь
public class Mouse extends Herbivorous{
    public static String icon = PropertiesIsland.getMouseIcon();
    public Mouse() {
        diet = PropertiesIsland.getMouse();
        weight = ThreadLocalRandom.current().nextInt(2) + ThreadLocalRandom.current().nextFloat();
    }
    private float weight;

    @Override
    public String getSpecies() {
        return "mouse";
    }
}
