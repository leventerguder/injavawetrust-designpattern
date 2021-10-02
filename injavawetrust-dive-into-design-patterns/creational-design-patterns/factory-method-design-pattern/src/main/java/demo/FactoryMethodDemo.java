package demo;

public class FactoryMethodDemo {

    public static void main(String[] args) {

        Dialog dialog1 = new WindowsDialog();
        dialog1.renderWindow();

        System.out.println();


        Dialog dialog2 = new HtmlDialog();
        dialog2.renderWindow();
    }
}
