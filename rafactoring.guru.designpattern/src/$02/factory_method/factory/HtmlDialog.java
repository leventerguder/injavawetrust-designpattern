package $02.factory_method.factory;

/**
 * HTML Dialog will produce HTML buttons.
 */

import $02.factory_method.buttons.Button;
import $02.factory_method.buttons.HtmlButton;

//
public class HtmlDialog extends Dialog {

	@Override
	public Button createButton() {
		return new HtmlButton();
	}
}