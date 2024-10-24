package factorymethod;

public class Car implements Transport{

    public Car(){}


    @Override
    public void move(){
        System.out.println("Car is moving");
    }


}
