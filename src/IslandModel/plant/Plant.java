package IslandModel.plant;
// базовый класс растений
import IslandModel.animal.BaseObject;
import IslandModel.utils.PropertiesIsland;

public class Plant extends BaseObject {
    public static String icon = PropertiesIsland.getPlantIcon();
    public Plant() {
    }

    @Override
    public String getSpecies() {
        return "plant";
    }
}
