package interfaces;

import abstracts.Obj;
import exceptions.NotLocationableObjectException;

import java.util.ArrayList;

public interface Location {
    ArrayList<Obj> getStayings();
    void setStayings(ArrayList<Obj> stayings) throws NotLocationableObjectException;
    void addStaying(Obj obj) throws NotLocationableObjectException;
    Obj getLastStaying();

}
