package enums;

public enum Place {
    Underground("Подземелье"),
    Tower("Город"),
    Plane("Самолёт"),
    ColonnadeHouse("Дом с колоннадой"),
    Town("Город");

    private String title;

    Place(String title) {
        this.title = title;
    };

    public String getTitle() {
        return title;
    }
}
