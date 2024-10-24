package proxy;

public class Client {
    public static void main(String [] args){
        RealSocialNetwork s = new RealSocialNetwork();
        SocialNetwork s1 = new LoggingProxy(s);

        s1.postMessage("Hello World");



    }



}
