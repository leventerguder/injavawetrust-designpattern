package $02.factory_method.factory;

import $02.factory_method.buttons.WindowsButton;
import $02.factory_method.buttons.Button;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}
}