package Bridge;

public class RayTracingRenderer implements Renderer {

    public RayTracingRenderer() {}

    @Override
    public void renderCircle(double radius) {
        System.out.println("Drawing circle of radius " + radius + " in raytracing mode.");
    }

    @Override
    public void renderSquare(double side) {
        System.out.println("Drawing square of side " + side + " in raytracing mode.");
    }

}
