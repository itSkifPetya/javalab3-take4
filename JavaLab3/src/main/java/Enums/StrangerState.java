package Enums;

public enum StrangerState {
    GOTDOWN("спустился"),
    GOINGINSIDE("входит"),
    GOINGOUTSIDE("выходит"),
    CONFUSED("растерянный");


    private String title;

    StrangerState(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
