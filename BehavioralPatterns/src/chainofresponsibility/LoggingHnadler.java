package chainofresponsibility;

public class LoggingHnadler extends BaseAccessHandler {

    public LoggingHnadler(){}




    @Override
    public void handleRequest(User user) {
        if (user.isLogin()){
            System.out.println("Logged in");
            super.handleRequest(user);
    }
        else {
            System.out.println("Non valid entry");
        }
    }
}
