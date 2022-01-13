# Memento

also known as : Snapshot

Memento is a behavioral design pattern that lets you save and restore the previous state of an object without revealing
the details of its implementation.

Memento is a behavioral design pattern that allows making snapshots of an object's state and restoring it in future. The
memento doesn't compromise the internal structure of the object it works with, as well as data kept inside the
snapshots.

## Usage of the pattern in Java

The Memento's principle can be achieved using the serialization, which is quite common in Java. While it's not the only
the most efficient way to make snapshots of an object's state, it sill allows storing state backups while protecting the
originator's structure from other objects.

- All java.io.Serializable implementations can simulate the Memento
- All javax.faces.component.StateHolder implementations.

## Applicability

- Use the Memento pattern when you want to produce snapshots of the object's state to be able to restore a previous
  state of the object.

  The Memento pattern lets you make full copies of an object's state including private fields and store them separately
  from object.

- Use the pattern when direct access to the object's fields/getters/setters violates its encapsulation.

  The memento makes the object itself responsible for creating a snapshot of its state. No other object can read the
  snapshot, making the original object's state data safe and secure.

## Pros and Cons

- You can produce snapshots of the object's state without violating its encapsulation.
- You can simplify the originator's code by letting the caretaker maintain the history of the originator's state.
- (-) The app might consume lots of RAM if clients create mementos too often.
- (-) Caretakers should track the originator's lifecycle to be able to destroy obsolete mementos.
- (-) Most dynamic programming languages, such as PHP, Python, and JS, can't guarantee that the state within the memento
  stays untouched.

## Relations with Other Patterns

- You can use Command and Memento together when implementing "undo". In this case, commands are responsible for
  performing various operations over a target object, while mementos save the state of that object just before a command
  gets executed.
- You can use Memento along with Iterator to capture the current iteration state and roll it back if necessary.
- Sometimes Prototype can be a simpler alternative to Memento. This works if the object, the state of which you want to
  store in the history, is fairly straightforward and doesn't have links external resources, or the links are easy to
  re-establish.
