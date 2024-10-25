package state;

public class Car {
    private CarState state;
    private double fuel;


    public Car(){
        this.fuel=0;
        this.state=new NoFuelCarState(this);
    }


    public CarState getState() {
        return state;
    }

    public void changeState(CarState state) {
        this.state = state;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {

        if (fuel>=0){
            this.fuel = fuel;
            changeState(new FuelCarState(this));
        }
    }






    public void stop() {
        getState().stop();
    }

    public void drive() {
        getState().drive();
    }





}
