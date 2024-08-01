package decorators;

public class Garage extends HouseDecorator {
    House house;

    public Garage(House house){
        this.house = house;
    }

    @Override
    public String getInfo() {
        return house.getInfo() + " + garage";
    }

    @Override
    public int getPrice() {
        return house.getPrice() + 5_000;
    }
}
