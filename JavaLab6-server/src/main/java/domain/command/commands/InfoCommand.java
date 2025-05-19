package domain.command.commands;

import data.models.HumanBeingModel.HumanBeing;
import domain.command.Command;
import domain.RequestManager;

import java.util.Hashtable;

public class InfoCommand implements Command {
    @Override
    public void execute(Hashtable<Integer, HumanBeing> collection, String[] args) {
        RequestManager io = RequestManager.getInstanse();
        int collectionSize = collection.size();
        io.post("Количество элементов: " + Integer.toString(collectionSize));
        io.post("Тип коллекции" + collection.getClass().getName());
    }
}
