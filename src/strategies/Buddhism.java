package strategies;

public class Buddhism extends Religion{
    public Buddhism() {
        super("constructor");
        this.faith = new BuddismReligion();
    }
    @Override
    public void believe() {
        System.out.println("Buddism:");
        this.faith.believe();
    }
    @Override
    protected void country() {
        System.out.println("Tibet");
    }
}
