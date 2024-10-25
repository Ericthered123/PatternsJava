package chainofresponsibility;

public class App {
    public static void main(String []args){
        User eric = new User("Eric", true, true , true);
        User pedro = new User("Pedro", true, true , false);

        AccessHandler captchaHandler = new CaptchaHandler();
        AccessHandler loggingHnadler = new LoggingHnadler();
        AccessHandler permissionHandler = new PermissionHandler();


        loggingHnadler.setNext(permissionHandler);
        permissionHandler.setNext(captchaHandler);

        loggingHnadler.handleRequest(eric);
        loggingHnadler.handleRequest(pedro);



    }

}
