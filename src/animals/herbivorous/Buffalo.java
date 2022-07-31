package animals.herbivorous;
// бык
public class Buffalo extends Herbivorous {
    public Buffalo(int x, int y) {
        super(x, y);
    }

    @Override
    public String getSpecies() {
        return "buffalo";
    }
}
