package decorator;

public class SimpleTea implements Tea{

    public SimpleTea(){}

    @Override
    public String getDescription(){
        return "Simple Tea";
    }
    public double cost(){
        return 1.00;
    }

}
