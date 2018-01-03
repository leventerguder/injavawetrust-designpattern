package _03.abstract_method.app;

import _03.abstract_method.buttons.Button;
import _03.abstract_method.checkboxes.Checkbox;
import _03.abstract_method.factories.GUIFactory;

public class Application {

	private Button button;
	private Checkbox checkbox;

	//
	public Application(GUIFactory factory) {
		button = factory.createButton();
		checkbox = factory.createCheckbox();
	}

	public void paint() {
		button.paint();
		checkbox.paint();
	}
}
