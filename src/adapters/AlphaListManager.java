package adapters;

public class AlphaListManager {
    private static AlphaListClass alphaListClass;

    public static AlphaList createList(){
        alphaListClass = new AlphaListClass();

        alphaListClass.add(12);
        alphaListClass.add(15);
        alphaListClass.add(21);

        return alphaListClass;
    }
}
