package ch06.examples.v1;

public class Light {

    private String location;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println("Light#on");
    }

    public void off() {
        System.out.println("Light#off");
    }
}
