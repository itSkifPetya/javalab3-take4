package objects;

import enums.Place;
import interfaces.Movements;
import interfaces.Thinking;
import matrix.Sys;

public class Entity extends Obj implements Thinking, Movements {
    private String name;
    private ArrayList<> knowledge;

    public Entity(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public String toThink(Obj o) {

        return Sys.entity(name) + " думает о" + o.toString();
    }

    @Override
    public String toRealize() {
        return " осознал, что ";
    }

    @Override
    public String toPuzzle() {
        return " озадачен ";
    }

    @Override
    public String wentDown(Place from, Place to) {
        return " спустился из " + Sys.place(from.getTitle()) + " в " + Sys.place(to.getTitle());
    }

    public String goOut(Place from, Place to) {
        return " спустился из " + Sys.place(from.getTitle()) + " в " + Sys.place(to.getTitle());
    }
}
