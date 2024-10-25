package observer;

public class SimpleNetflixUser implements NetflixUser {

    private double deuda;

    public SimpleNetflixUser(){
        this.deuda = 0;

    }

    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

    public void update(){
        setDeuda(getDeuda()-2000);
    }

    public void pay(){
        setDeuda(getDeuda()+2000);
    }

}
