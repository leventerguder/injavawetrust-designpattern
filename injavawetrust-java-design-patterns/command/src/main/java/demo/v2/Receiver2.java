package demo.v2;

public class Receiver2 implements Receiver {

    private boolean status;

    public Receiver2() {
        System.out.println("Receiver2 initialized ");
        status = false;
    }

    @Override
    public void performDo() {

        System.out.println("Received a system power on request.");
        if (!status) {
            System.out.println("System is starting up.");
            status = true;
        } else {
            System.out.println("System is already running.So, power on request is ignored.");
        }

    }

    @Override
    public void performUnDo() {

        System.out.println("Received a undo request.");

        if (status) {
            System.out.println("System is currently powered on.");
            status = false;
            System.out.println("\t Undo request processed.System is switched off now.");
        } else {
            System.out.println("System is switched off at present.");
            status = true;
            System.out.println("\t Undo request processed.System is powered on now.");
        }
    }
}
