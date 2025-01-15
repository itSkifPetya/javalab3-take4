package abstracts;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 0;
        for (int i = 0; i < getClass().getName().length(); i++) {
            hash = 31 * hash + getClass().getName().charAt(i);
        }
        return hash + Objects.hashCode(name) ;
    }

    abstract public String getName();
}
