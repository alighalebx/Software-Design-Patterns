import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

    private Internet internet = new RealInternet();
    private static List<String> bannedSites;


    static {
        bannedSites = new ArrayList<String>();

        bannedSites.add("abc.com");
        bannedSites.add("def.com");
        bannedSites.add("ijk.com");
        bannedSites.add("lmn.com");
    }

    @Override
    public void connectTo(String serverHost) {
        if (bannedSites.contains(serverHost)) {

            System.out.println("Access Denied");
        } else {
            internet.connectTo(serverHost);
        }
    }
}
