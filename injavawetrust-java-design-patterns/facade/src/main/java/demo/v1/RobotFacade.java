package demo.v1;

public class RobotFacade {

    private RobotColor robotColor;
    private RobotHands robotHands;
    private RobotBody robotBody;

    public RobotFacade(RobotColor robotColor, RobotHands robotHands, RobotBody robotBody) {
        this.robotColor = robotColor;
        this.robotHands = robotHands;
        this.robotBody = robotBody;
    }

    // Constructing a Milano Robot
    public void constructMilanoRobot() {
        RobotBody.createRobot();
        System.out.println("Creation of a Milano Robot Start.");
        robotColor.setDefaultColor();
        robotHands.setMilanoHands();
        robotBody.createHands();
        robotBody.createRemainingParts();
        System.out.println(" Milano Robot Creation End.");
        System.out.println();
    }

    // Constructing a Robonaut Robot
    public void constructRobonautRobot() {
        RobotBody.createRobot();
        System.out.println("Initiating the creational process of a Robonaut Robot.");
        robotColor.setGreenColor();
        robotHands.setRobonautHands();
        robotBody.createHands();
        robotBody.createRemainingParts();
        System.out.println("A Robonaut Robot is created.");
        System.out.println();
    }

    // Destroying a Milano Robot
    public void destroyMilanoRobot() {
        RobotBody.destroyRobot();
        System.out.println(" Milano Robot's destruction process is started.");
        robotHands.resetMilanoHands();
        robotBody.destroyHands();
        robotBody.destroyRemainingParts();
        System.out.println(" Milano Robot's destruction process is over.");
        System.out.println();
    }

    // Destroying a Robonaut Robot
    public void destroyRobonautRobot() {
        RobotBody.destroyRobot();
        System.out.println(" Initiating a Robonaut Robot's destruction process.");
        robotHands.resetRobonautHands();
        robotBody.destroyHands();
        robotBody.destroyRemainingParts();
        System.out.println(" A Robonaut Robot is destroyed.");
        System.out.println();
    }
}
