package island;

import utils.PropertiesIsland;

public class Island {

    PropertiesIsland propertiesIsland = new PropertiesIsland();
    Location[][] locations = new Location[propertiesIsland.getSizeHorizontal()][propertiesIsland.getSizeVertical()];

    public void initialize(){
        for (int i = 0; i < locations.length; i++) {
            for (int j = 0; j < locations[i].length; j++) {
                locations[i][j] = new Location();
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
