package pockemon;

import move.Bulldoze;
import ru.ifmo.se.pokemon.*;


public class Lunatone extends Pokemon {
    public int c = 0;

    public Lunatone(String name, int lvl, Pokemon foe) {
        super(name, lvl);
        addType(Type.ROCK);
        addType(Type.PSYCHIC);
        setStats(90, 55, 65, 95, 85, 70);



        Bulldoze bulldoze = new Bulldoze();
        addMove(bulldoze);
    }

}
