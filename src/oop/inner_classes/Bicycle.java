package oop.inner_classes;

public class Bicycle {
    private String model;
    private int weight;

    public Bicycle(String model, int weight) {
        this.model = model;
        this.weight = weight;
    }

    public void start(){
        System.out.println("Go!");
    }

    public class HandleBar{
        public void right(){
            System.out.println("Turn right!");
        }
        public void left(){
            System.out.println("Turn left!");
        }
    }

    public class Seat{
        public void up(){
            System.out.println("Seat raised higher!");
        }
        public void down(){
            System.out.println("Seat lowered!");
        }
    }
}
