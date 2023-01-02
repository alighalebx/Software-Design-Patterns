public class Main {
    public static void main(String[] args) {
        Counter objA = Counter.getInstance();
        objA.addOne();
        Counter objB = Counter.getInstance();
        objB.addOne();
        objA.addOne();

        System.out.println("Counter A is "+objA.count);
        System.out.println("Counter B is "+objB.count);
    }
}
