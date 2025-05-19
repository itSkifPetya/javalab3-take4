package domain.command.commands;

import data.models.HumanBeingModel.HumanBeing;
import domain.command.Command;
import domain.RequestManager;

import java.util.Hashtable;

public class GroupCountingByHasToothpickCommand implements Command {
    @Override
    public void execute(Hashtable<Integer, HumanBeing> collection, String[] args) {
        RequestManager io = RequestManager.getInstanse();
        Hashtable<Integer, HumanBeing> hasToothpickCollection = new Hashtable<>();
        Hashtable<Integer, HumanBeing> hasNoToothpickCollection = new Hashtable<>();

        for (Integer k : collection.keySet()) {
            HumanBeing h = collection.get(k);
            if (h.getHasToothpick()) {
                hasToothpickCollection.put(k, h);
            } else {
                hasNoToothpickCollection.put(k, h);
            }
        }

        io.post("hasToothpick: true");
        io.post(hasToothpickCollection.toString());
        io.post("hasToothpick: false");
        io.post(hasNoToothpickCollection.toString());
    }
}
