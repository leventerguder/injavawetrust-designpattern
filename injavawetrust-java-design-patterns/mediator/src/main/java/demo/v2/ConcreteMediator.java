package demo.v2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {

    private List<Employee> participants = new ArrayList<>();

    @Override
    public void register(Employee employee) {
        participants.add(employee);
    }

    @Override
    public void sendMessage(Employee fromEmployee, Employee toEmployee, String msg) throws InterruptedException {

        if (fromEmployee.employeeType().equals("UnauthorizedUser")) {
            System.out.println("[ALERT Everyone] An outsider named " + fromEmployee.getName() +
                    " trying to send some messages to " + toEmployee.getName());
            fromEmployee.receive(fromEmployee, ",you are not allowed to enter here.");
        } else if (participants.contains(fromEmployee)) {
            System.out.println("-----" + fromEmployee.getName() + " posts some message at: " + LocalDateTime.now() + "-----");
            Thread.sleep(1000);
            //No need to inform everyone or himself
            //Only let the target receiver know
            if (participants.contains(toEmployee)) {
                toEmployee.receive(fromEmployee, msg);
            }
            //If target recipient does not exist
            else {
                System.out.println(fromEmployee.getName() + " , your target recipient does not exist");
            }
        } else {
            System.out.println("[ALERT] An unregistered employee named " +
                    fromEmployee.getName() + " trying to send some messages to " + toEmployee.getName());
        }
    }

    public void displayRegisteredEmployees()
    {
        System.out.println("At present ,registered participants are:"); for (Employee employee: participants)
    {
        System.out.println(employee.getName()); }
    }
}
