package IslandModel.animal.herbivore;

import IslandModel.utils.PropertiesIsland;
import java.util.concurrent.ThreadLocalRandom;

// бык
public class Buffalo extends Herbivorous {

    public static String icon = PropertiesIsland.getBuffaloIcon();

    public Buffalo() {
        weight = ThreadLocalRandom.current().nextInt(PropertiesIsland.getWeightBuffalo());
    }

    @Override
    public String getSpecies() {
        return "buffalo";
    }
}
