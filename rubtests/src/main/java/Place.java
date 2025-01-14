import java.util.ArrayList;

public class Place {
    private String name;
    private ArrayList<Item> stayings;

    public Place(String name) {
        this.name = name;
        stayings = new ArrayList<Item>(1);
    }

    void addStayings(Item addition) {
        stayings.add(addition);
        addition.setLocation(this);

    }
}
