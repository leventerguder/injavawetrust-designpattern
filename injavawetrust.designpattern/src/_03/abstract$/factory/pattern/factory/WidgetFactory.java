package _03.abstract$.factory.pattern.factory;

import _03.abstract$.factory.pattern.model.ScrollBar;
import _03.abstract$.factory.pattern.model.Window;

public interface WidgetFactory {

	public abstract ScrollBar createScrollBar();

	public abstract Window createWindow();

}
