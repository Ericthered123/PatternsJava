package observer;

import java.util.ArrayList;
import java.util.List;

public class NetflixService {

    private List<NetflixUser> users;
    // private List<Movie> movies; you can extend it for others purposes such as tracking
    // and getting notifications on new types of movie genres or series.


    public NetflixService() {
        users = new ArrayList<NetflixUser>();
    }

    public void subscribe(NetflixUser user) {
        users.add(user);
    }
    public void unsubscribe(NetflixUser user) {
        users.remove(user);
    }

    public void notifyUsersofPayment(){
        for (NetflixUser user : users) {
            user.update();
        }
    }

    public void checkDeudores(){
        for (NetflixUser user : users) {
            System.out.println(user.getDeuda());
        }
    }

}
