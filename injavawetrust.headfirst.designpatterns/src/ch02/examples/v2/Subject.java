package ch02.examples.v2;

public interface Subject {

    /*
    Both of these methods take an Observer as an argument ; that is ,
    the Observer to be registered or removed.
     */

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    /*
    This method is called to notify all observers when the Subject's state has changed.
     */
    public void notifyObservers();
}
