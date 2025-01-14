package matrix;

public class Sys {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static boolean godRandom() {return Math.random() > 0.5; }

    public static String entity(String entity) {return ANSI_PURPLE + entity + ANSI_RESET; }

    public static String item(String item) {return ANSI_GREEN + item + ANSI_RESET;}

    public static String place(String place) {return ANSI_BLUE + place + ANSI_RESET;}
}
