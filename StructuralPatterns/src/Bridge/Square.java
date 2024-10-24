package Bridge;

public class Square extends Shape{
    private double side;

    public Square(double side,Renderer renderer) {
        super(renderer);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void draw(){
        renderer.renderSquare(getSide());
    }
}
