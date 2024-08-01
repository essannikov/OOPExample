package strategies;

public abstract class Religion {
    Faith faith;

    public Religion(String text) {
        System.out.println(text);
    }


    public abstract void believe();

    protected abstract void country();

    private void action() {
        System.out.println("Pray...");
    }
}
