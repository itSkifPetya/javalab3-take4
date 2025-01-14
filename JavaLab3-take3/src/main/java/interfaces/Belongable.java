package interfaces;

import abstracts.Obj;
import classes.Person;
import records.UniverseBase;

public interface Belongable {
    Person owner = UniverseBase.getBaseOwner();
    void belongs(Person owner);
}
