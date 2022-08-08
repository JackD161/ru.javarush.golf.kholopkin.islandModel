package IslandModel.animal.herbivore;

import IslandModel.utils.PropertiesIsland;
import java.util.concurrent.ThreadLocalRandom;

// кролик
public class Rabbit extends Herbivorous{
    public static String icon = PropertiesIsland.getRabbitIcon();
    public Rabbit() {
        weight = ThreadLocalRandom.current().nextInt(PropertiesIsland.getWeightRabbit());
        maxPopulationToReproduce = PropertiesIsland.getMaxPopulationToReproduceRabbit();
    }

    @Override
    public String getSpecies() {
        return "rabbit";
    }
}
