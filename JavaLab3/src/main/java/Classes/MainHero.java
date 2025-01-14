package Classes;

import Abstracts.Entity;
import Enums.HeroState;

public class MainHero extends Entity {
    protected final String name;

    public MainHero(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void addEntityState(HeroState s) {
        if (!entityStates.contains(s)) {
            entityStates.add(s);
        } else {
            System.out.println(this.name + " уже " + s);
        }
    }

    @Override
    public String toString() {
        return this.name;
    }
}
