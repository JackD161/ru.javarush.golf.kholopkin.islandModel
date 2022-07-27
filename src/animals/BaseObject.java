package animals;
// базовый класс всех сущностей на острове
public class BaseObject {
    // у объекта на карте должны быть координаты
    private int x;
    private int y;

    // у объекта есть запас прочности (здоровья для животных)
    private int health;

    // метод возвращает координаты объекта
    public int[] getCoordinates() {
        return new int[]{x, y};
    }
}
