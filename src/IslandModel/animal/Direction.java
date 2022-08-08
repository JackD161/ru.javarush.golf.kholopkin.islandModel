package IslandModel.animal;

public enum Direction {
    UP("В верх"),
    DOWN("В низ"),
    LEFT("В лево"),
    RIGHT("В право"),
    HOLD("На месте");

    private String direction;
    private Direction(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString(){
        return direction;
    }
}
