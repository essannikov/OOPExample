package decorators;

public class WoodenHouse extends House {
    public WoodenHouse(){
        info = "Wooden house";
    }

    @Override
    public int getPrice() {
        return 25_000;
    }
}
