import pockemon.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;


public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();

        Pokemon clefable = new Clefable("vatutin", 1);
        Pokemon clefairy = new Clefairy("kozhevnikova", 1);
        Pokemon cleffa = new Cleffa("ershov", 1);
        Pokemon lunatone = new Lunatone("pravdin", 1);
        Pokemon yanma = new Yanma("serdykov", 1);
        Pokemon yanmega = new Yanmega("svintsov", 1);

        b.addAlly(clefable);
        b.addAlly(lunatone);
        b.addAlly(yanmega);
        b.addFoe(clefairy);
        b.addFoe(cleffa);
        b.addFoe(yanma);

        b.go();
    }
}

