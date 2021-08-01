package demo.v1;

public class CalculatorAdapter {

    public double getArea(Triangle triangle) {
        Calculator calculator = new Calculator();
        Rectangle rectangle = new Rectangle();
        // Area of Triangle = 0.5 * base * height
        rectangle.setLength(triangle.getBase());
        rectangle.setWidth(0.5 * triangle.getHeight());
        return calculator.getArea(rectangle);
    }
}
