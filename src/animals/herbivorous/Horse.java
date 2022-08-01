package animals.herbivorous;

import utils.PropertiesIsland;
import utils.UniversalRandomizer;

// лошадь
public class Horse extends Herbivorous{
    {
        icon = PropertiesIsland.getHorseIcon();
        diet = PropertiesIsland.getHorse();
        weight = UniversalRandomizer.getRandomInteger(PropertiesIsland.getWeightHorse());
    }
    public Horse(int x, int y) {
        super(x, y);
    }

    @Override
    public String getSpecies() {
        return "horse";
    }
}
