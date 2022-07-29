package plants;
// базовый класс растений
import animals.BaseObject;

public class Plant extends BaseObject {
    {
        icon = "\uD83C\uDF3F";
    }
    public Plant(int x, int y) {
        super(x, y);
    }
}
