package ch02.examples.v2;

public interface Observer {

    /*
    These are the state values the Observers get from the Subject when a weather measurement chnanges.
     */
    public void update(double temp, double humidity, double pressure);

    /*
    The Observer interface is implemented by all observers , so they all have to implement the update() method.
     */
}
