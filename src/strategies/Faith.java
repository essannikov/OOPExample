package strategies;

public interface Faith {
    public String value = "...";
    public default void believe(){ believeExample();};
    private void believeExample(){
        System.out.println("Believe" + value);
    }
}
