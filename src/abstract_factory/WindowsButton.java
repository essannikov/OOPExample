package abstract_factory;

public class WindowsButton implements Button{
    @Override
    public void onClick() {
        System.out.println("onClick Windows");
    }
}
