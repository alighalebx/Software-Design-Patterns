public class sidePockets extends BackpackDecorator{

    public sidePockets(BackPack pack) {
        super(pack);
    }
    public String produceBackpack() {
        return super.produceBackpack() +"sidePockets";
    }
}
