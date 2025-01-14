package presentation.interaction;

import presentation.requirements.IOManager;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Console implements IOManager {
    private static Console instance;

    private Console() {}
    // Реализация singleton класса
    public static Console getInstance() {
        if (instance == null) {
            instance = new Console();
        }
        return instance;
    }
    // Поток Scanner, ассоциированный с System.in не надо закрывать, ибо
    // тогда закроется весь поток ввода System.in, что приведёт к нарушению
    // работы программы.
    public String input() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }

    public String input(String msg) {
        System.out.println(msg);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }

    public void output(String output) {

    }
}
