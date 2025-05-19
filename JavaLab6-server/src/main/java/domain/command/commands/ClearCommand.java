package domain.command.commands;

import data.models.HumanBeingModel.HumanBeing;
import domain.command.Command;
import domain.RequestManager;

import java.util.Hashtable;

public class ClearCommand implements Command {
    @Override
    public void execute(Hashtable<Integer, HumanBeing> collection, String[] args) {
        RequestManager io = RequestManager.getInstanse();
        if (collection.isEmpty()) {
            io.post("Коллекция уже пуста!");
        } else {
            collection.clear();
        }
    }
}
