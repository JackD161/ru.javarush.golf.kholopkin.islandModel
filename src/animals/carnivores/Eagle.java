package animals.carnivores;
// орел
import animals.CanFly;
import animals.Direction;
import utils.PropertiesIsland;
import utils.UniversalRandomizer;

public class Eagle extends Carnivore implements CanFly {
    {
        icon = 	PropertiesIsland.getEagleIcon();
        diet = PropertiesIsland.getEagle();
        weight = UniversalRandomizer.getRandomInteger(PropertiesIsland.getWeightEagle());
    }
    public Eagle(int x, int y) {
        super(x, y);
    }

    @Override
    public String getSpecies() {
        return "eagle";
    }

    @Override
    public void fly(Direction direction) {

    }
}
