package components;

import mediator.Mediator;

/**
 * Common component interface.
 */
public interface Component {

    void setMediator(Mediator mediator);

    String getName();
}
