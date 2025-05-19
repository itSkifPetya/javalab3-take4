package domain.command.commands;

import data.models.HumanBeingModel.HumanBeing;
import domain.command.Command;
import domain.RequestManager;

import java.util.Hashtable;

public class HelpCommand implements Command {

    @Override
    public void execute(Hashtable<Integer, HumanBeing> collection, String[] args) {
        RequestManager io = RequestManager.getInstanse();
        io.post("help: вывести справку по доступным командам");
        io.post("info: информация о коллекции");
        io.post("show: вывести коллекцию");
        io.post("insert {key}: добавить элемент по ключу");
        io.post("update {id}: обновить элемент по его id");
        io.post("remove_key {key}: удалить элемент из коллекции по его ключу");
        io.post("clear: очистить коллекцию");
        io.post("save {file_path}: сохранить коллекцию в файл");
        io.post("execute_script {file_path}: выполнить скрипт");
        io.post("exit: завершить программу без сохранения");
        io.post("history: вывести последние 5 команд");
        io.post("replace_if_greater {key}: заменить элемент по ключу, если новый больше старого");
        io.post("remove_greater_key {key}: удалить все элементы, ключ которых превышает данный");
        io.post("sum_of_impact_speed: вывести сумму значений поля impactSpeed для всех элементов коллекции");
        io.post("min_by_soundtrack_name: вывести любой элемент коллекции с минимальным полему soundtrackName");
        io.post("group_counting_by_has_toothpick: сгруппировать элементы коллекции по значению поля hasToothpick, вывести количество элементов в каждой группе");

    }
}



//public class Meow{
//    String cat;
//
//    public Meow(String cat){
//        this.cat = cat;
//    }
//
//    public String getCat() {
//        return cat;
//    }
//
//    public static void meow(){
//        System.out.println(cat + " say " + meeeeeow);
//    }
//}
//

