package IslandModel.services;

import IslandModel.island.Island;
import IslandModel.island.Location;

public class Task {
    private final Island island;
    private final Location location;
    public Task(Island island, int x, int y) {
        this.island = island;
        this.location = island.getLocationByCoordinates(x, y);
    }
    public void work() {
        if (location.eatAnimals() && location.reproduceAnimals()) {
            if (location.lifeCycleAnimals())
                island.moveAnimalsOnLocation(location);
        }
    }
}
