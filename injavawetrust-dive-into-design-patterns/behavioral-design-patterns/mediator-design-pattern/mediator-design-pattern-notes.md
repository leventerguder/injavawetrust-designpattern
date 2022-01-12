# Mediator

Also known as : Intermediary , Controller

Mediator is a behavioral design pattern that lets you reduce chaotic dependencies between the objects and forces them to
collaborate only via a mediator object.

Mediator is behavioral design pattern that reduces coupling between components of a program by making them communicate
indirectly, through a special mediator object.

The Mediator makes it easy to modify, extend and reuse individual components because they're no longer dependent on the
dozens of other classes.

## Usage of the pattern in Java

The most popular usage of the Mediator pattern in Java code is facilitating communications between GUI components of an
app. The synonym of the Mediator is the Controller part of MVC pattern.

- java.util.Timer (all schedule methods)
- java.util.concurrent.Executor#execute
- java.util.concurrent.ExecutorService (invokeXXX and submit methods)
- java.util.concurrent.ScheduledExecutorService (all scheduleX methods)
- java.lang.reflect.Mehod#invoke





## Solution

The Mediator pattern suggests that you should cease all direct communication between the components which you want to
make independent of each other. Instead, these components must collaborate indirectly, by calling a special mediator
object that redirects the calls to appropriate components. As a result, the components depend only on a single mediator
class instead of being coupled to dozens of their colleagues.

## Applicability

- Use the Mediator pattern when it's hard to change some of the classes because they are tightly coupled to a bunch of
  other classes.

The pattern lets you extract all the relationships between classes into a separate class, isolating any changes to
specific component from the rest of the components.

- Use tha pattern when you can't reuse a component in a different program because it's too dependent on other
  components.

After you apply the Mediator, individual components become unaware of the other components. They could still communicate
with each other, albeit indirectly, through a mediator object. To reuse a component in a different app, you need to
provide it with a new mediator class.

- Use the Mediator when you find yourself creating tons of component subclasses just to reuse some basic behavior in
  various contexts.

Since all relations between components are contained within the mediator, it's easy to define entirely new ways for
these components to collaborate by introducing new mediator classes, without having to change the components themselves.

## Pros and Cons

- Single Responsibility Principle. You can extract the communications between various components into a single place,
  making it easier to comprehend and maintain.
- Open/Closed Principle. You can introduce new mediators without having to change the actual components.
- You can reduce coupling between various components of a program.
- You can reuse individual components more easily.
- (-) Over time a mediator can evolve into a God Object.

## Relations with Other Patterns

- Chain of Responsibility, Command , Mediator and Observer address various ways of connecting senders and receivers of
  requests :
    - Chain of Responsibility passes a request sequentially along a dynamic chain of potential receivers until one of
      them handles it.
    - Command establishes unidirectional connections between senders and receivers.
    - Mediator eliminates direct connections between senders and receivers, forcing them to communicate indirectly via a
      mediator object.
    - Observer lets receivers dynamically subscribe to and unsubscribe from receiving requests.
- Facade and Mediator have similar jobs : they try to organize collaboration between lots of tightly coupled classes.
    - Facade defines a simplified interface to a subsystem of objects , but it doesn't introduce any new functionality.
      The subsystem itself is unaware of facade. Objects within the subsystem can communicate directly.
    - Mediator centralizes communication between components of the system. The components only know about the mediator
      object and don't communicate directly.
- The difference between Mediator and Observer is often elusive. In most cases, you can implement either of these
  patterns; but sometimes you can apply both simultaneously. let's see how we can do that.

  The Primary goal of Mediator is to eliminate mutual dependencies among a set of system components. Instead, these
  components become dependent on a single mediator object. The goal of Observer is to establish dynamic one-way
  connections between objects, where some objects act as subordinates of others.

There's a popular implementation of the Mediator pattern that relies on Observer. The mediator object plays the role of
publisher, and the components act as subscribers which subscribe to and unsubscribe from the mediator's events. When
Mediator is implemented this way, it may look very similar to Observer.

When you're confused, remember that you can implement the Mediator pattern in other ways. For example, you can
permanently link all the components to the same mediator object. This implementation won't resemble Observer but will
still be an instance of the Mediator pattern.

Now imagine a program where all components have become publishers, allowing connections between each other. There won't
be a centralized mediator object, only a distributed set of observers.
