package strategy;

public class CreditCardPayment implements PaymentStrategy{

    private String cardNumber;
    private String name;

    public CreditCardPayment(String cardNumber, String name) {
        this.cardNumber = cardNumber;
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public String getCardNumber(){
        return cardNumber;
    }

    public void pay(double amount){
        System.out.println("Paying with credit card ; number : " + getCardNumber() + " DE " + getName());

    }



}
