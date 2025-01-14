package pockemon;

import move.Slash;
import ru.ifmo.se.pokemon.Type;

public final class Yanmega extends Yanma{
    public Yanmega(String name, int lvl) {
        super(name, lvl);
        setStats(85, 76, 86, 116, 56, 95);

        Slash slash = new Slash(Type.NORMAL, 70, 100); // DONE
        addMove(slash);
    }
}
