package _03.abstract_method.test;

import _03.abstract_method.app.Application;
import _03.abstract_method.factories.GUIFactory;
import _03.abstract_method.factories.MacOSFactory;
import _03.abstract_method.factories.WindowsFactory;

public class Test {

	private static Application configureApplication() {
		Application app;
		GUIFactory factory;
		String osName = System.getProperty("os.name").toLowerCase();
		if (osName.contains("mac")) {
			factory = new MacOSFactory();
			app = new Application(factory);
		} else {
			factory = new WindowsFactory();
			app = new Application(factory);
		}
		return app;
	}

	public static void main(String[] args) {
		Application app = configureApplication();
		app.paint();
	}

}
