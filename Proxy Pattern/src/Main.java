public class Main {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();


        internet.connectTo("youtube.com");
        internet.connectTo("abc.com");


    }
}
