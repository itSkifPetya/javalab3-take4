package enums;

public enum Condition {
    INACTIVE("Бездействует"),
    THINKS("Думает"),
    MOVES("Двигается");

    private String title;

    Condition(String title) {
        this.title = title;
    }
}
