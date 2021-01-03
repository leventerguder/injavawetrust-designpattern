package _03.abstract$.factory.pattern.factory;

import _03.abstract$.factory.pattern.model.ScrollBar;
import _03.abstract$.factory.pattern.model.Window;
import _03.abstract$.factory.pattern.model.MotifWindow;
import _03.abstract$.factory.pattern.model.MotifScrollBar;

public class MotifWidgetFactory implements WidgetFactory {

    @Override
    public ScrollBar createScrollBar() {
        return new MotifScrollBar();
    }

    @Override
    public Window createWindow() {
        return new MotifWindow();
    }

}
