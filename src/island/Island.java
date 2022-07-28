package island;

import utils.PropertiesIsland;

public class Island {

    PropertiesIsland propertiesIsland = new PropertiesIsland();
    Location[][] locations = new Location[propertiesIsland.getSizeHorizontal()][propertiesIsland.getSizeVertical()];

    public void initialize(){
        for (int x = 0; x < locations.length; x++) {
            for (int y = 0; y < locations[x].length; y++) {
                Location location = new Location(x, y);
                location.initWolf(propertiesIsland.getMaxCntWolf());
                location.initSheep(propertiesIsland.getMaxCntSheep());
                location.initPlants(propertiesIsland.getCntPlants());
                locations[x][y] = location;
            }
        }
    }

    public void print(){
        for (int x = 0; x < locations.length; x++) {
            for (int y = 0; y < locations[x].length; y++) {
                System.out.print(locations[x][y]);
            }
            System.out.println();
        }
    }

}
