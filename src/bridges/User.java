package bridges;

public class User extends UserAbstract{
    public User(UserImplInterface realUser) {
        super(realUser);
    }

    @Override
    public void run() {
        realUser.run();
    }

    public void transformToDragon(){
        realUser = new UserImplDragon();
    }
}
