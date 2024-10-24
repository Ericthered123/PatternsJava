package proxy;

import java.time.LocalDateTime;

public class LoggingProxy implements SocialNetwork{
    private RealSocialNetwork socialNetwork;


    public LoggingProxy(RealSocialNetwork socialNetwork) {
        this.socialNetwork = socialNetwork;
    }

    @Override
    public void postMessage(String message) {
        logAction("A post is being published :  " + message);
        //U can then validate or do something with the logs.
        socialNetwork.postMessage(message);
    }

    public void logAction(String action){

        System.out.println("[ LOG " + LocalDateTime.now() +  " ] : " + action);


    }

}
