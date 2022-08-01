package animals.carnivores;

import utils.PropertiesIsland;
import utils.UniversalRandomizer;

// кабан
public class Boar extends Carnivore {
    {
        icon = PropertiesIsland.getBoarIcon();
        diet = PropertiesIsland.getBoar();
        weight = UniversalRandomizer.getRandomInteger(PropertiesIsland.getWeightBoar());
    }
    public Boar(int x, int y) {
        super(x, y);
    }

    private int weight;

    @Override
    public String getSpecies() {
        return "boar";
    }
}
