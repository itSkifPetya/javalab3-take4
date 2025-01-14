package domain.handlers;

public class OptionHandler {
    private static OptionHandler instance;
    private Option option = Option.NOOPTION;

    private OptionHandler() {}

    public static OptionHandler getInstance() {
        if (instance == null) {
            instance = new OptionHandler();
        }
        return instance;
    }
    //TODO: Это капец как притянутая демонстрация, но типа сойдёт
    public Option getOption(String input) {
        switch (input) {
            case "Admin":
                option = Option.ADMIN;
                break;
            case "Interactive":
                option = Option.INTERACTIVE;
                break;
        }
        return option;
    }
}
