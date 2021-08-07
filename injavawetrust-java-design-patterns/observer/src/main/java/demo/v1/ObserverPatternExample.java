package demo.v1;

public class ObserverPatternExample {

    public static void main(String[] args) {

        System.out.println(" ***Observer Pattern Demo***\n");
        //We have 3 observers- 2 of them are ObserverType1, 1 of them is of ObserverType2
        Observer myObserver1 = new ObserverType1("Roy");
        Observer myObserver2 = new ObserverType1("Kevin");
        Observer myObserver3 = new ObserverType2("Bose");
        Subject subject = new Subject();

        //Registering the observers-Roy,Kevin,Bose

        subject.register(myObserver1);
        subject.register(myObserver2);
        subject.register(myObserver3);
        System.out.println(" Setting Flag = 5 ");
        subject.setFlag(5);

        //Unregistering an observer(Roy))
        subject.unregister(myObserver1);
        //No notification this time Roy. Since it is unregistered.
        System.out.println("\n Setting Flag = 50 ");
        subject.setFlag(50);
        //Roy is registering himself again
        subject.register(myObserver1);
        System.out.println("\n Setting Flag = 100 ");
        subject.setFlag(100);


    }

}
