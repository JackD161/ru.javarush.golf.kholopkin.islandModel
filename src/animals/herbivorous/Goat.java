package animals.herbivorous;

import utils.PropertiesIsland;
import utils.UniversalRandomizer;

// козел
public class Goat extends Herbivorous{
    {
        icon = PropertiesIsland.getGoatIcon();
        diet = PropertiesIsland.getGoat();
        weight = UniversalRandomizer.getRandomInteger(PropertiesIsland.getWeightGoat());
    }
    public Goat(int x, int y) {
        super(x, y);
    }

    @Override
    public String getSpecies() {
        return "goat";
    }
}
