package demo.v2;

public class TriangleAdapter implements RectInterface {

    private Triangle triangle;

    public TriangleAdapter(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public void aboutRectangle() {
        triangle.aboutTriangle();
    }

    @Override
    public double calculateAreaOfRectangle() {
       return triangle.calculateAreaOfTriangle();
    }
}
