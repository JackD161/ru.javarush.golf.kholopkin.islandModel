package IslandModel.animal.herbivore;

import IslandModel.utils.PropertiesIsland;
import java.util.concurrent.ThreadLocalRandom;

// мышь
public class Mouse extends Herbivorous{
    public static String icon = PropertiesIsland.getMouseIcon();
    public Mouse() {
        weight = ThreadLocalRandom.current().nextInt(2) + ThreadLocalRandom.current().nextFloat();
        maxPopulationToReproduce = PropertiesIsland.getMaxPopulationToReproduceMouse();
    }
    private float weight;

    @Override
    public String getSpecies() {
        return "mouse";
    }
}
