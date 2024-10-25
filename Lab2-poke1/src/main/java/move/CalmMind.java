package move;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;

public class CalmMind extends StatusMove {

    public CalmMind() {}



    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "Calm Mind!";
    }
}
