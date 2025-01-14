package logic.DIO;

import logic.data.model.HumanBeing;

import java.util.Hashtable;

public interface Repo {
    void writeData(Hashtable<Integer, HumanBeing> data);
    Hashtable<Integer, HumanBeing> getData();
}
