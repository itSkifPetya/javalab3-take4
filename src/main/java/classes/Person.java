package classes;

import abstracts.Obj;
import enums.Condition;
import exceptions.NotLocationObjectException;
import interfaces.Location;
import interfaces.Locationable;
import interfaces.Moveable;
import interfaces.Reasonable;
import records.Highlighter;

public class Person extends Obj implements Reasonable, Locationable, Moveable {
    private final String name;
    private final float intellect;
    private Place location;
    protected Condition condition;

    //TODO: Динамичский полиморфизм!!!
    public Person(String name) {
        super(name);
        this.name = name;
        this.intellect = 0.25F;
        this.location  = Locationable.location;
        this.condition = Reasonable.condition;
    }

    public Person(String name, float intellect) {
        super(name);
        this.name = name;
        this.intellect = (0 < intellect && intellect < 1) ? 1-intellect : 0.25F;
        this.location  = Locationable.location;
        this.condition = Reasonable.condition;
    }

    public Person(String name, float intellect, Place location) {
        super(name);
        this.name = name;
        this.intellect = (0 < intellect && intellect < 1) ? 1-intellect : 0.25F;
        this.location = location;
        this.condition = Reasonable.condition;
    }

    public Person(String name, float intellect, Place location, Condition condition) {
        super(name);
        this.name = name;
        this.intellect = (0 < intellect && intellect < 1) ? 1-intellect : 0.25F;
        this.location = location;
        this.condition = condition;
    }

    public String getName() {
        return this.name;
    }

    public float getIntellect() {
        return this.intellect;
    }

    @Override
    public Condition getCondition() {
        return this.condition;
    }

    @Override
    public String getLocation() {
        return this.location.getName();
    }

    @Override
    public void setLocation(Place location) {
        this.location = location;
    }


    @Override
    public String realization(Obj obj) throws NotLocationObjectException {
        if (obj instanceof Location) {
            return "Видимо, я забыл его в" + obj.getName();
        } else {
            throw new NotLocationObjectException(Highlighter.objToStr(obj) + "isn't instance of Location");
        }
    }

    @Override
    public String moved(Place place) {
        return Highlighter.person(this) + " отправился в " + Highlighter.place(place);
    }

    @Override
    public String toString() {
        return super.toString() + "[intellect=" + this.intellect + ", location=" + this.location + ", condition=" + this.condition +"]";
    }

    @Override
    public boolean equals(Object otherObject) {
        if (super.equals(otherObject)) {
            return this.intellect == ((Person) otherObject).intellect &&
                    this.location.equals(((Person) otherObject).location) &&
                    this.condition == ((Person) otherObject).condition;
        } return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + (int) intellect + condition.hashCode();
    }
}
