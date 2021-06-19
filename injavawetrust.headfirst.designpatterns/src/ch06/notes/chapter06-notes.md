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

