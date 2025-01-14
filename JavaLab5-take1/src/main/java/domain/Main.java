package domain;

import domain.handlers.CommandHandler;
import domain.handlers.DataHandler;
import domain.handlers.Option;
import domain.handlers.OptionHandler;
import presentation.interaction.Console;

public class Main {

    public static void main(String[] args) {
        Console console = Console.getInstance();
        OptionHandler optHandler = OptionHandler.getInstance();
        CommandHandler commHandler = CommandHandler.getInstance();
        DataHandler dataHandler = DataHandler.getDataHandler();

        switch (optHandler.getOption(console.input("Введите режим (Admin или Interactive):"))) {
            case Option.ADMIN -> adminWay(console);
            case Option.INTERACTIVE -> interactiveWay();
        }

//        LocalData localData = LocalData.getInstance();
//        HumanBeing humanBeing = new HumanBeing();
//        Hashtable<String, HumanBeing> hashtable = new Hashtable<>();
//        hashtable.put("Hui", humanBeing);
//        localData.writeData(hashtable);

    }

    private static void adminWay(Console console) {
        String dataset = console.input("Введите датасет одной строкой.");
        String fileName = console.input("Введите название файла.");

    }

    private static void interactiveWay() {}


}
