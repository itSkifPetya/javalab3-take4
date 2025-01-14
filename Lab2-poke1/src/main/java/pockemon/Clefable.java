package pockemon;

import move.WorkUp;

public final class Clefable extends Clefairy {
    public Clefable(String name, int lvl) {
        super(name, lvl);
        setStats(95, 70, 73, 95, 90, 60);

        WorkUp workUp = new WorkUp(); // DONE
        addMove(workUp);
    }
}
