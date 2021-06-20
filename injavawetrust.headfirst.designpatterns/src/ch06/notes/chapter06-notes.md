# The Command Pattern - Encapsulating Invocation

The Command Pattern allows you to decouple the requester of an action from the object
that actually performs the action.

The Command object provides one method , execute() , that encapsulates the actions and
can be called to invoke the actions on the Receiver.

The actions and the Receiver are bound together in the command object.

The Client is responsible for creating the Command object , The Command object consists of
a set of actions on a Receiver.

The Client calls setCommand on an Invoker object and passes it the Command object
where it gets stored until it is needed.

At some point in the future the Invoker calls the Command object's execute method

Loading the Invoker
- The client creates a command object.
- The client does a setCommand to store the command object in the invoker.
- The client asks the invoker to execute the command.

Waitress - Command
Short Order - Cook execute
orderUp - client
Order - Invoker
Customer - Receiver
takerOrder - setCommand

## The Command Pattern defined
The Command Pattern encapsulates a request as an object , thereby letting you parameterize
other objects with different requests , queue or log requests , and support undoable operations.

We know that a command object encapsulates a request by binding together to a set of actions on a specific receiver.
To achieve this , it packages the actions and the receiver into an object that exposes just one method, execute().

The Meta Command Pattern allows you to create macros of commands so that you can execute multiple commands at once.


## Bullet Points
- The Command Pattern decouples object making a request from the one that knows how to perform it.
- A Command object is at the center of this decoupling and encapsulates a receiver with an action.
- An invoker makes a request of a Command object by calling its execute() method, which invokes those actions on the receiver.
- Invokers can be parameterized with Commands, even dynamically at runtime.
- Commands may support undo by implementing an undo() method that restores the object to its previous state before the execute() method was last called.
- MacroCommands are a simple extension of the Command Pattern that allow multiple commands to be invoked. 
  Likewise, MacroCommands can easily support undo().
- In practice, it’s not uncommon for “smart” Command objects to implement the request themselves rather than delegating to a receiver
- Commands may also be used to implement logging and transactional systems.
