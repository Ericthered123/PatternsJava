package chainofresponsibility;

public class PermissionHandler extends BaseAccessHandler {

    public PermissionHandler(){}

    @Override

    public void handleRequest(User user){
        if(user.isPermission()){
            System.out.println("Permission is valid");
            super.handleRequest(user);
        }
        else{
            System.out.println("Permission is invalid");
        }
    }

}
