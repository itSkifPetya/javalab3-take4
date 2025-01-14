package move;

import ru.ifmo.se.pokemon.*;

public final class DreamEater extends SpecialMove {
    public DreamEater(Type type, double pow, double acc) {
        super(type, pow, acc);
    }


    double dealedDamage;

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        dealedDamage = 0;
        if (pokemon.getCondition() == Status.SLEEP) {
            pokemon.setMod(Stat.HP, (int) Math.round(v));
            dealedDamage = Math.round(v);
        }
    }

    @Override
    protected void applySelfDamage(Pokemon pokemon, double v) {
        pokemon.setMod(Stat.HP, (int) (-0.5 * dealedDamage));
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length - 1];
    }

}
