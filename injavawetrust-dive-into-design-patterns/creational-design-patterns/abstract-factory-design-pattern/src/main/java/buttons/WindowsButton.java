package buttons;

/**
 * Concrete products are created by corresponding concrete factories.
 */

public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
