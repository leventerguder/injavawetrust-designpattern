package demo.v2;

public class TriangleClassAdapter extends Triangle implements RectInterface {

    public TriangleClassAdapter(double base, double height) {
        super(base, height);
    }

    @Override
    public void aboutRectangle() {
        aboutTriangle();
    }

    @Override
    public double calculateAreaOfRectangle() {
        return calculateAreaOfTriangle();
    }
}
