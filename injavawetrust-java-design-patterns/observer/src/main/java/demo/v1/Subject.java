package demo.v1;

import java.util.ArrayList;
import java.util.List;

public class Subject implements SubjectInterface {

    private List<Observer> observerList = new ArrayList<>();
    private int flag;

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
        // Flag value changed. So notify registered users/observers.
        notifyRegisteredUsers(flag);
    }

    @Override
    public void register(Observer anObserver) {
        observerList.add(anObserver);
    }

    @Override
    public void unregister(Observer anObserver) {
        observerList.remove(anObserver);
    }

    @Override
    public void notifyRegisteredUsers(int notifiedValue) {
        for (Observer observer : observerList)
            observer.update(notifiedValue);
    }
}
