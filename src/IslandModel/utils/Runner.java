package IslandModel.utils;

import IslandModel.island.Island;

public class Runner {
    public static void main(String[] args) {

        Island island = new Island();
        island.print();
        island.initialize();
        island.print();
    }
}