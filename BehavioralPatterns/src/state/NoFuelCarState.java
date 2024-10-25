package state;

public class NoFuelCarState extends CarState {

    public NoFuelCarState(Car car) {
        super(car);
    }


    @Override
    public void stop() {
        System.out.println("Car has no fuel so is Stopped");

    }

    @Override
    public void drive() {
        System.out.println("Car has no fuel so cant Drive");
    }
}
