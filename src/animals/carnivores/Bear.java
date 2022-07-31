package animals.carnivores;
// медведь
public class Bear extends Carnivore{
    public Bear(int x, int y) {
        super(x, y);
    }

    @Override
    public String getSpecies() {
        return "bear";
    }
}
