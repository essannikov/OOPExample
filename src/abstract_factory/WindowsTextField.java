package abstract_factory;

public class WindowsTextField implements TextField{
    @Override
    public void onInputChanged() {
        System.out.println("onInputChanged Windows");
    }
}
