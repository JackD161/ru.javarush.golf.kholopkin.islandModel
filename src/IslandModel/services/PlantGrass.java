package IslandModel.services;

import IslandModel.island.Island;
import IslandModel.utils.PropertiesIsland;

public class PlantGrass implements Runnable{
    private final Island island;
    public PlantGrass(Island island) {
        this.island = island;
    }

    @Override
    public void run() {
        for (int x = 0; x < PropertiesIsland.getSizeHorizontal(); x++) {
            for (int y = 0; y < PropertiesIsland.getSizeVertical(); y++) {
                island.getLocationByCoordinates(x, y).plantGrass();
            }
        }
    }
}
