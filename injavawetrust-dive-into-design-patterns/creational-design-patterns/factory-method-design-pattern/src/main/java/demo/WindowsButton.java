package demo;

public class WindowsButton implements Button{

    public void render() {
        System.out.println("WindowsButton is rendering...");
        onClick();
    }

    public void onClick() {
        System.out.println("Blue Screen Error");
    }

}
