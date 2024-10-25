package observer;



public class PremiumNetflixUser implements NetflixUser{
    private double deuda;

    public PremiumNetflixUser(){
        this.deuda = 0;

    }

    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

    public void update(){
        setDeuda(getDeuda()-4000);
    }

    public void pay(){
        setDeuda(getDeuda()+4000);
    }


}
