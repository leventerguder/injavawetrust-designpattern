package factories;

import buttons.Button;
import buttons.WindowsButton;
import checkboxes.Checkbox;
import checkboxes.WindowsCheckbox;

/**
 * Concrete factories product a family of products that belong to a single variant.
 * The factory guarantees that the resulting products are compatible.
 * Signatures of the concrete factory's methods return an abstract product,
 * while inside the method a concrete product is instantiated.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
