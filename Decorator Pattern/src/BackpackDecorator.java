public abstract class BackpackDecorator implements BackPack{
    private BackPack Pack;

    public BackpackDecorator(BackPack pack) {
        this.Pack = pack;
    }

    @Override
    public String produceBackpack() {
       return Pack.produceBackpack();
    }
}
