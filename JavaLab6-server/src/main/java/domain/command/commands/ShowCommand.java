package domain.command.commands;

import data.models.HumanBeingModel.HumanBeing;
import domain.command.Command;
import domain.RequestManager;

import java.util.Hashtable;

public class ShowCommand implements Command {

    @Override
    public void execute(Hashtable<Integer, HumanBeing> collection, String[] args) {
        RequestManager io = RequestManager.getInstanse();
        if (collection.isEmpty()) {
            io.post("Коллекция не содержит элементов.");
        } else {
            for (Integer key : collection.keySet()) {
                io.post(key.toString() + ": ");
                io.post(collection.get(key).toString());
            }
        }
    }
}
