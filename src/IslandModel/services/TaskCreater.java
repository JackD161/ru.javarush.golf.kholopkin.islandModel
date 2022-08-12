package IslandModel.services;

import IslandModel.island.Island;
import IslandModel.island.Location;
import IslandModel.utils.PropertiesIsland;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class TaskCreater implements Runnable{
    private final Island island;
    private final Queue<Task> tasks = new ConcurrentLinkedQueue<>();

    public TaskCreater(Island island) {
        this.island = island;
    }
    @Override
    public void run() {
        for (int x = 0; x < PropertiesIsland.getSizeHorizontal(); x++) {
            for (int y = 0; y < PropertiesIsland.getSizeVertical(); y++) {
                createTask(island, x, y);
            }
        }
    }

    private void createTask(Island island, int x, int y) {
        Location location = island.getLocationByCoordinates(x, y);
        if (location != null) {
            location.getLock().lock();
            try {
                tasks.add(new Task(island, x, y));
            } finally {
                location.getLock().unlock();
            }
        }
        tasks.forEach(Task::work);
        tasks.clear();
    }

}
