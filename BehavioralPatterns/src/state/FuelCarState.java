package state;

public class FuelCarState extends CarState{

    public FuelCarState(Car car){
        super(car);
    }




    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public void drive() {
        System.out.println(" Driving car with : " + getcar().getFuel() + "Litres of fuel left");
        getcar().setFuel(getcar().getFuel()-5);
        if (getcar().getFuel()==0){
            System.out.println("Out of fuel");
            getcar().setFuel(0);
            getcar().changeState(new FuelCarState(getcar()));
        }
    }

}
