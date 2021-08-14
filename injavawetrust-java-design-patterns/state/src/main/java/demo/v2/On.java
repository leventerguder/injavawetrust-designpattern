package demo.v2;

public class On implements PossibleState {

    private TV tvContext;

    public On(TV tvContext) {
        this.tvContext = tvContext;
    }

    @Override
    public void pressOnButton() {
        System.out.println("You pressed On button. TV is already in On state.");
    }

    @Override
    public void pressOffButton() {

        System.out.println(" You pressed Off button.Going from On to Off state.");
        tvContext.setCurrentState(tvContext.getOffState());
        System.out.println(tvContext.getCurrentState().toString());
    }

    @Override
    public void pressMuteButton() {
        System.out.println("You pressed Mute button.Going from On to Mute mode.");
        tvContext.setCurrentState(tvContext.getMuteState());
        System.out.println(tvContext.getCurrentState().toString());
    }

    public String toString() {
        return "\t**TV is switched on now.**";
    }
}
