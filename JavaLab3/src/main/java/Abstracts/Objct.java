package Abstracts;

public abstract class Objct {
    private final String name;
    protected static final String textColor = "\u001B[32m";
    protected static final String textColorReset = "\u001B[0m";

    public Objct(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                '}';
    }
}
