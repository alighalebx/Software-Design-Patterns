public class Terrorist implements Player{

    private final String Task;
    private String weapon;

    public Terrorist()
    {
        Task = "PLANT A BOMB";
    }
    public void assignWeapon(String weapon){
        this.weapon = weapon;
    }
    public void mission(){
        System.out.println("Terrorist with weapon" + weapon + "|" + "Task is " + Task);
    }
}
