package _03.abstract$.factory.pattern.test;

import _03.abstract$.factory.pattern.factory.WidgetFactory;
import _03.abstract$.factory.pattern.model.ScrollBar;
import _03.abstract$.factory.pattern.model.Window;
import _03.abstract$.factory.pattern.factory.MotifWidgetFactory;

public class AbstractFactoryPatternTest {

    public static void main(String[] args) {

        WidgetFactory factory = new MotifWidgetFactory();

        ScrollBar motifScrollBar = factory.createScrollBar();
        Window motifWindow = factory.createWindow();

        ScrollBar pmScrollBar = factory.createScrollBar();
        Window pmWindow = factory.createWindow();

        motifScrollBar.setMax(10);
        motifWindow.repaint();
        System.out.println();

        pmScrollBar.setMax(20);
        pmWindow.repaint();

    }
}
