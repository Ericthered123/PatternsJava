package Bridge;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius,Renderer renderer) {
        super(renderer);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void draw(){
        renderer.renderCircle(radius);
    }

}
