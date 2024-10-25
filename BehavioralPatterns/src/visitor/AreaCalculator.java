package visitor;

public class AreaCalculator implements ShapeVisitor {

    public AreaCalculator(){}

    @Override
    public void visit(Circle shape) {
        double area = Math.PI* Math.pow(shape.getRadius(), 2);
        System.out.println("Circle area: " + area);
    }

    @Override
    public void visit(Rectangle shape) {
        double area = shape.getSide1()*shape.getSide2();
        System.out.println("Rectangle area: " + area);

    }

    @Override
    public void visit(Square shape) {
        double area = shape.getSide()*shape.getSide();
        System.out.println("Square area: " + area);

    }
}
