# State

State is a behavioral design pattern that lets an object alter its behavior its internal state changes. It appears as if
the object changed its classes.

State is a behavioral design pattern that allows an object to change the behavior when its internal state changes. The
pattern extracts state-related behaviors into separate state classes and forces the original objects to delegate the
work to an instance of these classes, instead of acting on its own.

## Usage of the pattern in Java

The State pattern is commonly used in Java to convert massive switch -base state machines into the objects.

- javax.faces.lifecycle.LifeCycle#execute()

Identification: State pattern can be recognized by methods that change their behavior depending on the objects' state,
controlled externally.

## Solution

The State pattern suggests that you create new classes for all possible states of an object and extract all
state-specific behaviors into these classes.

Instead of implementing all behaviors on its own, the original object, called context stores a reference to one of the
state objects that represents its current state, and delegates all the state-related work to that object.

## Real-World Analogy

The buttons and switches in your smartphone behave differently depending on the current state of the device:

When the phone is unlocked , pressing buttons leads to executing various functions. When the phone is locked, pressing
any button leads to the unlock screen.

## Applicability

- Use the State pattern when you have an object that behaves differently depending on its current state, the number of
  states is enormous, and the state-specific code changes frequently.

  The pattern suggests that you extract all state-specific code into a set of distinct classes. As a result, you can add
  new states or change existing ones independently of each other, reducing the maintenance cost.


- Use the pattern when you have a class polluted with massive conditionals that alter how the class behaves according to
  the current values of the class's fields.

  The State pattern lets you extract branches of these conditionals into methods of corresponding state classes. While
  doing so, you can also clean temporary fields and helper methods involved in state-specific code out your main class.

- Use State when you have a lot of duplicate code across similar states and transitions of a condition-based state
  machine.

  The State pattern lets you compose hierarchies of state classes and reduce duplication by extracting common code into
  abstract base classes.

## Pros and Cons

- Single Responsibility Principle. Organize the code related to particular states into separate classes.
- Open/Closed Principle. Introduce new states without changing existing state classes or the context.
- Simplifying the code of the context by eliminating bulky state machine conditionals.
- (-) Applying the pattern can be overkill if a state machine has only a few states or rarely changes.

## Relations with Other Patterns

- Bridge, State, Strategy have very similar structures. Indeed, all of these patterns are based on composition, which is
  delegating work to other objects. However, they all solve different problems. A pattern isn't just a recipe for
  structuring your code in a specific way. It can also communicate to other developers the problem the pattern solves.
- State can be considered as an extension of Strategy. Both patterns are based on composition: they change the behavior
  of the context by delegating some work to helper objects.Strategy makes these objects completely independent and
  unaware of each other. However, State doesn't restrict dependencies between concrete states, letting them alter the
  state of the context at will.
