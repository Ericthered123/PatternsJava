package Bridge;

public class VectorRenderer implements Renderer {

    public VectorRenderer() {}
    @Override
    public void renderCircle(double radius) {
        System.out.println("Drawing circle of radius " + radius + " in vector mode.");
    }

    @Override
    public void renderSquare(double side) {
        System.out.println("Drawing square of side " + side + " in vector mode.");
    }
}
