package mediator;

public class Slider extends javafx.scene.control.Slider implements UIControl {

    private UIMediator mediator;
    private boolean mediatedUpdate;

    public Slider(UIMediator mediator) {
        this.mediator = mediator;
        setMin(0);
        setMax(50);
        setBlockIncrement(5);
        mediator.register(this);
        this.valueProperty().addListener((v, o, n) -> {
            if (!mediatedUpdate) this.mediator.valueChanged(this);
        });
    }

    @Override
    public void controlChanged(UIControl control) {
        mediatedUpdate = true;
        setValue(Double.valueOf(control.getControlValue()));
        mediatedUpdate = false;
    }

    @Override
    public String getControlName() {
        return "Slider";
    }

    @Override
    public String getControlValue() {
        return Double.toString(getValue());
    }


}
