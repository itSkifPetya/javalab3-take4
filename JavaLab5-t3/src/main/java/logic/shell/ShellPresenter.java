package logic.shell;

import java.util.Scanner;
import console.Presenter;

public class ShellPresenter implements Presenter {
    private static ShellPresenter shell;

    private ShellPresenter() {}

    public static ShellPresenter getShell() {
        if(shell == null) {
            shell = new ShellPresenter();
        }
        return shell;
    }

    @Override
    public void put(String msg) {
        System.out.println(msg);
    }

    @Override
    public String get() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
