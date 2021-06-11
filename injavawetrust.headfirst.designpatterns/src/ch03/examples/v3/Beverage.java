package ch03.examples.v3;

public abstract class Beverage {

    public enum Size {TALL, GRANDE, VENTI};

    Size size = Size.TALL;


    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
