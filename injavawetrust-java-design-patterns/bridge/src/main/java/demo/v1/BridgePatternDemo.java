package demo.v1;

public class BridgePatternDemo {

    public static void main(String[] args) {

        System.out.println("***Bridge Pattern Demo***");
        System.out.println("\n Dealing with a Television at present.");

        State presentState = new OnState();
        //ElectronicGoods eItem = new Television(presentState);
        ElectronicGoods eItem = new Television();
        eItem.setState(presentState);
        eItem.moveToCurrentState();
        //hard press
        eItem.hardButtonPressed();

        //Verifying Off state of the Television now
        presentState = new OffState();
        //eItem = new Television(presentState);
        eItem.setState(presentState);
        eItem.moveToCurrentState();

        System.out.println("\n Dealing with a DVD now.");
        presentState = new OnState();
        //eItem = new DVD(presentState);
        eItem = new DVD();
        eItem.setState(presentState);
        eItem.moveToCurrentState();

        presentState = new OffState();
        //eItem = new DVD(presentState);
        eItem = new DVD();
        eItem.setState(presentState);
        eItem.moveToCurrentState();

        //hard press-A DVD specific method
        //(new DVD(presentState)).doublePress();
        ((DVD)eItem).doublePress();
        /*
        The following line of code will cause error because a television
        object does not have this method.
        */

        //(new Television(presentState)).doublePress();
    }

}
