package social.networks;

public interface ProfileIterator {

    boolean hasNext();

    Profile getNext();

    void reset();
}
