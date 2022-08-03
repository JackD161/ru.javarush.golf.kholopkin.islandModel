package IslandModel.animal.herbivore;

import IslandModel.utils.PropertiesIsland;

import java.util.concurrent.ThreadLocalRandom;

// кролик
public class Rabbit extends Herbivorous{
    public static String icon = PropertiesIsland.getRabbitIcon();
    public Rabbit() {
        diet = PropertiesIsland.getRabbit();
        weight = ThreadLocalRandom.current().nextInt(PropertiesIsland.getWeightRabbit());
    }

    @Override
    public String getSpecies() {
        return "rabbit";
    }
}
