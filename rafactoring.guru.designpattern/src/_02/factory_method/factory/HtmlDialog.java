package _02.factory_method.factory;

import _02.factory_method.buttons.Button;
import _02.factory_method.buttons.HtmlButton;

//
public class HtmlDialog extends Dialog {

	@Override
	public Button createButton() {
		return new HtmlButton();
	}
}