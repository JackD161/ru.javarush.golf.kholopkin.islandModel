package animals.herbivorous;

import utils.PropertiesIsland;
import utils.UniversalRandomizer;

// гусеница
public class Caterpillar extends Herbivorous{
    {
        icon = PropertiesIsland.getCaterpillarIcon();
        diet = PropertiesIsland.getCaterpillar();
        weight = UniversalRandomizer.getRandomInteger(1) + UniversalRandomizer.getRandomFloat();
    }
    private float weight;
    public Caterpillar(int x, int y) {
        super(x, y);
    }

    @Override
    public String getSpecies() {
        return "caterpillar";
    }
}
