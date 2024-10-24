package factorymethod;

public class Bike implements Transport{

    public Bike(){

    }

    @Override
    public void move(){
        System.out.println("Bike is moving...");
    }
}
