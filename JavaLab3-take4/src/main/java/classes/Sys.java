package classes;

import enums.Condition;

import java.util.concurrent.TimeUnit;

public class Sys {
    public static void setPersonCondition(Person person, Condition condition) {
        person.condition = condition;
    }

    public static void personThinking(Person person) {
        System.out.println("[Sys] За " + (short) (person.getIntellect()*20) + " секунд " + person.getName() + " додумался!");
    }
}
