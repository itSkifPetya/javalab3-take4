import enums.Place;
import matrix.Sys;
import objects.Entity;

public class Main {
    public static void main(String[] args){
        Entity hero = new Entity("Герой");
        Entity stranger = new Entity("Пришелец");
        hero.toThink(stranger);
        System.out.println(Sys.entity(hero.toString()) + hero.toRealize() + Sys.entity(stranger.toString()) + stranger.wentDown(Place.Tower, Place.Underground));


    }
}
