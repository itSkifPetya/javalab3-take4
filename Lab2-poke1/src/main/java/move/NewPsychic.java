package move;

import ru.ifmo.se.pokemon.*;

public final class NewPsychic extends SpecialMove {
    public NewPsychic(Type type, double pow, double acc){
        super(type, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        Effect e = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1);
        pokemon.addEffect(e);
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }

}
