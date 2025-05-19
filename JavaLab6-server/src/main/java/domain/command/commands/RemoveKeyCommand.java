package domain.command.commands;

import data.models.HumanBeingModel.HumanBeing;
import domain.command.Command;
import domain.RequestManager;

import java.util.Hashtable;

public class RemoveKeyCommand implements Command {
    @Override
    public void execute(Hashtable<Integer, HumanBeing> collection, String[] args) {
        RequestManager io = RequestManager.getInstanse();
        Integer key = Integer.valueOf(args[1]);
        if (collection.containsKey(key)) {
            collection.remove(key);
        } else {
            io.post("Элемент с id %s отсутствует в коллекции".formatted(args[1]));
        }

    }

    @Override
    public int getArgsCount() {
        return 1;
    }
}
