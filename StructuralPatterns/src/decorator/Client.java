package decorator;

public class Client {
    public static void main(String[] args) {

        Tea t1 = new SimpleTea();

        System.out.println(t1.cost() + " " + t1.getDescription());

        t1 = new TeaMilkDecorator(t1);

        //Each time we redefine the value of t1, we are actually wrapping the tea in new Wrappers or decorators
        // adding new functionalities and values to the previous object without having to create a large hierarchy,
        //this is doable thanks to the common interface.

        System.out.println(t1.cost() + " " + t1.getDescription());

        t1 = new TeaSugarDecorator(t1);

        System.out.println(t1.cost() + " " + t1.getDescription());


    }
}
