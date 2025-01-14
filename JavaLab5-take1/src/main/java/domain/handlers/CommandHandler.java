package domain.handlers;

public class CommandHandler {
    private static CommandHandler instance;

    private CommandHandler() {}

    public static CommandHandler getInstance() {
        if (instance == null) {
            instance = new CommandHandler();
        }
        return instance;
    }
}
