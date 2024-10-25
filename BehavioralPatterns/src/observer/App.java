package observer;

public class App {
    public static void main(String []args){

        NetflixUser u1 = new PremiumNetflixUser();
        NetflixUser u2 = new SimpleNetflixUser();

        NetflixService s1 = new NetflixService();

        s1.subscribe(u1);
        s1.subscribe(u2);

        s1.checkDeudores();

        s1.notifyUsersofPayment();

        s1.checkDeudores();

    }
}
