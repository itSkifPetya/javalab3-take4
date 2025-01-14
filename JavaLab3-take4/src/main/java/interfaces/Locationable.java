package interfaces;

import classes.Place;
import records.UniverseBase;

public interface Locationable {
    Place location = UniverseBase.getBaseLocation();
    Place getLocation();
    void setLocation(Place location);
}
