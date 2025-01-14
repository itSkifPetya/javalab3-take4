package interfaces;

import abstracts.Obj;
import enums.Condition;
import exceptions.NotLocationObjectException;
import records.UniverseBase;

public interface Reasonable {
    Condition condition = UniverseBase.getBaseCondition();
    Condition getCondition();
    String realization(Obj obj) throws NotLocationObjectException;
}
