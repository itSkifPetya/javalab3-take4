package objects;

abstract public class Obj {
    private final String name;

    protected Obj(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
