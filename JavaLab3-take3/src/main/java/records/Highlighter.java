package records;

import abstracts.Obj;
import classes.Item;
import classes.Person;
import classes.Place;

public record Highlighter() {
    private static final String ANSI_RESET = "\u001B[0m";
//    private static final String ANSI_BLACK = "\u001B[30m";
//    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
//    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
//    private static final String ANSI_WHITE = "\u001B[37m";

    public static String person(Person person) {return ANSI_PURPLE + person.getName() + ANSI_RESET; }

    public static String item(Item item) {return ANSI_GREEN + item.getName() + ANSI_RESET;}

    public static String place(Place place) {return ANSI_BLUE + place.getName() + ANSI_RESET;}

    public static String objToStr(Obj obj) {return ANSI_CYAN + obj + ANSI_RESET;}
}
