public class laptopSlot extends BackpackDecorator{
    public laptopSlot(BackPack Pack) {
        super(Pack);
    }


    public String produceBackpack() {
       return super.produceBackpack() +"laptopSlot";
    }

}
