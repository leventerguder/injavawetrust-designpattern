package demo.v2;

import java.util.ArrayList;
import java.util.List;

public class ModifiedAdapterPatternExample {

    public static void main(String[] args) {

        System.out.println("***Adapter Pattern Modified Demo***\n");
        Rectangle rectangle = new Rectangle(20, 10);
        System.out.println("Area of Rectangle is : " + rectangle.calculateAreaOfRectangle() + " Square unit.");

        Triangle triangle = new Triangle(10, 5);
        System.out.println("Area of Triangle is : " + triangle.calculateAreaOfTriangle() + " Square unit.");


        RectInterface adapter = new TriangleAdapter(triangle);
        //Passing a Triangle instead of a Rectangle
        System.out.println("Area of Triangle using the triangle adapter is : " + adapter.calculateAreaOfRectangle() + " Square unit.");

        List<RectInterface> rectangleObjects = new ArrayList<>();
        rectangleObjects.add(rectangle);
        //rectangleObjects.add(triangle);//Error
        rectangleObjects.add(adapter);//Ok

        System.out.println("");
        System.out.println("*****Current objects in the system are:******");

        for(RectInterface rectObjects:rectangleObjects)
        {
            rectObjects.aboutRectangle();
        }
    }

}
