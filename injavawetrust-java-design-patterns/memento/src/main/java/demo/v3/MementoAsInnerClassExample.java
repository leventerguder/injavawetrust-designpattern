package demo.v3;

public class MementoAsInnerClassExample {

    public static void main(String[] args) {

        System.out.println("***Memento Pattern Demo***\n");
        //Originator is initialized with a state
        Originator originatorObject = new Originator();
        Originator.Memento mementoObject;
        originatorObject.setStateId(1);

        // A client (caretaker) can request a memento from the originator
        //to save the internal state of the originator

        mementoObject = originatorObject.saveMemento();
        System.out.println(" Snapshot #1: Originator's current state id is saved in caretaker.");
        //A client (or caretaker) cannot set/modify the memento's state

        //Changing the state id of Originator
        originatorObject.setStateId(2);
        mementoObject = originatorObject.saveMemento();
        System.out.println(" Snapshot #2: Originator's current state id is saved in caretaker.");

        //Changing the state id of Originator again.
        originatorObject.setStateId(3);
        //Reverting back to previous state id.
        originatorObject.revertMemento(mementoObject);


    }

}
