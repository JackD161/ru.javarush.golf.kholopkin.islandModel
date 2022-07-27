package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesIsland {

    {
        try (InputStream inputStream = getClass().getResourceAsStream("island.properties")) {
            Properties properties = new Properties();
            properties.load(inputStream);
        }
        catch (IOException e) {
            System.err.print("Что то пошло не так при загрузке параметров острова из файла, используем стандартные параметры");
            initializeDefaultProperties();
        }
    }

    // размер задается в клетках
    private int sizeHorizontal;
    private int sizeVertical;
    // длятельность симуляции задается в часах
    private int simulationDuration;
    // количество травоядных на начало симуляции
    private int countHerbivorous;
    // количество плотоядных на начало симуляции
    private int countCarnivores;
    private void initializeDefaultProperties() {
        sizeHorizontal = 100;
        sizeVertical = 20;
        simulationDuration = 5;
        countCarnivores = 50;
        countHerbivorous = 50;
    }

    public int getSizeHorizontal() {
        return sizeHorizontal;
    }

    public int getSizeVertical() {
        return sizeVertical;
    }

    public int getSimulationDuration() {
        return simulationDuration;
    }

    public int getCountHerbivorous() {
        return countHerbivorous;
    }

    public int getCountCarnivores() {
        return countCarnivores;
    }
}
