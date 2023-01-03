public class CounterTerrorist implements Player{

    private final String Task;

    private String Weapon;

    public CounterTerrorist(){
        Task = "DIFFUSE BOMB";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.Weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Counter Terrorist with weapon" + Weapon + "|" + "Task is " + Task);
    }
}
