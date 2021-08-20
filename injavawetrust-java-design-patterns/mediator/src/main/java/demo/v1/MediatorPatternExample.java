package demo.v1;

public class MediatorPatternExample {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("***Mediator Pattern Demo***\n");


        ConcreteMediator mediator = new ConcreteMediator();
        JuniorEmployee amit = new JuniorEmployee(mediator, "Amit");
        JuniorEmployee sohel = new JuniorEmployee(mediator, "Sohel");
        SeniorEmployee raghu = new SeniorEmployee(mediator, "Raghu");

        //Registering participants
        mediator.register(amit);
        mediator.register(sohel);
        mediator.register(raghu);
        //Displaying the participant's list
        mediator.displayRegisteredEmployees();
        System.out.println("Communication starts among participants...");
        amit.sendMessage("Hi Sohel,can we discuss the mediator pattern?");
        sohel.sendMessage("Hi Amit,yup, we can discuss now.");
        raghu.sendMessage("Please get back to work quickly.");
        //An outsider/unknown person tries to participate
        Unknown unknown = new Unknown(mediator, "Jack");
        unknown.sendMessage("Hello Guys..");

    }


}
