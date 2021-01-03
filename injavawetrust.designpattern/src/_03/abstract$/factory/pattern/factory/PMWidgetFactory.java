package _03.abstract$.factory.pattern.factory;

import _03.abstract$.factory.pattern.model.ScrollBar;
import _03.abstract$.factory.pattern.model.Window;
import _03.abstract$.factory.pattern.model.PMWindow;
import _03.abstract$.factory.pattern.model.PMScrollBar;

public class PMWidgetFactory implements WidgetFactory {

    @Override
    public ScrollBar createScrollBar() {
        return new PMScrollBar();
    }

    @Override
    public Window createWindow() {
        return new PMWindow();
    }

}
