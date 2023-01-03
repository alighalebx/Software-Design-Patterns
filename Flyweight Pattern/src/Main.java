import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Player p = PlayerFactory.getPlayer("Terrorist");
        p.assignWeapon("Maverick");
        p.mission();

    }
}



