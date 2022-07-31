package animals.carnivores;
// удав
public class Boa extends Carnivore{
    public Boa(int x, int y) {
        super(x, y);
    }

    @Override
    public String getSpecies() {
        return "boa";
    }
}
