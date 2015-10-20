public class City implements Displayable {
    private int x, y;
    private String name;
    private int index;

    City(int index, String name, int x, int y) {
        this.index = index;
        this.name = name;
        this.x = x;
        this.y = y;
    }

    @Override
    public int getIndex() {
        return index;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public String getName() {
        return name;
    }
}
