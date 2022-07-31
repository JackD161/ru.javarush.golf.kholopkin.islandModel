package animals.carnivores;
// лиса
public class Fox extends Carnivore{
    public Fox(int x, int y) {
        super(x, y);
    }

    @Override
    public String getSpecies() {
        return "fox";
    }
}
