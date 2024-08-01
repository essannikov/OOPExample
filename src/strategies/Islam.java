package strategies;

public class Islam extends Religion{
    public Islam() {
        super("constructor");
        this.faith = new AbrahamicReligion();
    }
    @Override
    public void believe() {
        System.out.println("Islam:");
        this.faith.believe();
    }
    @Override
    protected void country() {
        System.out.println("UAA");
    }
}
