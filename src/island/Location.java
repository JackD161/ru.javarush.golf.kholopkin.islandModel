package island;

import animals.carnivores.Carnivore;
import animals.herbivorous.Herbivorous;
import plants.Plant;

import java.util.ArrayList;
import java.util.List;

public class Location {

    private int x;
    private int y;
    // Списки где будут хранитсья находящиеся на локации сущности
    List<Herbivorous> herbivorous = new ArrayList<>();
    List<Carnivore> carnivores = new ArrayList<>();
    List<Plant> plants = new ArrayList<>();

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // метод возвращает координаты локации
    public int[] getCoordinates() {
        return new int[]{x, y};
    }
/*
    // ОПИСЫВАЕМ СОБЫТИЯ НА ЛОКАЦИИ
    public void calculate() {

        // В ЦИКЛЕ ПЕРЕБИРАЕМ ХИЩНИКОВ ИЗ ЛИСТА
        // И КАЖДОМУ ПО ОЧЕРЕДИ СУЕМ СПИСОК ТРАВОЯДНЫХ
        for (int i = 0; i < carnivores.size(); i++) {
            Carnivore carnivore = carnivores.get(i);
            carnivore.eat(herbivorous);

            // РАЗМНОЖАЕМСЯ
            carnivore.reproduce();

            // ДВИГАЕМСЯ
            carnivore.chooseDirection();
        }

        // ТО ЖЕ САМОЕ ДЕЛАЕМ ДЛЯ ТРАВОЯДНЫХ

        for (int i = 0; i < herbivores.size(); i++) {
            // ... //
        }

    }
*/
    @Override
    public String toString() {
        return " | | ";
    }
}
