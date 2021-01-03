package _03.abstract_method.factories;

import _03.abstract_method.buttons.Button;
import _03.abstract_method.buttons.WindowsButton;
import _03.abstract_method.checkboxes.Checkbox;
import _03.abstract_method.checkboxes.WindowsCheckbox;

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
