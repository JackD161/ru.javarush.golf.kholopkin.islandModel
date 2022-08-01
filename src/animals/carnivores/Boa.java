package animals.carnivores;

import utils.PropertiesIsland;
import utils.UniversalRandomizer;

// удав
public class Boa extends Carnivore{
    {
        icon = PropertiesIsland.getBoaIcon();
        diet = PropertiesIsland.getBoa();
        weight = UniversalRandomizer.getRandomInteger(PropertiesIsland.getWeightBoa());
    }
    public Boa(int x, int y) {
        super(x, y);
    }

    @Override
    public String getSpecies() {
        return "boa";
    }
}
