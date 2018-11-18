package _02.factory_method.factory;

import _02.factory_method.buttons.Button;
import _02.factory_method.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}
}