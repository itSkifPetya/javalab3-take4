import abstracts.Obj;
import classes.Item;
import classes.Person;
import classes.Place;
import classes.Sys;
import enums.Condition;
import exceptions.NotLocationableObjectException;
import records.UniverseBase;
import records.Highlighter;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        //TODO: Демонстрация работы и обработки собственного исключения
//        System.out.println("Демонстрация работы и обработки собственного исключения: ");
//
//        Item item = new Item("Икона");
//        Place car = new Place("Вагон");
//        Place church = new Place("Церковь");
//
//        try {
//            church.addStayingItem(item);
//            car.addStaying(church);
//        } catch (NotLocationableObjectException e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println();
        //TODO: Стандартный запуск
//        story(storyInit());
        //TODO: Моковый запуск
        ArrayList<Obj> defaultInitialize = new ArrayList<Obj>(2);
        String[] heroItems = UniverseBase.getHeroItems();
        Item lostItem = new Item(heroItems[((int) (Math.random() * 6))]);
        defaultInitialize.add(UniverseBase.getPersons()[1]);
        defaultInitialize.add(lostItem);
        story(defaultInitialize);
    }

    public static boolean story(ArrayList<Obj> data) {
        Place car = new Place("Вагон"), hotel = new Place("Отель"), busStation = new Place("Остановка"), cafe = new Place("Кафе"), institution = new Place("Институт");
        Person hero = (Person) data.get(0);
        Item lostItem = (Item) data.get(1);

        try {
            institution.addStaying(lostItem);
        } catch (NotLocationableObjectException ignored){}

        System.out.println("\tНачало истории");
        Sys.setPersonCondition(hero, Condition.THINKS);
        System.out.print(Highlighter.person(hero) + " " + hero.getCondition().getTitle() + ": ");
        System.out.printf("\"А может быть, я пришёл в вагон уже без %s?\"", Highlighter.item(lostItem));
        System.out.println(" - подумал " + Highlighter.person(hero) + " - \"Может, я его забыл где-нибудь?\"");
        System.out.println();
        research(hero, lostItem, car);
        System.out.println();
        research(hero, lostItem, hotel);
        System.out.println();
        research(hero, lostItem, busStation);
        System.out.println();
        research(hero, lostItem, cafe);
        System.out.println();
        return false;
    }

    public static ArrayList<Obj> storyInit() {
        final Scanner inp = new Scanner(System.in);
        ArrayList<Obj> data = new ArrayList<Obj>(5);

        System.out.println("Выберите одного из героев или создайте нового:");
        int c = 0;
        for (Person x : UniverseBase.getPersons()) {
            System.out.println(c + ") " + Highlighter.person(x));
            c++;
        }

        String heroName = inp.nextLine();
        Person hero;
        if (heroName.matches("[0-9]+")) {
            int heroIndex = Integer.parseInt(heroName);
            while (true) {
                try {
                    hero = UniverseBase.getPersons()[heroIndex];
                    break;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.printf("[input error] %s. Try again \n", e);
                    heroName = inp.nextLine();
                    heroIndex = Integer.parseInt(heroName);
                }
            }
            System.out.println("Вы выбрали " + Highlighter.person(hero));
        } else {
            System.out.print("Введите коэф. удачи <float> (0, 1): ");
            String heroLuck = inp.nextLine() + "f";
            hero = new Person(heroName, Float.parseFloat(heroLuck));
            System.out.println("Вы создали " + hero);
        }
        String[] heroItems = UniverseBase.getHeroItems();
        Item lostItem = new Item(heroItems[((int) (Math.random() * 6))]);



        data.add(hero);
        data.add(lostItem);
        return data;
    }

    public static boolean research(Person hero, Item lostItem, Place place) {
        Sys.personThinking(hero);
        System.out.println(Highlighter.person(hero) + ": \"Наверное, я оставил его в " + Highlighter.place(place));
        System.out.println(hero.moved(place));
        try {
            place.addStaying(hero);
        } catch (NotLocationableObjectException ignored){}

        if (Sys.checkStayings(hero, lostItem, place)) {
            return true;
        }

        return false;
    }
}
