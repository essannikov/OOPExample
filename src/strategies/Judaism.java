package strategies;

public class Judaism extends Religion{
    public Judaism() {
        super("constructor");
        this.faith = new AbrahamicReligion();
    }
    @Override
    public void believe() {
        System.out.println("Judaism:");
        this.faith.believe();
    }
    @Override
    protected void country() {
        System.out.println("Israil");
    }
}
