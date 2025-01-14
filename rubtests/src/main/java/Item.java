
public class Item {
    private final String name;
    private String owner;
    private Place location;

    public Item(String name) {
        this.name = name;
        owner = "Nobody";
        location = new Place("World");
    }

    public void setLocation(Place location) {
        this.location = location;
    }
}
