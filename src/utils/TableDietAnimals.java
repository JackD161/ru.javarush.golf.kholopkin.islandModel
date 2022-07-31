package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class TableDietAnimals {
    private static Map<String, Integer> wolf;
    private static Map<String, Integer> boa;
    private static Map<String, Integer> fox;
    private static Map<String, Integer> bear;
    private static Map<String, Integer> eagle;
    private static Map<String, Integer> horse;
    private static Map<String, Integer> deer;
    private static Map<String, Integer> rabbit;
    private static Map<String, Integer> mouse;
    private static Map<String, Integer> goat;
    private static Map<String, Integer> sheep;
    private static Map<String, Integer> boar;
    private static Map<String, Integer> buffalo;
    private static Map<String, Integer> duck;
    private static Map<String, Integer> caterpillar;

    static {
        try (FileInputStream fis = new FileInputStream("src/resources/diet.properties")) {
            Properties properties = new Properties();
            properties.load(fis);
            String[] species = properties.getProperty("species").split("/");
            String[] wolfList = properties.getProperty("wolf").split("/");
            String[] boaList = properties.getProperty("boa").split("/");
            String[] foxList = properties.getProperty("fox").split("/");
            String[] bearList = properties.getProperty("bear").split("/");
            String[] eagleList = properties.getProperty("eagle").split("/");
            String[] horseList = properties.getProperty("horse").split("/");
            String[] deerList = properties.getProperty("deer").split("/");
            String[] rabbitList = properties.getProperty("rabbit").split("/");
            String[] mouseList = properties.getProperty("mouse").split("/");
            String[] goatList = properties.getProperty("goat").split("/");
            String[] sheepList = properties.getProperty("sheep").split("/");
            String[] boarList = properties.getProperty("boar").split("/");
            String[] buffaloList = properties.getProperty("buffalo").split("/");
            String[] duckList = properties.getProperty("duck").split("/");
            String[] caterpillarList = properties.getProperty("caterpillar").split("/");
            wolf = new HashMap<>();
            boa = new HashMap<>();
            fox = new HashMap<>();
            bear = new HashMap<>();
            eagle = new HashMap<>();
            horse = new HashMap<>();
            deer = new HashMap<>();
            rabbit = new HashMap<>();
            mouse = new HashMap<>();
            goat = new HashMap<>();
            sheep = new HashMap<>();
            boar = new HashMap<>();
            buffalo = new HashMap<>();
            duck = new HashMap<>();
            caterpillar = new HashMap<>();
            for (int i = 0; i < species.length; i++) {
                wolf.put(species[i], Integer.parseInt(wolfList[i]));
                boa.put(species[i], Integer.parseInt(boaList[i]));
                fox.put(species[i], Integer.parseInt(foxList[i]));
                bear.put(species[i], Integer.parseInt(bearList[i]));
                eagle.put(species[i], Integer.parseInt(eagleList[i]));
                horse.put(species[i], Integer.parseInt(horseList[i]));
                deer.put(species[i], Integer.parseInt(deerList[i]));
                rabbit.put(species[i], Integer.parseInt(rabbitList[i]));
                mouse.put(species[i], Integer.parseInt(mouseList[i]));
                goat.put(species[i], Integer.parseInt(goatList[i]));
                sheep.put(species[i], Integer.parseInt(sheepList[i]));
                boar.put(species[i], Integer.parseInt(boaList[i]));
                buffalo.put(species[i], Integer.parseInt(buffaloList[i]));
                duck.put(species[i], Integer.parseInt(duckList[i]));
                caterpillar.put(species[i], Integer.parseInt(caterpillarList[i]));
            }
        }
        catch (IOException e) {
            System.err.print("Что то пошло не так при загрузке параметров вероятности пожирания животных друг другом, используем стандартные параметры");
            initializeDefault();
        }
    }

    public static void main(String[] args) {
        for (Map.Entry<String, Integer> pair : wolf.entrySet()) {
            System.out.println(pair.getKey() + " / " + pair.getValue());
        }
    }

    private static void initializeDefault() {

    }

    public static Map<String, Integer> getWolf() {
        return wolf;
    }

    public static Map<String, Integer> getBoa() {
        return boa;
    }

    public static Map<String, Integer> getFox() {
        return fox;
    }

    public static Map<String, Integer> getBear() {
        return bear;
    }

    public static Map<String, Integer> getEagle() {
        return eagle;
    }

    public static Map<String, Integer> getHorse() {
        return horse;
    }

    public static Map<String, Integer> getDeer() {
        return deer;
    }

    public static Map<String, Integer> getRabbit() {
        return rabbit;
    }

    public static Map<String, Integer> getMouse() {
        return mouse;
    }

    public static Map<String, Integer> getGoat() {
        return goat;
    }

    public static Map<String, Integer> getSheep() {
        return sheep;
    }

    public static Map<String, Integer> getBoar() {
        return boar;
    }

    public static Map<String, Integer> getBuffalo() {
        return buffalo;
    }

    public static Map<String, Integer> getDuck() {
        return duck;
    }

    public static Map<String, Integer> getCaterpillar() {
        return caterpillar;
    }
}
