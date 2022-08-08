package IslandModel.animal.herbivore;

import IslandModel.utils.PropertiesIsland;
import java.util.concurrent.ThreadLocalRandom;

// кабан
public class Boar extends Herbivorous {
    public Boar() {
        weight = ThreadLocalRandom.current().nextInt(PropertiesIsland.getWeightBoar());
    }
    public static String icon = PropertiesIsland.getBoarIcon();

    @Override
    public String getSpecies() {
        return "boar";
    }
}
