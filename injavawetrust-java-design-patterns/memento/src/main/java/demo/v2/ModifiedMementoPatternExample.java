package demo.v2;

/*
The 'Caretaker' class.
Wikipedia notes( for your reference):
1.A client (caretaker) can request a memento from the originator  to save
the internal state of the originator and
2.Pass a memento back to the originator (to restore to a previous state)
This enables to save and restore the internal state of an originator
without violating its encapsulation.
 */

import java.util.ArrayList;
import java.util.List;

public class ModifiedMementoPatternExample {

    public static void main(String[] args) {

        System.out.println("***Modified Memento Pattern Demo***\n");
        List<Memento> savedStateIds = new ArrayList<Memento>(); //Originator is initialized with a state
        Originator originatorObject = new Originator();
        Memento mementoObject;
        originatorObject.setStateId(1);
        mementoObject = originatorObject.saveMemento(originatorObject.getStateId());
        savedStateIds.add(mementoObject);

        System.out.println(" Snapshot #1: Originator's current state id is saved in caretaker.");
        //Changing the state id of Originator
        originatorObject.setStateId(2);
        mementoObject = originatorObject.saveMemento(originatorObject.getStateId());
        savedStateIds.add(mementoObject);
        System.out.println(" Snapshot #2: Originator's current state id is saved in caretaker.");

        //Changing the state id of Originator
        originatorObject.setStateId(3);
        mementoObject = originatorObject.saveMemento(originatorObject.getStateId());
        savedStateIds.add(mementoObject);
        System.out.println(" Snapshot #3: Originator's current state id is saved in caretaker (client).");

        //Roll back everything...
        System.out.println("Started restoring process...");
        for (int i = savedStateIds.size(); i > 0; i--) {
            originatorObject.revertMemento(savedStateIds.get(i - 1));
        }
    }

}
