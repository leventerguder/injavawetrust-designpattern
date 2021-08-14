package demo.v2;

public class Mute implements PossibleState {

    private TV tvContext;

    public Mute(TV tvContext) {
        this.tvContext = tvContext;
    }

    @Override
    public void pressOnButton() {
        System.out.println("You pressed On button.Going from Mute mode to On state.");
        tvContext.setCurrentState(tvContext.getOnState());
        System.out.println(tvContext.getCurrentState().toString());
    }

    @Override
    public void pressOffButton() {
        System.out.println("You pressed Off button. Going from Mute mode to Off state.");
        tvContext.setCurrentState(tvContext.getOffState());
        System.out.println(tvContext.getCurrentState().toString());
    }

    @Override
    public void pressMuteButton() {
        System.out.println(" You pressed Mute button.TV is already in Mute mode.");
    }

    public String toString() {
        return "\t**TV is silent(mute) now**";
    }
}
