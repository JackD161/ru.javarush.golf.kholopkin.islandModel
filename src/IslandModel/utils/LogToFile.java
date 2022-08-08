package IslandModel.utils;

import java.io.IOException;
import java.util.logging.*;

public class LogToFile{
    private static Logger logger;
    static {
        logger = Logger.getLogger("ru.javarush.golf.kholopkin.islandModel");
        FileHandler fileHandler;
        try {
            fileHandler = new FileHandler("src/IslandModel/resources/log.txt");
            logger.addHandler(fileHandler);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public LogToFile() {

    }
    public void log(String msg) {
        logger.log(Level.INFO, msg);
    }
}
