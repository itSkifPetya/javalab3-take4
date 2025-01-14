package pockemon;

import move.Bulldoze;
import move.CalmMind;
import move.Moonblast;
import move.RockPolish;
import ru.ifmo.se.pokemon.*;


public final class Lunatone extends Pokemon {
    public Lunatone(String name, int lvl) {
        super(name, lvl);
        setType(Type.ROCK, Type.PSYCHIC);
        setStats(90, 55, 65, 95, 85, 70);

        Bulldoze bulldoze = new Bulldoze(Type.GROUND, 60., 100.); // DONE
        CalmMind calmMind = new CalmMind(); // DONE
        RockPolish rockPolish = new RockPolish(); // DONE
        Moonblast moonblast = new Moonblast(Type.FAIRY, 95., 100.); // DONE

        setMove(bulldoze, calmMind, rockPolish, moonblast);
    }

}
