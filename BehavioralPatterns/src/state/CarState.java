package state;

public abstract class CarState {

    private Car car;

    public CarState(Car car) {
        this.car = car;

    }


    public Car getcar(){
        return car;
    }


    abstract public void stop();
    abstract public void drive();



}
