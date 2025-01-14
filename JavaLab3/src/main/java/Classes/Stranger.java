package Classes;

import Abstracts.Entity;
import Enums.HeroState;
import Enums.StrangerState;

public class Stranger extends Entity {

    public Stranger(String name) {
        super(name);
    }

    @Override
    public void addEntityState(StrangerState s) {

    }
}
