public class Bike extends Vehicle{

    public Bike (WorkShop workShop1, WorkShop workShop2){
        super(workShop1,workShop2);
    }

    @Override
    public void manufacture() {
        System.out.println("Bike ");
        workshop1.work();
        workshop2.work();
    }
}
