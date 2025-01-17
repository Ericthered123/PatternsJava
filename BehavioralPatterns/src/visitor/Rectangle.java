package visitor;

public class Rectangle implements Shape{
    private double side1;
    private double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }
    public double getSide2() {
        return side2;
    }

    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }

}
