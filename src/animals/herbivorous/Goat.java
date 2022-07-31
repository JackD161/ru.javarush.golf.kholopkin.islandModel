package animals.herbivorous;
// козел
public class Goat extends Herbivorous{
    public Goat(int x, int y) {
        super(x, y);
    }

    @Override
    public String getSpecies() {
        return "goat";
    }
}
