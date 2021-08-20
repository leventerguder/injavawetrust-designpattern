package demo.v2;

public class ModifiedMediatorPatternExample {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("***Mediator Pattern Demo***\n");
        ConcreteMediator mediator = new ConcreteMediator();
        Employee Amit = new ConcreteEmployee(mediator, "Amit", true);
        Employee Sohel = new ConcreteEmployee(mediator, "Sohel", true);
        Employee Raghu = new ConcreteEmployee(mediator, "Raghu", true);


        //Unauthorized user
        Employee Jack = new ConcreteEmployee(mediator, "Jack", false);
        //Only two parameter needed to pass in the following case.
        Employee Divya = new UnauthorizedUser(mediator, "Divya");

        //Displaying the participant's list
        mediator.displayRegisteredEmployees();
        System.out.println("Communication starts among participants...");
        Amit.send(Sohel, "Hi Sohel,can we discuss the mediator pattern?");
        Sohel.send(Amit, "Hi Amit,Yup, we can discuss now.");
        //Boss is sending messages to each of them individually Raghu.send(Amit,"Please get back to work quickly.");
        Raghu.send(Sohel, "Please get back to work quickly.");
        //An unregistered employee(Jack) and an outsider(Divya) are also trying to participate.
        Jack.send(Amit, "Hello Guys..");
        Divya.send(Raghu, "Hi Raghu");
    }

}
