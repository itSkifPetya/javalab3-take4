package interfaces;

import enums.Place;

public interface Movements {
    String wentDown(Place from, Place to);
    String goOut(Place from, Place to);
}
