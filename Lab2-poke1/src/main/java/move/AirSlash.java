package move;

import ru.ifmo.se.pokemon.*;

public final class AirSlash extends SpecialMove {
    public AirSlash(Type type, double pow, double acc) {
        super(type, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        if (pokemon.getCondition() != Status.NORMAL && Math.random() < 0.3) {
            Effect.flinch(pokemon);
        }
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length - 1];
    }

}
