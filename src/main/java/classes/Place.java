package classes;

import abstracts.Obj;
import exceptions.NotLocationableObjectException;
import interfaces.Location;
import interfaces.Locationable;
import records.Highlighter;

import java.util.ArrayList;

public class Place extends Obj implements Location {
    private final String name;
    protected ArrayList<Obj> stayings = new ArrayList<>(1);

    public Place(String name) {
        super(name);
        this.name = name;
//        this.stayings = new ArrayList<>(1);
    }

    public String getName() {
        return name;
    }

    @Override
    public ArrayList<Obj> getStayings() {
        return this.stayings;
    }

    @Override
    public void setStayings(ArrayList<Obj> stayings) throws NotLocationableObjectException {
        for (Obj x: stayings) {
            if (x instanceof Locationable) {
                ((Locationable) x).setLocation(this);
            } else {
                throw new NotLocationableObjectException(Highlighter.objToStr(x) + "isn't instance of Locationable");
            }
        }
        this.stayings = stayings;
    }

    @Override
    public void addStaying(Obj obj) throws NotLocationableObjectException {
        if (obj instanceof Locationable) {
            stayings.add(obj);
            ((Locationable) obj).setLocation(this);
        } else {
            throw new NotLocationableObjectException(Highlighter.objToStr(obj) + " isn't instance of Locationable");
        }
    }

    @Override
    public Obj getLastStaying() {
        return stayings.getLast();
    }

    @Override
    public String toString() {
        return super.toString() + "[stayings=" + stayings + "]";
    }

    @Override
    public boolean equals(Object otherObject) {
        if (super.equals(otherObject)) {
            return this.name.equals(((Place) otherObject).name) && this.stayings.equals(((Place) otherObject).stayings);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        for (int i = 0; i < name.length(); i++) {
            hash = 31 * hash + name.charAt(i);
        }
        for (Obj x : stayings) {
            hash += x.hashCode();
        }
        return super.hashCode() + hash;
    }
}
