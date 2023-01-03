public class Main {
    public static void main(String[] args) {
        GarmentType objGarmentType = GarmentFactory.createGarments("Shirt");
        System.out.println(objGarmentType.print());
    }
}
