package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesIsland {



    {
        try (FileInputStream fis = new FileInputStream("src/resources/island.properties")) {
            Properties properties = new Properties();
            properties.load(fis);
            sizeHorizontal = Integer.parseInt(properties.getProperty("sizeHorizontal", "100"));
            sizeVertical = Integer.parseInt(properties.getProperty("sizeVertical", "20"));
            simulationDuration = Integer.parseInt(properties.getProperty("simulationDuration", "5"));
            countHerbivorous = Integer.parseInt(properties.getProperty("countHerbivorous", "50"));
            countCarnivores = Integer.parseInt(properties.getProperty("countCarnivores", "50"));
            maxCntWolf = Integer.parseInt(properties.getProperty("maxCntWolf", "30"));
            maxCntSheep = Integer.parseInt(properties.getProperty("maxCntSheep", "140"));
            cntPlants = Integer.parseInt(properties.getProperty("cntPlants", "200"));
            moveCellSheep = Integer.parseInt(properties.getProperty("moveCellSheep", "3"));
            moveCellWolf = Integer.parseInt(properties.getProperty("moveCellWolf", "3"));
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
    // максимальное количество волков на локации
    private int maxCntWolf;
    // максимальное количество овеч на локации
    private int maxCntSheep;
    // количество растений на локацит
    private int cntPlants;
    // количество передвижений за ход овцы
    private int moveCellSheep;
    // количество передвижений за ход волка
    private int moveCellWolf;

    public int getMaxCntSheep() {
        return maxCntSheep;
    }

    private void initializeDefaultProperties() {
        sizeHorizontal = 100;
        sizeVertical = 20;
        simulationDuration = 5;
        countCarnivores = 50;
        countHerbivorous = 50;
        maxCntWolf = 30;
        maxCntSheep = 140;
        cntPlants = 200;
        moveCellWolf = 3;
        moveCellSheep = 3;
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

    public int getMoveCellSheep() {
        return moveCellSheep;
    }

    public int getMoveCellWolf() {
        return moveCellWolf;
    }

    public int getCountHerbivorous() {
        return countHerbivorous;
    }

    public int getCountCarnivores() {
        return countCarnivores;
    }
    public int getMaxCntWolf() {
        return maxCntWolf;
    }

    public int getCntPlants() {
        return cntPlants;
    }

}
