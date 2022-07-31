package animals.herbivorous;
// олень
public class Deer extends Herbivorous{
    public Deer(int x, int y) {
        super(x, y);
    }

    @Override
    public String getSpecies() {
        return "deer";
    }
}
