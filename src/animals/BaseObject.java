package animals;
// базовый класс всех сущностей на острове
public abstract class BaseObject {

    private int x;
    private int y;

    public BaseObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // у объекта есть запас прочности (здоровья для животных)
    private int health;

    //у объекта есть иконка для отображения
    public String icon;


}
