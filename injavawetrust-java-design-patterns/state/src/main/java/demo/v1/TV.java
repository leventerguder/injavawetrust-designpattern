package demo.v1;

public class TV {


    private PossibleState currentState;

    public TV() {
        //Initially TV is initialized with Off state
        this.setCurrentState(new Off());
    }


    public PossibleState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(PossibleState currentState) {
        this.currentState = currentState;
    }

    public void pressOffButton() {
        currentState.pressOffButton(this);//Delegating the state
    }

    public void pressOnButton() {
        currentState.pressOnButton(this);//Delegating the state
    }

    public void pressMuteButton() {
        currentState.pressMuteButton(this);//Delegating the state
    }


}
