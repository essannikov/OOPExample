package abstract_factory;

public class MacTextField implements TextField{
    @Override
    public void onInputChanged() {
        System.out.println("onInputChanged Mac");
    }
}
