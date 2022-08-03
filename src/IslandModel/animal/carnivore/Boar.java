package IslandModel.animal.carnivore;

import IslandModel.utils.PropertiesIsland;

import java.util.concurrent.ThreadLocalRandom;

// кабан
public class Boar extends Carnivore {
    public Boar() {
        diet = PropertiesIsland.getBoar();
        weight = ThreadLocalRandom.current().nextInt(PropertiesIsland.getWeightBoar());
    }
    public static String icon = PropertiesIsland.getBoarIcon();
    private int weight;

    @Override
    public String getSpecies() {
        return "boar";
    }
}
