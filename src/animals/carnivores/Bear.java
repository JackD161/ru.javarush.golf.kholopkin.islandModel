package animals.carnivores;

import utils.PropertiesIsland;
import utils.UniversalRandomizer;

// медведь
public class Bear extends Carnivore{
    {
        icon = PropertiesIsland.getBearIcon();
        diet = PropertiesIsland.getBear();
        weight = UniversalRandomizer.getRandomInteger(PropertiesIsland.getWeightBear());
    }
    public Bear(int x, int y) {
        super(x, y);
    }

    @Override
    public String getSpecies() {
        return "bear";
    }
}
