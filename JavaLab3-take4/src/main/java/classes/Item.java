package classes;

import abstracts.Obj;
import interfaces.Belongable;
import interfaces.Locationable;

public class Item extends Obj implements Belongable, Locationable {
    private final String name;
    private Person owner;
    private Place location;

    public Item(String name) {
        super(name);
        this.name = name;
        owner = Belongable.owner;
        location = owner.getLocation();
    }


    @Override
    public String toString() {
        return super.toString() + "[location=" + this.location + ", owner=" + this.owner + "]";
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
    public Place getLocation() {
        return this.location;
    }

    @Override
    public void setLocation(Place location) {
        this.location = location;
    }

}
