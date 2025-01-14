package classes;

import abstracts.Obj;
import interfaces.Belongable;
import interfaces.Locationable;

public class Item extends Obj implements Belongable, Locationable {
    private final String name;
    private Person owner;
    private String location;

    public Item(String name) {
        super(name);
        this.name = name;
        owner = new Person("Nobody");
        location = owner.getLocation();
    }



    @Override
    public String getName() {
        return this.name;
    }

    public Person getOwner() {
        return this.owner;
    }

    @Override
    public void belongs(Person owner) {
        this.owner = owner;
    }

    @Override
    public String getLocation() {
        return this.location;
    }

    @Override
    public void setLocation(Place location) {
        this.location = location.getName();
    }

    @Override
    public String toString() {
        return super.toString() + "[location=" + this.location + ", owner=" + this.owner + "]";
    }


    @Override
    public boolean equals(Object otherObject) {
        if (super.equals(otherObject)) {
            return this.owner.equals(((Item) otherObject).owner) && this.location.equals(((Item) otherObject).location);
        } return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + owner.hashCode();
    }
}
