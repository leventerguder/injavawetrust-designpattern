package demo.v2;

public class Originator {

    private int stateId;

    public Originator() {
        this.stateId = 0;
        System.out.println(" Originator is created with state id : " + stateId);
    }

    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
        System.out.println(" Setting the state id of the originator to : " + stateId);
    }

    //Saving its internal state to a(memento) object
    public Memento saveMemento(int stateId) {
        System.out.println(" Saving originator's current state id. ");
        //Create memento with the current state and return it.
        return new Memento(stateId);
    }

    //Restoring to a previous state from a(memento) object.
    public void revertMemento(Memento previousMemento) {
        System.out.println(" Restoring to state id..." + previousMemento.getStateId());
        this.stateId = previousMemento.getStateId();
        System.out.println(" Current state id of originator : " + stateId);
    }

}
