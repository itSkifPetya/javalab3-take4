package classes;

import abstracts.Obj;
import enums.Condition;
import interfaces.Locationable;
import interfaces.Reasonable;

public class Person extends Obj implements Reasonable, Locationable {
    private final String name;
    private final float luck;
    private Place location = Locationable.location;
    protected Condition condition = Reasonable.condition;

    //TODO: Динамичский полиморфизм!!!
    public Person(String name) {
        super(name);
        this.name = name;
        this.luck = 0.75F;
    }

    public Person(String name, float luck) {
        super(name);
        this.name = name;
        this.luck = (0 < luck && luck < 1) ? luck : 0.75F;
    }

    public Person(String name, float luck, Place location) {
        super(name);
        this.name = name;
        this.luck = (0 < luck && luck < 1) ? luck : 0.75F;
        this.location = location;
    }

    public Person(String name, float luck, Place location, Condition condition) {
        super(name);
        this.name = name;
        this.luck = (0 < luck && luck < 1) ? luck : 0.75F;
        this.location = location;
        this.condition = condition;
    }

    public String getName() {
        return name;
    }

    public float getLuck() {
        return luck;
    }

    public Condition getCondition() {
        return condition;
    }

    @Override
    public String toThink(Obj obj) {
        return "";
    }

    @Override
    public Place getLocation() {
        return this.location;
    }

    @Override
    public void setLocation(Place location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return super.toString() + "[luck=" + this.luck + ", location=" + this.location + ", condition=" + this.condition +"]";
    }
}
