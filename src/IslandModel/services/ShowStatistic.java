package IslandModel.services;

import IslandModel.island.Island;

public class ShowStatistic implements Runnable{
    private final Island island;
    public ShowStatistic(Island island) {
        this.island = island;
    }

    @Override
    public void run() {
        island.print();
    }
}
