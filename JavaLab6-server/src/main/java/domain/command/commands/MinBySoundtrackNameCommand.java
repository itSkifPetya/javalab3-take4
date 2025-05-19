package domain.command.commands;

import data.models.HumanBeingModel.HumanBeing;
import domain.command.Command;
import domain.RequestManager;

import java.util.Hashtable;

public class MinBySoundtrackNameCommand implements Command {
    @Override
    public void execute(Hashtable<Integer, HumanBeing> collection, String[] args) {
        RequestManager io = RequestManager.getInstanse();
        Integer fKey = collection.keys().nextElement();
        HumanBeing minH = collection.get(fKey);
        String min = minH.getSoundtrackName();
        for (HumanBeing h : collection.values()) {
            String hSN = h.getSoundtrackName();
            if (min.compareTo(hSN) == 1) {
                minH = h;
                min = h.getSoundtrackName();
            }
        }
        io.post(minH.toString());
    }
}
