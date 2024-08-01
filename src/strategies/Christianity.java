package strategies;

public class Christianity extends Religion{
    public Christianity() {
        super("constructor");
        this.faith = new AbrahamicReligion();
    }
    @Override
    public void believe() {
        System.out.println("Christianity:");
        this.faith.believe();
    }
    @Override
    protected void country() {
        System.out.println("Russia");
    }
}
