package domain.command.commands;

import data.models.HumanBeingModel.HumanBeing;
import domain.command.Command;
import domain.RequestManager;

import java.util.Hashtable;

public class RemoveGreaterKeyCommand implements Command {
    @Override
    public void execute(Hashtable<Integer, HumanBeing> collection, String[] args) {
        RequestManager io = RequestManager.getInstanse();
        Integer enteredKey = Integer.valueOf(args[1]);
        Hashtable<Integer, HumanBeing> oldCollection = (Hashtable<Integer, HumanBeing>) collection.clone();
        for (Integer key : oldCollection.keySet()) {
            if (enteredKey < key) {
                collection.remove(key);
            }
        }
        if (oldCollection.equals(collection)) {
            io.post("Таких элементов нет. Коллекция не была изменена");
        }
    }

    @Override
    public int getArgsCount() {
        return 1;
    }
}
