public class GarmentFactory {
    public static GarmentType createGarments (String selection){
        if (selection == null){
            return null;
        }
        if (selection.equals("Trouser")){
            return new Trouser();
        }
        else {
            return new Shirt();
        }
//        throw new IllegalAccessException("Selection does not exist");

    }
}
