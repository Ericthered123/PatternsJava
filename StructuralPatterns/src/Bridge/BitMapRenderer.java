package Bridge;

public class BitMapRenderer implements Renderer {


    public BitMapRenderer(){}


    @Override
    public void renderCircle(double radius) {
        System.out.println("Drawing circle of radius " + radius + " in bitmap mode.");
    }

    @Override
    public void renderSquare(double side) {
        System.out.println("Drawing square of side " + side + " in bitmap mode.");
    }

}
