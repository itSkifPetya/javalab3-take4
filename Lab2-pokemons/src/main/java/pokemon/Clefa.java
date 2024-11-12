package pokemon;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Clefa extends Pokemon {

    public Clefa(String name, int lvl) {
        super(name, lvl);
        super.addType(Type.FAIRY);
        super.setStats(50, 25, 28, 45, 55, 15);
    }
}
