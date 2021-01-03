package _03.abstract$.factory.pattern.model;

public class MotifScrollBar implements ScrollBar {

    @Override
    public void setMax(int max) {
        System.out.println("MotifScrollBar#setMax : " + max);
    }

}
