package $02.factory_method.test;

import $02.factory_method.factory.Dialog;
import $02.factory_method.factory.HtmlDialog;
import $02.factory_method.factory.WindowsDialog;
/**
 * Demo class. Everything comes together here.
 */
public class TestFactory {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    static void configure() {
    	System.out.println(System.getProperty("os.name"));
        if (System.getProperty("os.name").equals("Mac OS X")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}