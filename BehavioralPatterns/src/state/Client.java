package state;

public class Client {
    public static void main(String []args){
        Car c1 = new Car();
        c1.drive();
        c1.stop();

        c1.setFuel(100);

        c1.drive();
        c1.stop();
        while(c1.getFuel()>0){
            c1.drive();
        }






    }

}
