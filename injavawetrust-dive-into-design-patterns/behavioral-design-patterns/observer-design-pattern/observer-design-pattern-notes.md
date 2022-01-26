# Observer

Also known as : Event-Subscriber, Listener

Observer is a behavioral design pattern that lets you define a subscription mechanism to notify multiple objects about
any events that happen to the object they're observing.

## Real-World Analogy

If you subscribe to a newspaper or magazine, you no longer need to go to the store to check if the next issue is
available. Instead, the publisher sends new issues directly to your mail-box right after publication or even in advance.

## Applicability

Use the Observer pattern when changes to the state of one object may require changing objects, and the actual set of
objects is unknown beforehand or changes dynamically.

You can often experience this problem when working with classes of the graphical user interface. For example, you
created custom button classes, and you want to let the clients hook some custom code to your buttons so that it fires
whenever a user presses a button.

The Observer pattern lets any object that implements the sub- scriber interface subscribe for event notifications in
publisher objects. You can add the subscription mechanism to your but- tons, letting the clients hook up their custom
code via custom subscriber classes.

Use the pattern when some objects in your app must observe others, but only for a limited time or in specific cases.

The subscription list is dynamic, so subscribers can join or leave the list whenever they need to.

## Pros and Cons

- Open/Closed Principle. You can introduce new subscriber class- es without having to change the publisher’s code (and
  vice versa if there’s a publisher interface).
- You can establish relations between objects at runtime.
- (-) Subscribers are notified in random order.

## Relations with Other Patterns

- Chain of Responsibility, Command, Mediator and Observer address various ways of connecting senders and receivers of
  requests:
    - Chain of Responsibility passes a a request sequentially along a dynamic chain of potential receivers until one of
      them handles it.
    - Command establishes unidirectional connections between senders and receivers.
    - Mediator eliminates direct connections between senders and receivers, forcing them to communicate indirectly via a
      mediator object.
    - Mediator eliminates direct connections between senders and receivers, forcing them to communicate indirectly via a
      mediator object.
    - Observer lets receivers dynamically subscribe to and unsubscribe from receiving requests.
- The difference between Mediator and Observer is often elu- sive. In most cases, you can implement either of these pat-
  terns; but sometimes you can apply both simultaneously. Let’s see how we can do that.

  The primary goal of Mediator is to eliminate mutual dependencies among a set of system components. Instead, these
  components become dependent on a single mediator object. The goal of Observer is to establish dynamic one-way
  connections between objects, where some objects act as subordinates of others.

  There’s a popular implementation of the Mediator pattern that relies on Observer. The mediator object plays the role
  of publisher, and the components act as subscribers which subscribe to and unsubscribe from the mediator’s events.
  When Mediator is implemented this way, it may look very similar to Observer.

  When you’re confused, remember that you can implement the Mediator pattern in other ways. For example, you can
  permanently link all the components to the same mediator object. This implementation won’t resemble Observer but will
  still be an instance of the Mediator pattern.

  Now imagine a program where all components have become publishers, allowing dynamic connections between each other.
  There won’t be a centralized mediator object, only a distributed set of observers.
