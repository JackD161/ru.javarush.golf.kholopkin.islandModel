package animals.herbivorous;

import utils.PropertiesIsland;
import utils.UniversalRandomizer;

// мышь
public class Mouse extends Herbivorous{
    {
        icon = PropertiesIsland.getMouseIcon();
        diet = PropertiesIsland.getMouse();
        weight = UniversalRandomizer.getRandomInteger(1) + UniversalRandomizer.getRandomFloat();
    }
    public Mouse(int x, int y) {
        super(x, y);
    }
    private float weight;

    @Override
    public String getSpecies() {
        return "mouse";
    }
}
