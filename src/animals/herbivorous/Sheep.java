package animals.herbivorous;

import utils.PropertiesIsland;
import utils.UniversalRandomizer;

// овца
public class Sheep extends Herbivorous{
    {
        icon = PropertiesIsland.getSheepIcon();
        diet = PropertiesIsland.getSheep();
        weight = UniversalRandomizer.getRandomInteger(PropertiesIsland.getWeightSheep());
    }
    public Sheep(int x, int y) {
        super(x, y);

    }

    @Override
    public String getSpecies() {
        return "sheep";
    }
}
