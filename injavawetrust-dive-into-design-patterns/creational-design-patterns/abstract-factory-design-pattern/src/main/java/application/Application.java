package application;

import buttons.Button;
import checkboxes.Checkbox;
import factories.GUIFactory;

/**
 * The client code works with factories and products only through abstract types
 * GUIFactory, Button and Checkbox.
 * This lets you pass any factory or product subclass to the client code without breaking it.
 */
public class Application {

    private final Button button;

    private final Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
