package animals.herbivorous;

import utils.PropertiesIsland;
import utils.UniversalRandomizer;

// кролик
public class Rabbit extends Herbivorous{
    {
        icon = PropertiesIsland.getRabbitIcon();
        diet = PropertiesIsland.getRabbit();
        weight = UniversalRandomizer.getRandomInteger(PropertiesIsland.getWeightRabbit());
    }
    public Rabbit(int x, int y) {
        super(x, y);
    }

    @Override
    public String getSpecies() {
        return "rabbit";
    }
}
