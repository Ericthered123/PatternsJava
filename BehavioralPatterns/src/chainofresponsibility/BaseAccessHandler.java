package chainofresponsibility;

public class BaseAccessHandler implements AccessHandler {
    private AccessHandler nextHandler;


    public void setNext(AccessHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(User user){
        if (nextHandler != null) {
            nextHandler.handleRequest(user);
        }
        else {
            System.out.println("Access granted to" + user.getName());
        }
    }

}
