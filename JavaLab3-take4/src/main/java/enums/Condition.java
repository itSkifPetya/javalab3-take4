package enums;

public enum Condition {
    INACTIVE("бездействует"),
    THINKS("думает"),
    MOVES("двигается");

    private String title;

    Condition(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
}
