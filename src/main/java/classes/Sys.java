package classes;

import abstracts.Obj;
import enums.Condition;
import records.Highlighter;

import java.util.ArrayList;

public class Sys {
    public static void setPersonCondition(Person person, Condition condition) {
        person.condition = condition;
    }

    public static void personThinking(Person person) {
        System.out.println("[Sys] За " + (short) (person.getIntellect()*30*Math.random()) + " секунд " + person.getName() + " додумался!");
    }

    public static boolean checkStayings(Person person, Item item, Place place) {
        System.out.print("[Sys] " + Highlighter.person(person) + " ищет " + Highlighter.item(item) + "... ");
        ArrayList<Obj> stayings = place.stayings;
        if (stayings.contains(person) && stayings.contains(item)) {
            System.out.println("Нашёл!");
            return true;
        } else {
            System.out.println("Не нашёл :(");
            return false;
        }
    }

}
