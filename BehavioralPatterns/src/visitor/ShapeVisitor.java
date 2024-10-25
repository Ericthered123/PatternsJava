package visitor;

import java.awt.*;

public interface ShapeVisitor {
    void visit(Circle shape);
    void visit(Rectangle shape);
    void visit(Square shape);
}
