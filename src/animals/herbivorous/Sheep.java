package animals.herbivorous;
// овца
public class Sheep extends Herbivorous{
    {
        icon = "\uD83D\uDC11";
    }
    public Sheep(int x, int y) {
        super(x, y);

    }

    @Override
    public String getSpecies() {
        return "sheep";
    }
}
