package utils;
// универсальный потоковый генератор чисел
import java.util.concurrent.ThreadLocalRandom;

public class UniversalRandomizer {
    public static int getRandomInteger(int range) {
        return ThreadLocalRandom.current().nextInt(range);
    }
    public static int getRandomIntegerFromRange(int from, int to) {
        return ThreadLocalRandom.current().nextInt(from, to);
    }
    public static float getRandomFloat() {
        return ThreadLocalRandom.current().nextFloat();
    }
}
