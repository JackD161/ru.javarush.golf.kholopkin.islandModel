package island;

import utils.PropertiesIsland;

public class Island {

    PropertiesIsland propertiesIsland = new PropertiesIsland();
    Location[][] locations = new Location[propertiesIsland.getSizeHorizontal()][propertiesIsland.getSizeVertical()];

    public void initialize(){
        for (int x = 0; x < locations.length; x++) {
            for (int y = 0; y < locations[x].length; y++) {
                locations[x][y] = new Location(x, y);
            }
        }
    }

    public void print(){
        for (int i = 0; i < locations.length; i++) {
            for (int j = 0; j < locations[i].length; j++) {
                System.out.print(locations[i][j]);
            }
            System.out.println();
        }
    }

}
