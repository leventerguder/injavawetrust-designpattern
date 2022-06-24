package mediator;

import java.util.ArrayList;
import java.util.List;

//Mediator
public class UIMediator {

    List<UIControl> colleagues = new ArrayList<>();

    public void register(UIControl control) {
        colleagues.add(control);
    }

    public void valueChanged(UIControl control) {
        colleagues.stream().filter(c -> c != control).forEach(c -> c.controlChanged(control));
    }
}
