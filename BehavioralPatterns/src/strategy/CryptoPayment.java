package strategy;

public class CryptoPayment implements PaymentStrategy{

    private String walletAddress;

    public CryptoPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    public String getWalletAddress(){
        return walletAddress;

    }

    public void pay(double amount){
        System.out.println(amount + " paid with cryptocoin , WALLET ADDRESS :  " + getWalletAddress());
    }



}
