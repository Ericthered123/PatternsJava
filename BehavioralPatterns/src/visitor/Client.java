package visitor;

public class Client {
    public static void main(String []args){

        Square sq1 = new Square(2);
        Circle c1 = new Circle(3);
        Rectangle r1 = new Rectangle(4, 5);

        ShapeVisitor sv1 = new AreaCalculator();


        sv1.visit(sq1);
        sv1.visit(c1);
        sv1.visit(r1);


    }
}
