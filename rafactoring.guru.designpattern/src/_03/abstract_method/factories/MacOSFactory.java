package _03.abstract_method.factories;

import _03.abstract_method.buttons.Button;
import _03.abstract_method.buttons.MacOSButton;
import _03.abstract_method.checkboxes.Checkbox;
import _03.abstract_method.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }

}
