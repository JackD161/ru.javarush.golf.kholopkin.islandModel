package animals.herbivorous;

import utils.PropertiesIsland;
import utils.UniversalRandomizer;

// олень
public class Deer extends Herbivorous{
    {
        icon = PropertiesIsland.getDeerIcon();
        diet = PropertiesIsland.getDeer();
        weight = UniversalRandomizer.getRandomInteger(PropertiesIsland.getWeightDeer());
    }
    public Deer(int x, int y) {
        super(x, y);
    }

    @Override
    public String getSpecies() {
        return "deer";
    }
}
