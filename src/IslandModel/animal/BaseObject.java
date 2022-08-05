package IslandModel.animal;

import java.util.Map;

// базовый класс всех сущностей на острове
public abstract class BaseObject {

    // у объекта есть запас прочности (здоровья для животных)
    protected int health;
    // каждое животное обладает весом
    protected int weight;
    protected static int INDEXanimal = 0;
    protected String name;

    public abstract String getSpecies();

    public String getName() {
        return name;
    }

    public BaseObject() {
        name = getSpecies() + ++INDEXanimal;
    }


    public int getFood() {
        return (int) weight / 3;
    }
}
