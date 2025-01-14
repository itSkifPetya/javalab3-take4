package interfaces;

import abstracts.Obj;
import enums.Condition;
import records.UniverseBase;

public interface Reasonable {
    Condition condition = UniverseBase.getBaseCondition();

    String toThink(Obj obj);
}
