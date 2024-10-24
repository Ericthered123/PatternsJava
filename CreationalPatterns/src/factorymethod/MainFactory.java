package factorymethod;

public class MainFactory {
    public static void main(String[] args) {
        TransportFactory factory = new CarFactory();
        Transport Car = factory.createTransport();
        Car.move();

    }

}
