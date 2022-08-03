package IslandModel.animal;
// базовый класс всех сущностей на острове
public abstract class BaseObject {

    // у объекта есть запас прочности (здоровья для животных)
    protected int health;

    public abstract String getSpecies();
}
