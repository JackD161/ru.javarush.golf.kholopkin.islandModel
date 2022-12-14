package IslandModel.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertiesIsland {
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
    // размер задается в клетках
    private static int sizeHorizontal;
    private static int sizeVertical;
    // длятельность симуляции задается в часах
    private static int simulationDuration;
    // количество травоядных на начало симуляции
    private static int countHerbivorous;
    // количество плотоядных на начало симуляции
    private static int countCarnivores;
    // максимальное количество волков на локации
    private static int maxCntWolf;
    // максимальное количество овец на локации
    private static int maxCntSheep;
    // максимальное количество медведей на локации
    private static int maxCntBear;
    // максимальное количество удавов на локации
    private static int maxCntBoa;
    // максимальное количество лис на локации
    private static int maxCntFox;
    // максимальное количество орлов на локации
    private static int maxCntEagle;
    // максимальное количество лошадей на локации
    private static int maxCntHorse;
    // максимальное количество оленей на локации
    private static int  maxCntDeer;
    // максимальное количество кроликов на локации
    private static int maxCntRabbit;
    // максимальное количество мышей на локации
    private static int maxCntMouse;
    // максимальное количество коз на локации
    private static int maxCntGoat;
    // максимальное количество кабанов на локации
    private static int maxCntBoar;
    // максимальное количество буйволов на локации
    private static int maxCntBuffalo;
    // максимальное количество уток на локации
    private static int maxCntDuck;
    // максимальное количество гусениц на локации
    private static int maxCntCaterpillar;
    // количество растений на локацит
    private static int cntPlants;
    // количество передвижений за ход овцы
    private static int moveCellSheep;

    // количество потоков в приложении
    private static int numberOfThreads;
    // количество передвижений за ход волка
    private static int moveCellWolf;
    private static String bearIcon;
    private static String boaIcon;
    private static String boarIcon;
    private static String eagleIcon;
    private static String foxIcon;
    private static String wolfIcon;
    private static String buffaloIcon;
    private static String caterpillarIcon;
    private static String deerIcon;
    private static String duckIcon;
    private static String goatIcon;
    private static String horseIcon;
    private static String mouseIcon;
    private static String rabbitIcon;
    private static String sheepIcon;
    private static String plantIcon;
    private static int weightWolf;
    private static int weightBoa;
    private static int weightFox;
    private static int weightBear;
    private static int weightEagle;
    private static int weightHorse;
    private static int weightDeer;
    private static int weightRabbit;
    private static float weightMouse;
    private static int weightGoat;
    private static int weightSheep;
    private static int weightBoar;
    private static int weightBuffalo;
    private static float weightDuck;
    private static float weightCaterpillar;
    private static int weightPlant;
    private static int maxPopulationToReproduceBear;
    private static int maxPopulationToReproduceBoa;
    private static int maxPopulationToReproduceEagle;
    private static int  maxPopulationToReproduceFox;
    private static int maxPopulationToReproduceWolf;
    private static int maxPopulationToReproduceBoar;
    private static int maxPopulationToReproduceBuffalo;
    private static int maxPopulationToReproduceCaterpillar;
    private static int maxPopulationToReproduceDeer;
    private static int maxPopulationToReproduceDuck;
    private static int maxPopulationToReproduceGoat;
    private static int maxPopulationToReproduceHorse;
    private static int maxPopulationToReproduceMouse;
    private static int maxPopulationToReproduceRabbit;
    private static int maxPopulationToReproduceSheep;


    static {
        try (FileInputStream fis = new FileInputStream("src/IslandModel/resources/island.properties")) {
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
                boar.put(species[i], Integer.parseInt(boarList[i]));
                buffalo.put(species[i], Integer.parseInt(buffaloList[i]));
                duck.put(species[i], Integer.parseInt(duckList[i]));
                caterpillar.put(species[i], Integer.parseInt(caterpillarList[i]));
            }
            sizeHorizontal = Integer.parseInt(properties.getProperty("sizeHorizontal", "100"));
            sizeVertical = Integer.parseInt(properties.getProperty("sizeVertical", "20"));
            simulationDuration = Integer.parseInt(properties.getProperty("simulationDuration", "5"));
            numberOfThreads = Integer.parseInt(properties.getProperty("numberOfThreads", "2"));
            countHerbivorous = Integer.parseInt(properties.getProperty("countHerbivorous", "50"));
            countCarnivores = Integer.parseInt(properties.getProperty("countCarnivores", "50"));
            maxCntWolf = Integer.parseInt(properties.getProperty("maxCntWolf", "30"));
            maxCntSheep = Integer.parseInt(properties.getProperty("maxCntSheep", "140"));
            maxCntBear = Integer.parseInt(properties.getProperty("maxCntBear", "5"));
            maxCntBoa = Integer.parseInt(properties.getProperty("maxCntBoa", "30"));
            maxCntFox = Integer.parseInt(properties.getProperty("maxCntFox", "30"));
            maxCntEagle = Integer.parseInt(properties.getProperty("maxCntEagle", "20"));
            maxCntHorse = Integer.parseInt(properties.getProperty("maxCntHorse", "20"));
            maxCntDeer = Integer.parseInt(properties.getProperty("maxCntDeer", "20"));
            maxCntRabbit = Integer.parseInt(properties.getProperty("maxCntRabbit", "150"));
            maxCntMouse = Integer.parseInt(properties.getProperty("maxCntMouse", "500"));
            maxCntGoat = Integer.parseInt(properties.getProperty("maxCntGoat", "140"));
            maxCntBoar = Integer.parseInt(properties.getProperty("maxCntBoar", "50"));
            maxCntBuffalo = Integer.parseInt(properties.getProperty("maxCntBuffalo", "10"));
            maxCntDuck = Integer.parseInt(properties.getProperty("maxCntDuck", "200"));
            maxCntCaterpillar = Integer.parseInt(properties.getProperty("maxCntCaterpillar", "1000"));
            cntPlants = Integer.parseInt(properties.getProperty("cntPlants", "200"));
            moveCellSheep = Integer.parseInt(properties.getProperty("moveCellSheep", "3"));
            moveCellWolf = Integer.parseInt(properties.getProperty("moveCellWolf", "3"));
            bearIcon = properties.getProperty("bearIcon", "\uD83D\uDC3B");
            boaIcon = properties.getProperty("boaIcon", "\uD83D\uDC0D");
            boarIcon = properties.getProperty("boarIcon", "\uD83D\uDC17");
            eagleIcon = properties.getProperty("eagleIcon", "\uD83E\uDD85");
            foxIcon = properties.getProperty("foxIcon", "\uD83E\uDD8A");
            wolfIcon = properties.getProperty("wolfIcon", "\uD83D\uDC3A");
            buffaloIcon = properties.getProperty("buffaloIcon", "\uD83D\uDC03");
            caterpillarIcon = properties.getProperty("caterpillarIcon", "\uD83D\uDC1B");
            deerIcon = properties.getProperty("deerIcon", "\uD83E\uDD8C");
            duckIcon = properties.getProperty("duckIcon", "\uD83E\uDD86");
            goatIcon = properties.getProperty("goatIcon", "\uD83D\uDC10");
            horseIcon = properties.getProperty("horseIcon", "\uD83D\uDC0E");
            mouseIcon = properties.getProperty("mouseIcon", "\uD83D\uDC01");
            rabbitIcon = properties.getProperty("rabbitIcon", "\uD83D\uDC07");
            sheepIcon = properties.getProperty("sheepIcon", "\uD83D\uDC11");
            plantIcon = properties.getProperty("plantIcon", "\uD83C\uDF3F");
            weightWolf = Integer.parseInt(properties.getProperty("weightWolf", "50"));
            weightBoa = Integer.parseInt(properties.getProperty("weightBoa", "15"));
            weightFox = Integer.parseInt(properties.getProperty("weightFox", "8"));
            weightBear = Integer.parseInt(properties.getProperty("weightBear", "500"));
            weightEagle = Integer.parseInt(properties.getProperty("weightEagle", "6"));
            weightHorse = Integer.parseInt(properties.getProperty("weightHorse", "400"));
            weightDeer = Integer.parseInt(properties.getProperty("weightDeer", "300"));
            weightRabbit = Integer.parseInt(properties.getProperty("weightRabbit", "2"));
            weightMouse = Float.parseFloat(properties.getProperty("weightMouse", "0.05"));
            weightGoat = Integer.parseInt(properties.getProperty("weightGoat", "60"));
            weightSheep = Integer.parseInt(properties.getProperty("weightSheep", "70"));
            weightBoar = Integer.parseInt(properties.getProperty("weightBoar", "400"));
            weightBuffalo = Integer.parseInt(properties.getProperty("weightBuffalo", "700"));
            weightDuck = Float.parseFloat(properties.getProperty("weightDuck", "1"));
            weightCaterpillar = Float.parseFloat(properties.getProperty("weightCaterpillar", "0.01"));
            weightPlant = Integer.parseInt(properties.getProperty("weightPlant", "1"));
            maxPopulationToReproduceBear = Integer.parseInt(properties.getProperty("maxPopulationToReproduceBear", "4"));
            maxPopulationToReproduceBoa = Integer.parseInt(properties.getProperty("maxPopulationToReproduceBoa", "8"));
            maxPopulationToReproduceEagle = Integer.parseInt(properties.getProperty("maxPopulationToReproduceEagle", "3"));
            maxPopulationToReproduceFox = Integer.parseInt(properties.getProperty("maxPopulationToReproduceFox", "4"));
            maxPopulationToReproduceWolf = Integer.parseInt(properties.getProperty("maxPopulationToReproduceWolf", "4"));
            maxPopulationToReproduceBoar = Integer.parseInt(properties.getProperty("maxPopulationToReproduceBoar", "6"));
            maxPopulationToReproduceBuffalo = Integer.parseInt(properties.getProperty("maxPopulationToReproduceBuffalo", "2"));
            maxPopulationToReproduceCaterpillar = Integer.parseInt(properties.getProperty("maxPopulationToReproduceCaterpillar", "10"));
            maxPopulationToReproduceDeer = Integer.parseInt(properties.getProperty("maxPopulationToReproduceDeer", "2"));
            maxPopulationToReproduceDuck = Integer.parseInt(properties.getProperty("maxPopulationToReproduceDuck", "6"));
            maxPopulationToReproduceGoat = Integer.parseInt(properties.getProperty("maxPopulationToReproduceGoat", "3"));
            maxPopulationToReproduceHorse = Integer.parseInt(properties.getProperty("maxPopulationToReproduceHorse", "1"));
            maxPopulationToReproduceMouse = Integer.parseInt(properties.getProperty("maxPopulationToReproduceMouse", "15"));
            maxPopulationToReproduceRabbit = Integer.parseInt(properties.getProperty("maxPopulationToReproduceRabbit", "20"));
            maxPopulationToReproduceSheep = Integer.parseInt(properties.getProperty("maxPopulationToReproduceSheep", "4"));
        }
        catch (IOException e) {
            System.err.print("Что то пошло не так при загрузке параметров острова из файла, используем стандартные параметры");
            initializeDefaultProperties();
        }
    }
    public static int getMaxCntSheep() {
        return maxCntSheep;
    }

    public static int getMaxCntBear() {
        return maxCntBear;
    }

    private static void initializeDefaultProperties() {
        sizeHorizontal = 100;
        sizeVertical = 20;
        simulationDuration = 5;
        numberOfThreads = 2;
        countCarnivores = 50;
        countHerbivorous = 50;
        maxCntWolf = 30;
        maxCntSheep = 140;
        cntPlants = 200;
        moveCellWolf = 3;
        moveCellSheep = 3;
        maxCntBear = 5;
        maxCntBoa = 30;
        maxCntFox = 30;
        maxCntEagle = 20;
        maxCntHorse = 20;
        maxCntDeer = 20;
        maxCntRabbit = 150;
        maxCntMouse = 500;
        maxCntGoat = 140;
        maxCntBoar = 50;
        maxCntBuffalo = 10;
        maxCntDuck = 200;
        maxCntCaterpillar = 1000;
        bearIcon = "\uD83D\uDC3B";
        boaIcon = "\uD83D\uDC0D";
        boarIcon = "\uD83D\uDC17";
        eagleIcon = "\uD83E\uDD85";
        foxIcon = "\uD83E\uDD8A";
        wolfIcon = "\uD83D\uDC3A";
        buffaloIcon = "\uD83D\uDC03";
        caterpillarIcon = "\uD83D\uDC1B";
        deerIcon = "\uD83E\uDD8C";
        duckIcon = "\uD83E\uDD86";
        goatIcon = "\uD83D\uDC10";
        horseIcon = "\uD83D\uDC0E";
        mouseIcon = "\uD83D\uDC01";
        rabbitIcon = "\uD83D\uDC07";
        sheepIcon = "\uD83D\uDC11";
        plantIcon = "\uD83C\uDF3F";
        weightWolf = 50;
        weightBoa = 15;
        weightFox = 8;
        weightBear = 500;
        weightEagle = 6;
        weightHorse = 400;
        weightDeer = 300;
        weightRabbit = 2;
        weightMouse = 0.05f;
        weightGoat = 60;
        weightSheep = 70;
        weightBoar = 400;
        weightBuffalo = 700;
        weightDuck = 1f;
        weightCaterpillar = 0.01f;
        weightPlant = 1;
        String[] species = "wolf boa fox bear eagle horse deer rabbit mouse goat sheep boar buffalo duck caterpillar plant".split(" ");
        String[] wolfList = "0/0/0/0/0/10/15/60/80/60/70/15/10/40/0/0".split("/");
        String[] boaList = "0/0/15/0/0/0/0/20/40/0/0/0/0/0/10/0/0".split("/");
        String[] foxList = "0/0/0/0/0/0/0/70/90/0/0/0/0/60/40/0".split("/");
        String[] bearList = "0/80/0/0/0/40/80/80/90/70/70/50/20/10/0/0".split("/");
        String[] eagleList = "0/0/10/0/0/0/0/90/90/0/0/0/0/80/0/0".split("/");
        String[] horseList = "0/0/0/0/0/0/0/0/0/0/0/0/0/0/0/100".split("/");
        String[] deerList = "0/0/0/0/0/0/0/0/0/0/0/0/0/0/0/100".split("/");
        String[] rabbitList = "0/0/0/0/0/0/0/0/0/0/0/0/0/0/0/100".split("/");
        String[] mouseList = "0/0/0/0/0/0/0/0/0/0/0/0/0/0/0/100".split("/");
        String[] goatList = "0/0/0/0/0/0/0/0/0/0/0/0/0/0/0/100".split("/");
        String[] sheepList = "0/0/0/0/0/0/0/0/0/0/0/0/0/0/0/100".split("/");
        String[] boarList = "0/0/0/0/0/0/0/0/50/0/0/0/0/0/90/100".split("/");
        String[] buffaloList = "0/0/0/0/0/0/0/0/0/0/0/0/0/0/0/100".split("/");
        String[] duckList = "0/0/0/0/0/0/0/0/0/0/0/0/0/0/90/100".split("/");
        String[] caterpillarList = "0/0/0/0/0/0/0/0/0/0/0/0/0/0/0/100".split("/");
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
            boar.put(species[i], Integer.parseInt(boarList[i]));
            buffalo.put(species[i], Integer.parseInt(buffaloList[i]));
            duck.put(species[i], Integer.parseInt(duckList[i]));
            caterpillar.put(species[i], Integer.parseInt(caterpillarList[i]));
        }
        maxPopulationToReproduceBear = 4;
        maxPopulationToReproduceBoa = 8;
        maxPopulationToReproduceEagle = 3;
        maxPopulationToReproduceFox = 4;
        maxPopulationToReproduceWolf = 4;
        maxPopulationToReproduceBoar = 6;
        maxPopulationToReproduceBuffalo = 2;
        maxPopulationToReproduceCaterpillar = 10;
        maxPopulationToReproduceDeer = 2;
        maxPopulationToReproduceDuck = 6;
        maxPopulationToReproduceGoat = 3;
        maxPopulationToReproduceHorse = 1;
        maxPopulationToReproduceMouse = 15;
        maxPopulationToReproduceRabbit = 20;
        maxPopulationToReproduceSheep = 4;
    }

    public static int getSizeHorizontal() {
        return sizeHorizontal;
    }

    public static int getSizeVertical() {
        return sizeVertical;
    }

    public static int getSimulationDuration() {
        return simulationDuration;
    }

    public static int getMoveCellSheep() {
        return moveCellSheep;
    }

    public static int getMoveCellWolf() {
        return moveCellWolf;
    }

    public static int getNumberOfThreads() {
        return numberOfThreads;
    }

    public static String getBearIcon() {
        return bearIcon;
    }

    public static String getBoaIcon() {
        return boaIcon;
    }

    public static String getBoarIcon() {
        return boarIcon;
    }

    public static String getPlantIcon() {
        return plantIcon;
    }

    public static String getEagleIcon() {
        return eagleIcon;
    }

    public static String getFoxIcon() {
        return foxIcon;
    }

    public static String getWolfIcon() {
        return wolfIcon;
    }

    public static String getSheepIcon() {
        return sheepIcon;
    }

    public static String getBuffaloIcon() {
        return buffaloIcon;
    }

    public static String getCaterpillarIcon() {
        return caterpillarIcon;
    }

    public static String getDeerIcon() {
        return deerIcon;
    }

    public static String getDuckIcon() {
        return duckIcon;
    }

    public static String getGoatIcon() {
        return goatIcon;
    }

    public static String getHorseIcon() {
        return horseIcon;
    }

    public static String getMouseIcon() {
        return mouseIcon;
    }

    public static String getRabbitIcon() {
        return rabbitIcon;
    }

    public static int getWeightWolf() {
        return weightWolf;
    }

    public static int getWeightBoa() {
        return weightBoa;
    }

    public static int getWeightFox() {
        return weightFox;
    }

    public static int getWeightBear() {
        return weightBear;
    }

    public static int getWeightEagle() {
        return weightEagle;
    }

    public static int getWeightHorse() {
        return weightHorse;
    }

    public static int getWeightDeer() {
        return weightDeer;
    }

    public static int getWeightRabbit() {
        return weightRabbit;
    }

    public static float getWeightMouse() {
        return weightMouse;
    }

    public static int getWeightGoat() {
        return weightGoat;
    }

    public static int getWeightSheep() {
        return weightSheep;
    }

    public static int getWeightBoar() {
        return weightBoar;
    }

    public static int getWeightBuffalo() {
        return weightBuffalo;
    }

    public static float getWeightDuck() {
        return weightDuck;
    }

    public static float getWeightCaterpillar() {
        return weightCaterpillar;
    }

    public static float getWeightPlant() {
        return weightPlant;
    }

    public static int getMaxCntWolf() {
        return maxCntWolf;
    }

    public static int getMaxCntBoa() {
        return maxCntBoa;
    }

    public static int getMaxCntFox() {
        return maxCntFox;
    }

    public static int getMaxCntEagle() {
        return maxCntEagle;
    }

    public static int getMaxCntHorse() {
        return maxCntHorse;
    }

    public static int getMaxCntDeer() {
        return maxCntDeer;
    }

    public static int getMaxCntRabbit() {
        return maxCntRabbit;
    }

    public static int getMaxCntMouse() {
        return maxCntMouse;
    }

    public static int getMaxCntGoat() {
        return maxCntGoat;
    }

    public static int getMaxCntBoar() {
        return maxCntBoar;
    }

    public static int getMaxCntBuffalo() {
        return maxCntBuffalo;
    }

    public static int getMaxCntDuck() {
        return maxCntDuck;
    }

    public static int getMaxCntCaterpillar() {
        return maxCntCaterpillar;
    }

    public static int getCntPlants() {
        return cntPlants;
    }

    public static int getMaxPopulationToReproduceBear() {
        return maxPopulationToReproduceBear + 1;
    }

    public static int getMaxPopulationToReproduceBoa() {
        return maxPopulationToReproduceBoa + 1;
    }

    public static int getMaxPopulationToReproduceEagle() {
        return maxPopulationToReproduceEagle + 1;
    }

    public static int getMaxPopulationToReproduceFox() {
        return maxPopulationToReproduceFox + 1;
    }

    public static int getMaxPopulationToReproduceWolf() {
        return maxPopulationToReproduceWolf + 1;
    }

    public static int getMaxPopulationToReproduceBoar() {
        return maxPopulationToReproduceBoar + 1;
    }

    public static int getMaxPopulationToReproduceBuffalo() {
        return maxPopulationToReproduceBuffalo + 1;
    }

    public static int getMaxPopulationToReproduceCaterpillar() {
        return maxPopulationToReproduceCaterpillar + 1;
    }

    public static int getMaxPopulationToReproduceDeer() {
        return maxPopulationToReproduceDeer + 1;
    }

    public static int getMaxPopulationToReproduceDuck() {
        return maxPopulationToReproduceDuck + 1;
    }

    public static int getMaxPopulationToReproduceGoat() {
        return maxPopulationToReproduceGoat + 1;
    }

    public static int getMaxPopulationToReproduceHorse() {
        return maxPopulationToReproduceHorse + 1;
    }

    public static int getMaxPopulationToReproduceMouse() {
        return maxPopulationToReproduceMouse + 1;
    }

    public static int getMaxPopulationToReproduceRabbit() {
        return maxPopulationToReproduceRabbit + 1;
    }

    public static int getMaxPopulationToReproduceSheep() {
        return maxPopulationToReproduceSheep + 1;
    }

    public static int getDietByAnimal(String hunter, String prey) {
        if (hunter.equals(prey))
            return 0;
        else {
            return switch (hunter) {
                case "bear" -> bear.get(prey);
                case "boa" -> boa.get(prey);
                case "boar" -> boar.get(prey);
                case "eagle" -> eagle.get(prey);
                case "fox" -> fox.get(prey);
                case "wolf" -> wolf.get(prey);
                case "buffalo" -> buffalo.get(prey);
                case "caterpillar" -> caterpillar.get(prey);
                case "deer" -> deer.get(prey);
                case "duck" -> duck.get(prey);
                case "goat" -> goat.get(prey);
                case "horse" -> horse.get(prey);
                case "mouse" -> mouse.get(prey);
                case "rabbit" -> rabbit.get(prey);
                case "sheep" -> sheep.get(prey);
                default -> 0;
            };
        }
    }
}
