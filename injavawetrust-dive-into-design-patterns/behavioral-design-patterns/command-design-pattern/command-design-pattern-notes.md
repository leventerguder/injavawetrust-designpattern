# Command

Also known as : Action , Transaction

Command is a behavioral design pattern that turns a request into a stand-alone object that contain all information about
the request. This transformation lets you parameterize methods with different requests, delay or queue a request's
execution, and support undoable operations.

Command is behavioral design pattern that converts request or simple operations into objects. The conversion allows
deferred or remote execution of commands, storing command history.

## Usage of the pattern in Java

The Command pattern is pretty common in Java code. Most often it's used a alternative for callbacks to parameterizing UI
elements with actions. It's also used for queueing tasks, tracking operations history.

- All implementation of java.lang.Runnable.
- All implementation of javax.swing.Action

## Solution

Good software design is often based on the principle of separation of concerns, which usually results in breaking an app
into layers. The most common example : a layer for the graphical user interface and another layer for the business
logic.

## Real-World Analogy

After a long walk through the city, you get to a nice restaurant and sit at the table by window. A friendly waiter
approaches you and quickly takes your order, writing it down on a piece of paper. The waiter goes to the kitchen and
sticks the order on the wall.

After a while, the order gets to the chef, who reads it and cooks the meal accordingly. The cook places the meal on a
tray along with the order. The waiter discovers the tray, checks the order to make sure everything is as you wanted it,
and brings everything to your table.

## Applicability

- Use the Command pattern when you want to parametrize objects with operations.

The Command pattern can turn a specific method call into a stand-alone object. This change opens up a lot of interesting
uses : you can pass commands as method arguments , store them inside other objects, switch linked commands at runtime.

- Use the Command pattern when you want to queue operations, schedule their execution, or execute them remotely.

As with any other object,a command can be serialized, which means converting it to a string that can be easily written
to a file or a database. Later, the string can be restored as the initial command object. Thus, you can delay and
schedule command execution. But there's even more. In the same way, you can queue, log or send command over the network.

- Use the command pattern when you want to implement reversible operations.

Although there are many ways to implement undo/redo, the Command pattern is perhaps the most popular of all. To be able
to revert operations, you need to implement the history of performed operations. The command history is a stack that
contains all executed command objects along with related backups of the application's state.

This method has two drawbacks. First, it isn't that easy to save an application's state because some of it can be
private. This problem can be mitigated with the Memento pattern.

Second, the state backups may consume quite a lot of RAM. Therefore , sometimes you can resort to an alternative
implementation : instead of restoring the past state, the command performs the inverse operation. The reverse operation
also has a price : it may turn out to be hard or even impossible to implement.

## Pros and Cons

- Single Responsibility Principle. You can decouple classes that invoke operations from classes that perform these
  operations.
- Open/Closed Principle. You can introduce new commands into the app without breaking existing client code.
- You can implement undo/redo.
- You can implement deferred execution of operations.
- You can assemble a set of simple commands into a complex one.
- (-) The code may become more complicated since you're introduction a whole new layer between senders and receivers.

# Relations with Other Patterns

- Chain of Responsibility , Command , Mediator and Observer address various ways of connecting senders and receivers of
  requests.
    - Chain of Responsibility passes a request sequentially along a dynamic chain of potential receivers until one of
      them handles it.
    - Command establishes unidirectional connections between senders and receivers.
    - Mediator eliminated direct connections between senders and receivers, forcing them to communicate indirectly via a
      mediator object.
    - Observer lets receivers dynamically subscribe to and unsubscribe from receiving requests.
- You can use Command and Memento together when implementing "undo". In this case, commands are responsible for
  performing various operations over a target object, while mementos save the state of that object just before a command
  get executed.
- Command and Strategy may look similar because you can use both to parameterize an object with some action. However,
  they have very different intents.
    - You can use Command to convert any operation into an object. The operation's parameters become fields of that
      object. The conversion lets you defer execution of the operation , queue it, store the history of command, send
      command to remote services, etc.
    - On the other hand, Strategy usually describes different ways of doing the same thing, letting you swap these
      algorithms within a single context class.
- Prototype can help you need to save copies of Commands into history.
- You can treat Visitor as a powerful version of the Command pattern. Its objects can execute operations over various
  objects of different classes.
- 
