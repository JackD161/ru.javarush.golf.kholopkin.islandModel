package animals;
// базовый класс всех сущностей на острове
public abstract class BaseObject {

    protected int x;
    protected int y;

    public BaseObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // у объекта есть запас прочности (здоровья для животных)
    protected int health;

    //у объекта есть иконка для отображения
    public String icon;


}
