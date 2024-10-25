package strategy;

public class App {
    public static void main(String []args){
        PaymentStrategy p1 = new CreditCardPayment("12312412", "Eric");
        PaymentStrategy p2 = new CryptoPayment("Address");

        PaymentContext p = new PaymentContext(p2);

        p.processPayment(100);



    }
}
