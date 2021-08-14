package demo.v3;

public class Originator {

    public Originator() {
        this.stateId = 0;
        System.out.println(" Originator is created with state id : " + stateId);
    }

    private int stateId;

    private Memento myMemento;

    //A memento class implemented as an inner class of Originator
    static class Memento {
        private int stateId;

        public Memento(int stateId) {
            this.stateId = stateId;
        }

        //Only outer class can access now
        public int getStateId() {
            return stateId;
        }
        /*This class does not have the
        setter method.We need to use this class
        to get the state of the object only.*/
        /*public void setState(String state) {
            this.state = state;
        }*/
    }

    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        System.out.println(" Setting the state id of the originator to : " + stateId);
        this.stateId = stateId;
    }


    //Saving its internal state to a(memento) object
    public Memento saveMemento() {
        System.out.println(" Saving originator's current state id. ");
        //Create memento with the current state and return it.
        return new Memento(this.stateId);
    }

    //Restoring to a previous state from a(memento) object.
    public void revertMemento(Memento previousMemento) {
        System.out.println(" Restoring to state id..." + previousMemento.getStateId());
        this.stateId = previousMemento.getStateId();
        System.out.println(" Current state id of originator : " + stateId);
    }
}
