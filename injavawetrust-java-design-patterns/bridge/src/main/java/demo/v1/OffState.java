package demo.v1;

public class OffState implements State {

    @Override
    public void moveState() {
        System.out.print("Off State\n");
    }

    @Override
    public void hardPressed() {
        System.out.print("\tThe device is Offline now.Do not press the off button again.\n");
    }
}
