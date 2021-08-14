package demo.v2;

public class Off implements PossibleState {


    private TV tvContext;

    public Off(TV tvContext) {
        this.tvContext = tvContext;
    }

    @Override
    public void pressOnButton() {
        System.out.println(" You pressed On button. Going from Off to On state");
        tvContext.setCurrentState(tvContext.getOnState());
        System.out.println(tvContext.getCurrentState().toString());
    }

    @Override
    public void pressOffButton() {
        System.out.println("You pressed Mute button.Going from On to Mute mode.");
        tvContext.setCurrentState(tvContext.getMuteState());
        System.out.println(tvContext.getCurrentState().toString());
    }

    @Override
    public void pressMuteButton() {
        System.out.println(" You pressed Mute button.TV is already in Off state, so Mute operation will not work.");
    }

    public String toString() {
        return "\t**TV is switched on now.**";
    }
}

