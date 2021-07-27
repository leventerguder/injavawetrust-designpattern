package demo.v3;

public class SingletonPatternExample {


    public static void main(String[] args) {

        System.out.println("Trying to make a captain for your team:");

        // Constructor is private. We cannot use "new" here.
        // Captain c3 = new Captain();//error

        Captain captain1 = Captain.getCaptain();
        System.out.println("Trying to make another captain for your team:");
        Captain captain2 = Captain.getCaptain();
        if (captain1 == captain2) {
            System.out.println("captain1 and captain2 are same instance.");
        }
        Captain.CaptainDerived derived = captain1.new CaptainDerived();

        // you can see that the program has violated the key objective,
        // because I never intended to create more than one instance.

        // Number of instances at this moment=2
    }
}
