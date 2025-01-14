package Abstracts;

import Enums.HeroState;

import java.util.ArrayList;

public abstract class Entity extends Objct {
    protected boolean isAlive = true;
    protected final String name;
    protected ArrayList<HeroState> entityStates= new ArrayList<>(0);

    public Entity(String name) {
        super(name);
        this.name = name;
    }

    public Entity(String name, boolean isAlive) {
        super(name);
        this.name = name;
        this.isAlive = isAlive;
    }

//    abstract public void addEntityState(HeroState s);

    public void clearEntityState() {
        this.entityStates.clear();
    }

    public void setEntityStates(ArrayList<HeroState> entityStates) {
        this.entityStates = entityStates;
    }

    public String getLastEntityState() {
        return entityStates.getLast().toString();
    }

    public ArrayList<HeroState> getEntityStates() {
        return entityStates;
    }
}
