package animals.carnivores;

import utils.PropertiesIsland;
import utils.UniversalRandomizer;

// лиса
public class Fox extends Carnivore{
    {
        icon = PropertiesIsland.getFoxIcon();
        diet = PropertiesIsland.getFox();
        weight = UniversalRandomizer.getRandomInteger(PropertiesIsland.getWeightFox());
    }
    public Fox(int x, int y) {
        super(x, y);
    }

    @Override
    public String getSpecies() {
        return "fox";
    }
}
