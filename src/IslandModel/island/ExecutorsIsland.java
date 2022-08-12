package IslandModel.island;

import IslandModel.services.PlantGrass;
import IslandModel.services.ShowStatistic;
import IslandModel.services.TaskCreater;
import IslandModel.utils.PropertiesIsland;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorsIsland {
    public ExecutorsIsland(Island island) {
        ScheduledExecutorService executorService = java.util.concurrent.Executors.newScheduledThreadPool(2);
        executorService.scheduleAtFixedRate(new PlantGrass(island), 0, 20, TimeUnit.SECONDS);
        executorService.scheduleAtFixedRate(new ShowStatistic(island), 0, 10, TimeUnit.SECONDS);
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(PropertiesIsland.getNumberOfThreads());
        fixedThreadPool.submit(new TaskCreater(island));
    }
}
