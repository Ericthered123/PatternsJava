package proxy;

public class RealSocialNetwork implements SocialNetwork{

    public RealSocialNetwork() {}

    @Override
    public void postMessage(String message) {
        System.out.println("Publishing on the network: " + message);
    }
}
