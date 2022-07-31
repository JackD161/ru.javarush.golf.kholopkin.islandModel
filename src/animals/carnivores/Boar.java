package animals.carnivores;
// кабан
public class Boar extends Carnivore {
    public Boar(int x, int y) {
        super(x, y);
    }

    @Override
    public String getSpecies() {
        return "boar";
    }
}
