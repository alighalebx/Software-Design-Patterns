public class Car extends Vehicle{

    public Car (WorkShop workShop1 , WorkShop workShop2){
        super(workShop1,workShop2);
    }

    @Override
    public void manufacture() {

        System.out.println("Car ");
        workshop1.work();
        workshop2.work();
    }
}
