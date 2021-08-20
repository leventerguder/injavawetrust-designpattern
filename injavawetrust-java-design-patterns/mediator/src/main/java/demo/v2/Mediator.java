package demo.v2;

public interface Mediator {

    void register(Employee employee);

    void sendMessage(Employee fromEmployee, Employee toEmployee, String msg)
            throws InterruptedException;
}
