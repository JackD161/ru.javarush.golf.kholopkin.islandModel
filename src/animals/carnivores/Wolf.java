package animals.carnivores;

import utils.PropertiesIsland;
import utils.UniversalRandomizer;

// волк
public class Wolf extends Carnivore{
    {
        icon = PropertiesIsland.getWolfIcon();
        diet = PropertiesIsland.getWolf();
        weight = UniversalRandomizer.getRandomInteger(PropertiesIsland.getWeightWolf());
    }
    public Wolf(int x, int y) {
        super(x, y);

    }

    @Override
    public String getSpecies() {
        return "wolf";
    }
}
