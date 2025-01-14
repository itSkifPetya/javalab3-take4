package Enums;

public enum HeroState {
    THINK("думает"),
    GOINGINSIDE("входит"),
    GOINGOUTSIDE("выходит"),
    CONFUSED("растерянный");


    private String title;

    HeroState(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

}
