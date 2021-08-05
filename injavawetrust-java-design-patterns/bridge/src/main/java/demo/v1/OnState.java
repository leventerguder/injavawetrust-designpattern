package demo.v1;

// A concrete implementer
public class OnState implements State {

    @Override
    public void moveState() {
        System.out.print("On State\n");
    }

    @Override
    public void hardPressed() {
        System.out.print("\tThe device is already On.Do not press the button so hard.\n");
    }
}
