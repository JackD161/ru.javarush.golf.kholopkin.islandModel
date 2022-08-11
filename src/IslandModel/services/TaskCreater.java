package IslandModel.services;

import IslandModel.island.Island;
import IslandModel.island.Location;
import IslandModel.utils.PropertiesIsland;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class TaskCreater implements Runnable{
    private final Island island;
    private final Queue<Task> tasks = new ConcurrentLinkedQueue<>();

    public TaskCreater(Island island, Location location) {
        this.island = island;
    }
    @Override
    public void run() {
        for (int x = 0; x < PropertiesIsland.getSizeHorizontal(); x++) {
            for (int y = 0; y < PropertiesIsland.getSizeVertical(); y++) {
                createTask(island, island.getLocationByCoordinates(x, y));
            }
        }
    }

    private void createTask(Island island, Location location) {
        if (location != null) {
            location.getLock().lock();
            try {
                tasks.add(new Task(island, location));
            } finally {
                location.getLock().unlock();
            }
        }
        tasks.forEach(Task::work);
        tasks.clear();
    }

}
