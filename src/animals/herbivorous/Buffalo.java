package animals.herbivorous;

import utils.PropertiesIsland;
import utils.UniversalRandomizer;

// бык
public class Buffalo extends Herbivorous {
    {
        icon = PropertiesIsland.getBuffaloIcon();
        diet = PropertiesIsland.getBuffalo();
        weight = UniversalRandomizer.getRandomInteger(PropertiesIsland.getWeightBuffalo());
    }
    public Buffalo(int x, int y) {
        super(x, y);
    }

    @Override
    public String getSpecies() {
        return "buffalo";
    }
}
