package bridges;

public abstract class UserAbstract {
    protected UserImplInterface realUser;

    public UserAbstract(UserImplInterface realUser){
        this.realUser = realUser;
    }

    public abstract void run();
}
