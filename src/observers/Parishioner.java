package observers;

public class Parishioner implements Observer{
    private String name;

    public Parishioner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(Church church) {
        System.out.println(name + " gets a news: " + church.getNews());
    }
}
