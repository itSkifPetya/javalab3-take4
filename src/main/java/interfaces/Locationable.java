package interfaces;

import classes.Place;
import records.UniverseBase;

public interface Locationable {
    Place location = UniverseBase.getBaseLocation();
    String getLocation();
    void setLocation(Place location);
}
