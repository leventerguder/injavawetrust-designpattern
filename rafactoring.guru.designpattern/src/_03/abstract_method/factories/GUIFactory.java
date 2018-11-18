package _03.abstract_method.factories;

import _03.abstract_method.buttons.Button;
import _03.abstract_method.checkboxes.Checkbox;

public interface GUIFactory {
	public abstract Button createButton();

	public abstract Checkbox createCheckbox();
}
