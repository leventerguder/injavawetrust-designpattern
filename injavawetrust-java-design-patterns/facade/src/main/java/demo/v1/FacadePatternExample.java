package demo.v1;

public class FacadePatternExample {

    public static void main(String[] args) {

        System.out.println("***Facade Pattern Demo***\n");

        RobotColor robotColor = new RobotColor();
        RobotHands robotHands = new RobotHands();
        RobotBody robotBody = new RobotBody();

        //Creating Robots
        RobotFacade milanoRobotFacade = new RobotFacade(robotColor, robotHands, robotBody);
        milanoRobotFacade.constructMilanoRobot();
        RobotFacade robonautRobotFacade = new RobotFacade(robotColor, robotHands, robotBody);
        robonautRobotFacade.constructRobonautRobot();
        //Destroying robots
        milanoRobotFacade.destroyMilanoRobot();
        robonautRobotFacade.destroyRobonautRobot();


    }
}
