import Classes.MainHero;
import Abstracts.Entity;
import Classes.Stranger;
import Enums.HeroState;
import Enums.StrangerState;

public class Main {
    public static void main(String[] args) {
        // 1s episode
        var hero = new MainHero("Главный герой");
        Entity stranger = new Stranger("Пришелец");
        hero.addEntityState(HeroState.THINK);
        stranger.addEntityState(StrangerState.GOINGINSIDE);
        System.out.printf("%s %s, что ", hero, hero.getLastEntityState());
        System.out.printf("");


    }
}