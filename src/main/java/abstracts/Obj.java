package abstracts;

abstract public class Obj {
    private final String name;

    protected Obj(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[name=" + name + "]";
    }

    @Override
    public boolean equals(Object otherObject) {
//        if (this == otherObject) return true; TODO: оно как бы верно, но это абстрактный класс; добавить в дочерках
        if (!(otherObject instanceof Obj)) return false;
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;
        return name.equals(((Obj) otherObject).name);
    }

    abstract public String getName();
}
