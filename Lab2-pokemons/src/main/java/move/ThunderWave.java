package move;

import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class ThunderWave extends Move {

    ThunderWave(Type type, double pow, double acc, int prior, int hits) {
        super(type, pow, acc, prior, hits);
    }

    @Override
    protected void attack(Pokemon pokemon, Pokemon pokemon1) {

    }
}
