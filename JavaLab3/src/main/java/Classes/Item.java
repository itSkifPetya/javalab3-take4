package Classes;

import Abstracts.Objct;

public class Item extends Objct {
    private final String name;

    public Item(String name) {
        super(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
