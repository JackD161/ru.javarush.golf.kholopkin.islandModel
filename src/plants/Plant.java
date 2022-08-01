package plants;
// базовый класс растений
import animals.BaseObject;
import utils.PropertiesIsland;

public class Plant extends BaseObject {
    {
        icon = PropertiesIsland.getPlantIcon();
    }
    public Plant(int x, int y) {
        super(x, y);
    }

    @Override
    public String getSpecies() {
        return "plant";
    }
}
