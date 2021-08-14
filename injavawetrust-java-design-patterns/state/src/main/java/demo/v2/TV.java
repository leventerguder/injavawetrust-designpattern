package demo.v2;

public class TV {

    private PossibleState currentState;
    private PossibleState onState;
    private PossibleState offState;
    private PossibleState muteState;

    public TV() {
        onState = new On(this);
        offState = new Off(this);
        muteState = new Mute(this);
        setCurrentState(offState);
    }

    public PossibleState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(PossibleState currentState) {
        this.currentState = currentState;
    }

    public void pressOffButton() {
        currentState.pressOffButton();
    }

    public void pressOnButton() {
        currentState.pressOnButton();
    }

    public void pressMuteButton() {
        currentState.pressMuteButton();
    }

    public PossibleState getOnState() {
        return onState;
    }

    public PossibleState getOffState() {
        return offState;
    }

    public PossibleState getMuteState() {
        return muteState;
    }
}
