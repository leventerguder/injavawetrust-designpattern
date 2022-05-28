# Memento Design Pattern

https://www.journaldev.com/1734/memento-design-pattern-java

Memento design pattern is one of the behavioral design pattern. Memento design pattern is used when we want to save the
state of an object so that we can restore later on.
Memento pattern is used to implement this in such a way that the saved state data of the object is not accessible
outside of the object, this protects the integrity of saved state data.

One of the best real life example is the text editors where we can save it’s data anytime and use undo to restore it to
previous saved state.

Memento pattern is simple and easy to implement, one of the thing needs to take care is that Memento class should be
accessible only to the Originator object. Also in client application, we should use caretaker object for saving and
restoring the originator state.

We can use Serialization to achieve memento pattern implementation that is more generic rather than Memento pattern
where every object needs to have it’s own Memento class implementation.