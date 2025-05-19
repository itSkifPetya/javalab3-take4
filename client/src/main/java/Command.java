import java.io.Serializable;

public class Command implements Serializable {
    private String NAME;

    public Command(String NAME) {
        this.NAME = NAME;
    }

    public void execute() {
        System.out.println("Выполняю команду " + this.NAME);
    }

    public String getNAME() {
        return NAME;
    }
}
