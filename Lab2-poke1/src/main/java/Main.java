import pockemon.Lunatone;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;

public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Pokemon("Чужой", 1);
        Pokemon p2 = new Lunatone("Luna", 1, p1);

        b.addAlly(p1);
        b.addFoe(p2);
        b.go();
    }

}
