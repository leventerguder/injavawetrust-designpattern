package demo.v1;

public class Off implements PossibleState {
    @Override
    public void pressOnButton(TV context) {

        System.out.println("You pressed On button. Going from Off to On state.");
        context.setCurrentState(new On());
        System.out.println(context.getCurrentState().toString());
    }

    @Override
    public void pressOffButton(TV context) {
        System.out.println("You pressed Off button. TV is already in Off state.");
    }

    @Override
    public void pressMuteButton(TV context) {
        System.out.println("You pressed Mute button.TV is already in Off state, so Mute operation will not work.");
    }

    @Override
    public String toString() {
        return "\t**TV is switched off now.**";
    }
}
