package chainofresponsibility;

public class CaptchaHandler extends BaseAccessHandler{

    public CaptchaHandler(){}

    @Override

    public void handleRequest(User user){

        if (user.isCaptcha()){
            System.out.println("Captcha is valid");
            super.handleRequest(user);
        }
        else{
            System.out.println("Captcha is not valid");
        }

    }

}
