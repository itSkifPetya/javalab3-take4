package domain.command.commands;

import data.models.HumanBeingModel.HumanBeing;
import domain.command.Command;
import domain.RequestManager;

import java.util.Hashtable;

public class SumOfImpactSpeedCommand implements Command {
    @Override
    public void execute(Hashtable<Integer, HumanBeing> collection, String[] args) {
        RequestManager io = RequestManager.getInstanse();
        double sum = 0;
        for (HumanBeing h : collection.values()) {
            sum += h.getImpactSpeed();
        }
        io.post("Суммарная скорость в момент аварии по коллекции: %.2f".formatted(sum));
    }
}
