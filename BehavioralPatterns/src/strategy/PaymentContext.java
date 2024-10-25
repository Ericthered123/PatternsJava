package strategy;

public class PaymentContext {

    private PaymentStrategy strategy;

    public PaymentContext(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
    public PaymentContext(){}

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
    public PaymentStrategy getStrategy() {
        return strategy;
    }

    public void processPayment(double amount) {
        if (getStrategy()==null){
            System.out.println("No payment method selected");
        }
        else{
            getStrategy().pay(amount);
        }
    }

}
