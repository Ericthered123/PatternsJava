package Bridge;

public class App {
    public static void main(String [ ]args){
        Renderer r1 = new VectorRenderer();
        Renderer r2 = new BitMapRenderer();
        Renderer r3 = new RayTracingRenderer();

        Shape c = new Circle(10,r3);
        Shape s = new Square(5, r1);

        c.draw();
        s.draw();


    }

}
