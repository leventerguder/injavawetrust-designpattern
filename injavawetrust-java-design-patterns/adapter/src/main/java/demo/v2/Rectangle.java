package demo.v2;

public class Rectangle implements RectInterface {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void aboutRectangle() {
        System.out.println("Rectangle object with length: " + this.length + " unit and width :" + this.width + " unit.");
    }

    @Override
    public double calculateAreaOfRectangle() {
        return length * width;
    }
}
