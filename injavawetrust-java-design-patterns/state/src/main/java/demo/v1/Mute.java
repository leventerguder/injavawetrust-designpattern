package demo.v1;

public class Mute implements PossibleState {
    @Override
    public void pressOnButton(TV context) {

        System.out.println("You pressed On button.Going from Mute mode to On state.");
        context.setCurrentState(new On());
        System.out.println(context.getCurrentState().toString());
    }

    @Override
    public void pressOffButton(TV context) {
        System.out.println("You pressed Off button. Going from Mute mode to Off state.");
        context.setCurrentState(new Off());
        System.out.println(context.getCurrentState().toString());
    }

    @Override
    public void pressMuteButton(TV context) {

        System.out.println("You pressed Mute button.TV is already in Mute mode.");
    }

    @Override
    public String toString()
    {
        return "\t**TV is silent(mute) now**";
    }
}
