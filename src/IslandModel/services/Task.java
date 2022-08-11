package IslandModel.services;

import IslandModel.island.Island;
import IslandModel.island.Location;

public class Task {
    private final Island island;
    private final Location location;
    public Task(Island island, Location location) {
        this.island = island;
        this.location = location;
    }
    public void work() {
        if (location.eatAnimals() && location.reproduceAnimals()) {
            if (location.lifeCycleAnimals())
                location.moveAnimalsOnLocation(island, location);
        }
    }
}
