package decorators;

public class SecondFloor extends HouseDecorator{
    House house;

    public SecondFloor(House house){
        this.house = house;
    }

    @Override
    public String getInfo() {
        return house.getInfo() + " + second floor";
    }

    @Override
    public int getPrice() {
        return house.getPrice() + 20_000;
    }
}
